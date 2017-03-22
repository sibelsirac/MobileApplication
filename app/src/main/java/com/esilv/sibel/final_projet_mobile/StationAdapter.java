package com.esilv.sibel.final_projet_mobile;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class StationAdapter extends RecyclerView.Adapter<StationsViewHolder> {

    private final Videos stations;
    private OnStationSelectedListener onStationSelectedListener;

    public StationAdapter(Videos stations) {
        this.stations = stations;
    }

    @Override
    public StationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholdeer_station, parent, false);
        return new StationsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StationsViewHolder holder, int position) {
        holder.setOnStationSelectedListener(onStationSelectedListener);
        holder.bind(stations.get(position));
    }

    @Override
    public int getItemCount() {
        return stations != null ? stations.size() : 0;
    }

    public void setOnStationSelectedListener(OnStationSelectedListener onStationSelectedListener) {
        this.onStationSelectedListener = onStationSelectedListener;
    }
}
