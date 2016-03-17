package com.example.android.sunshine.app;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*
        final ListView listView = (ListView) findViewById(R.id.listView);
        String[] data = {
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7"
        };
        final ArrayList<String> weekForecast = new ArrayList<>(Arrays.asList(data));
        mForecastAdapter =
                                new ArrayAdapter<String>(
                                            getActivity(), // The current context (this activity)
                                            R.layout.list_item_forecast, // The name of the layout ID.
                                            R.id.list_item_forecast_textview, // The ID of the textview to populate.
                                            weekForecast);

                View rootView = inflater.inflate(R.layout.fragment_main, container, false);

                            // Get a reference to the ListView, and attach this adapter to it.
                    ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
                    listView.setAdapter(mForecastAdapter);
*/

    }







    /*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                        Bundle savedInstanceState) {

                               // Create some dummy data for the ListView.  Here's a sample weekly forecast
                                        String[] data = {
                                        "Mon 6/23 - Sunny - 31/17",
                                        "Tue 6/24 - Foggy - 21/8",
                                        "Wed 6/25 - Cloudy - 22/17",
                                        "Thurs 6/26 - Rainy - 18/11",
                                        "Fri 6/27 - Foggy - 21/10",
                                       "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                                       "Sun 6/29 - Sunny - 20/7"
                                        };
                        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static class MainActivityFragment extends Fragment {
        ArrayAdapter<String> mForecastAdapter;
        public MainActivityFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            String[] data = {
                    "Mon 6/23 - Sunny - 31/17",
                    "Tue 6/24 - Foggy - 21/8",
                    "Wed 6/25 - Cloudy - 22/17",
                    "Thurs 6/26 - Rainy - 18/11",
                    "Fri 6/27 - Foggy - 21/10",
                    "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                    "Sun 6/29 - Sunny - 20/7"
            };
            ArrayList<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
            mForecastAdapter =
                    new ArrayAdapter<String>(
                            getActivity(), // The current context (this activity)
                            R.layout.list_item_forecast, // The name of the layout ID.
                            R.id.list_item_forecast_textview, // The ID of the textview to populate.
                            weekForecast);
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ListView lv=(ListView) rootView.findViewById(R.id.listview_forecast);
            lv.setAdapter(mForecastAdapter);

            return rootView;

        }
    }
}
