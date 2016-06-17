package search.twitter.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Base64;

import com.google.gson.Gson;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import search.twitter.service.dataModels.Authenticated;
import search.twitter.service.dataModels.SearchResults;
import search.twitter.service.dataModels.Searches;
import search.twitter.service.service.ServerResponse;


/**
 * Created by NRAO on 6/16/2016.
 */
public class DownloadTwitterTask extends AsyncTask<String, Void, String> {
    final static String TwitterTokenURL = "https://api.twitter.com/oauth2/token";
    final static String TwitterSearchURL = "https://api.twitter.com/1.1/search/tweets.json?q=";
    final static String LOG_TAG = "TWEET";
    String Key = null;
    String Secret = null;
    Context mContext;
    ServerResponse mServerResponse;
    ProgressDialog mProgressDialog;

    public DownloadTwitterTask(Context mContext, ServerResponse mServerResponse) {
        this.mContext = mContext;
        this.mServerResponse = mServerResponse;
        mProgressDialog = new ProgressDialog(mContext);
        mProgressDialog.setMessage("Downloading data...");
        Key = getStringFromManifest("CONSUMER_KEY");
        Secret = getStringFromManifest("CONSUMER_SECRET");
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressDialog.show();
    }

    @Override
    public String doInBackground(String... searchTerms) {
        String result = null;

        if (searchTerms.length > 0) {
            result = getSearchStream(searchTerms[0]);

        }
        return result;
    }

    @Override
    public void onPostExecute(String result) {
        super.onPostExecute(result);
        mProgressDialog.cancel();
        Searches searches = jsonToSearches(result);
        System.out.println(searches.size()+" Data size of the array index lengthnhjfsbhhdjfvh");
        mServerResponse.setData(searches);
    }


    // converts a string of JSON data into a SearchResults object
    private Searches jsonToSearches(String result) {
        Searches searches = null;
        if (result != null && result.length() > 0) {
            try {
                Gson gson = new Gson();
                // bring back the entire search object
                SearchResults sr = gson.fromJson(result, SearchResults.class);
                // but only pass the list of tweets found (called statuses)
                searches = sr.getStatuses();
            } catch (IllegalStateException ex) {
                // just eat the exception for now, but you'll need to add some handling here
            }
        }
        return searches;
    }

    // convert a JSON authentication object into an Authenticated object
    private Authenticated jsonToAuthenticated(String rawAuthorization) {
        Authenticated auth = null;
        if (rawAuthorization != null && rawAuthorization.length() > 0) {
            try {
                Gson gson = new Gson();
                auth = gson.fromJson(rawAuthorization, Authenticated.class);
            } catch (IllegalStateException ex) {
                // just eat the exception for now, but you'll need to add some handling here
            }
        }
        return auth;
    }

    private String getStringFromManifest(String key) {
        String results = null;

        try {
           ;
            ApplicationInfo ai = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), PackageManager.GET_META_DATA);
            results = (String)ai.metaData.get(key);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return results;
    }

    private String getResponseBody(HttpRequestBase request) {
        StringBuilder sb = new StringBuilder();
        try {

            DefaultHttpClient httpClient = new DefaultHttpClient(new BasicHttpParams());
            HttpResponse response = httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            String reason = response.getStatusLine().getReasonPhrase();

            if (statusCode == 200) {

                HttpEntity entity = response.getEntity();
                InputStream inputStream = entity.getContent();

                BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
                String line = null;
                while ((line = bReader.readLine()) != null) {
                    sb.append(line);
                }
            } else {
                sb.append(reason);
            }
        } catch (UnsupportedEncodingException ex) {
        } catch (ClientProtocolException ex1) {
        } catch (IOException ex2) {
        }
        return sb.toString();
    }

    private String getStream(String url) {
        String results = null;

        // Step 1: Encode consumer key and secret
        try {
            // URL encode the consumer key and secret
            String urlApiKey = URLEncoder.encode(Key, "UTF-8");
            String urlApiSecret = URLEncoder.encode(Secret, "UTF-8");

            // Concatenate the encoded consumer key, a colon character, and the encoded consumer secret
            String combined = urlApiKey + ":" + urlApiSecret;

            // Base64 encode the string
            String base64Encoded = Base64.encodeToString(combined.getBytes(), Base64.NO_WRAP);

            // Step 2: Obtain a bearer token
            HttpPost httpPost = new HttpPost(TwitterTokenURL);
            httpPost.setHeader("Authorization", "Basic " + base64Encoded);
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            httpPost.setEntity(new StringEntity("grant_type=client_credentials"));
            String rawAuthorization = getResponseBody(httpPost);
            Authenticated auth = jsonToAuthenticated(rawAuthorization);

            // Applications will verify that the value associated with the
            // token_type key of the returned object is bearer
            if (auth != null && auth.token_type.equals("bearer")) {

                // Step 3: Authenticate API requests with bearer token
                HttpGet httpGet = new HttpGet(url);

                // construct a normal HTTPS request and include an Authorization
                // header with the value of Bearer <>
                httpGet.setHeader("Authorization", "Bearer " + auth.access_token);
                httpGet.setHeader("Content-Type", "application/json");
                // update the results with the body of the response
                results = getResponseBody(httpGet);
            }
        } catch (UnsupportedEncodingException ex) {
        } catch (IllegalStateException ex1) {
        }
        return results;
    }

    private String getSearchStream(String searchTerm) {
        String results = null;
        try {
            String encodedUrl = URLEncoder.encode(searchTerm, "UTF-8");
            results = getStream(TwitterSearchURL + encodedUrl);
        } catch (UnsupportedEncodingException ex) {
        } catch (IllegalStateException ex1) {
        }
        return results;
    }
}