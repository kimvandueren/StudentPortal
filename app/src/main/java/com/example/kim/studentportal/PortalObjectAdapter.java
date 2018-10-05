package com.example.kim.studentportal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PortalObjectAdapter extends RecyclerView.Adapter<PortalObjectViewHolder> {
    private Context context;
    public List<PortalObject> listPortalObject;

    public PortalObjectAdapter(Context context, List<PortalObject> listPortalObject){
        this.context = context;
        this.listPortalObject = listPortalObject;
    }

    @NonNull
    @Override
    public PortalObjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_cell, parent, false);
        return new PortalObjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortalObjectViewHolder holder, final int position) {
        final PortalObject portalObject = listPortalObject.get(position);
        holder.titleText.setText(portalObject.getmTitleText());
    }

    @Override
    public int getItemCount() {
        return listPortalObject.size();
    }
}
