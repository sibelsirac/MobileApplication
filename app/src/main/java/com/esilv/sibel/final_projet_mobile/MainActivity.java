package com.esilv.sibel.final_projet_mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements OnStationSelectedListener{
    private static final String STATIONS_URL = "https://www.googleapis.com/youtube/v3/search/?part=snippet&maxResults=25&q=dog&key=AIzaSyDOQnMae9ppLlPg7v6gLtchFvprTyZ4srs";
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   contractName = getIntent().getStringExtra(CONTRACT);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getStations();
        //This view only exists in the tablet layout. This means that if it isn't null, we are running our app on a tablet.

    }



    private void getStations() {
        StringRequest stationsRequest = new StringRequest(STATIONS_URL , new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //parse data from webservice to get Contracts as Java object
                 video  movie = new Gson().fromJson(response, video.class);
                 ArrayList<Item> movies=movie.getitems();
                setAdapter(movie.getitems());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Contracts", "Error");
            }
        });

        Volley.newRequestQueue(this).add(stationsRequest);
    }
    private void setAdapter(Videos stations) {
        StationAdapter adapter = new StationAdapter(stations);
        adapter.setOnStationSelectedListener(this);
        recyclerView.setAdapter(adapter);
    }



    @Override
    public void onStationSelected(Item station) {
        VideoActivityBis.start(this, station.getEtag());
    }
}
