package com.esilv.sibel.final_projet_mobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by sibel on 22/03/2017.
 */


public class VideoActivityBis extends AppCompatActivity implements OnStationSelectedListener {

    private static final String VIDEO = "CONTRACT";
    private static final String VIDEO_URL = "https://api.jcdecaux.com/vls/v1/stations?contract=";
    private RecyclerView recyclerView;
    private String contractName;
    private boolean twoPane;

    public static void start(Context context, String contractName) {
        Intent intent = new Intent(context, VideoActivityBis.class);
        intent.putExtra(VIDEO, contractName);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_bis);
        contractName = getIntent().getStringExtra(VIDEO);
        TextView name = (TextView)findViewById(R.id.name);
        TextView address = (TextView)findViewById(R.id.address);
        name.setText(contractName);
        //address.setText();


    }



    @Override
    public void onStationSelected(Item station) {

    }
}

