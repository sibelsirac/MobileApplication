package com.esilv.sibel.final_projet_mobile;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class StationsViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView address;
    private OnStationSelectedListener onStationSelectedListener;

    public StationsViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        address = (TextView) itemView.findViewById(R.id.address);
    }

    public void bind(final Item station) {
        name.setText(station.getEtag());
        address.setText(station.getId().getId());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onStationSelectedListener == null) {
                    return;
                }
                onStationSelectedListener.onStationSelected(station);
            }
        });
    }

    public void setOnStationSelectedListener(OnStationSelectedListener onStationSelectedListener) {
        this.onStationSelectedListener = onStationSelectedListener;
    }
}
