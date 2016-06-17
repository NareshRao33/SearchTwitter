package search.twitter.activity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import search.twitter.adapter.DataAdapter;
import search.twitter.frisco.R;
import search.twitter.service.DownloadTwitterTask;
import search.twitter.service.dataModels.Searches;
import search.twitter.service.service.ServerResponse;

/**
 * Demonstrates how to use a twitter application keys to search
 */
public class MainActivity extends Activity implements ServerResponse {

	private ListActivity activity;
	String SearchTerm = "Trending";
	final static String LOG_TAG = "TWEET";
	String Key = null;
	String Secret = null;
	EditText mTextView;
	ListView mListView;
	ImageView mImageView;
	Button mButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_main);
		Key = getStringFromManifest("CONSUMER_KEY");
		Secret = getStringFromManifest("CONSUMER_SECRET");
		mTextView = (EditText)findViewById(R.id.search_edit_text);
		mListView = (ListView)findViewById(R.id.list_tweets);
		mImageView = (ImageView)findViewById(R.id.search_btn);
		mButton = (Button)findViewById(R.id.search);

		mButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				SearchTerm = mTextView.getText().toString();
				downloadSearches(SearchTerm);
			}
		});
		downloadSearches(SearchTerm);

	}

	private String getStringFromManifest(String key) {
		String results = null;

		try {
			Context context = this.getBaseContext();
			ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
			results = (String)ai.metaData.get(key);
		} catch (PackageManager.NameNotFoundException e) {
			e.printStackTrace();
		}
		return results;
	}

	// download twitter searches after  first checking to see if there is a network connection
	public void downloadSearches(String SearchTerm) {
		ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

		if (networkInfo != null && networkInfo.isConnected()) {

			new DownloadTwitterTask(this,this).execute(SearchTerm.equalsIgnoreCase("") ? "Trending":SearchTerm);
		} else {
			Log.v(LOG_TAG, "No network connection available.");
		}
	}

	@Override
	public void setData(Searches data) {

		DataAdapter mDataAdapter = new DataAdapter(MainActivity.this,data);
		mListView.setAdapter(mDataAdapter);
	}

}
