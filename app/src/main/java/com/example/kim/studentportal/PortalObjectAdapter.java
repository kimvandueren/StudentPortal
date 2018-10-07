package com.example.kim.studentportal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

        holder.titleText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, WebviewActivity.class);
                intent.putExtra("Url", portalObject.getmUrlText());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPortalObject.size();
    }
}
