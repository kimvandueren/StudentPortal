package com.example.kim.studentportal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PortalObjectViewHolder extends RecyclerView.ViewHolder {
    public TextView titleText;
    public View view;

    public PortalObjectViewHolder(@NonNull View itemView) {
        super(itemView);
        titleText = itemView.findViewById(R.id.titleTextView);
        view = itemView;
    }
}
