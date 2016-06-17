package search.twitter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import search.twitter.frisco.R;
import search.twitter.activity.MainActivity;
import search.twitter.service.dataModels.Searches;


/**
 * Created by NRAO on 6/16/2016.
 */
public class DataAdapter extends BaseAdapter {

    MainActivity activity;
    Context mContext;
    Searches mSearches;


    public DataAdapter(MainActivity activity, Searches data) {
        this.activity = activity;
        this.mContext = mContext;
        mSearches = data;

    }

    public int getCount() {
        // TODO Auto-generated method stub
        return mSearches.size();
    }


    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mSearches.get(position);
    }


    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater mInflater;
        if(convertView == null) {
            mInflater = LayoutInflater.from(activity);

            convertView = mInflater.inflate(R.layout.tweet_details, null);
            holder = new ViewHolder();
            holder.feed = (TextView)convertView.findViewById(R.id.tweet);
            holder.description = (TextView)convertView.findViewById(R.id.tweetDescription);
            holder.userName = (TextView)convertView.findViewById(R.id.profilename);
            holder.usertagname = (TextView)convertView.findViewById(R.id.alias);
            holder.profilePicture = (ImageView)convertView.findViewById(R.id.profileImage);
            holder.profileBackground = (ImageView)convertView.findViewById(R.id.backgroundImage);
           // holder.mImageView = (ImageView)convertView.findViewById(R.id.imageView);

            convertView.setTag(holder);
        }else {

            holder = (ViewHolder)convertView.getTag();
        }
        holder.feed.setText(mSearches.get(position).getText());
        holder.description.setText(mSearches.get(position).getUser().getDescription());
        holder.userName.setText(mSearches.get(position).getUser().getName());
        holder.usertagname.setText(mSearches.get(position).getUser().getScreenName());

        //Glide.with(activity).load(mSearches.get(position).).centerCrop().into(holder.profilePicture);
        Glide.with(activity).load(mSearches.get(position).getUser().getProfileImageUrl()).centerCrop().override(100,100).
        into(holder.profilePicture);
        return convertView;
    }

    class ViewHolder {

        TextView feed,description,userName,usertagname;
        ImageView mImageView,profilePicture,profileBackground;
    }

}
