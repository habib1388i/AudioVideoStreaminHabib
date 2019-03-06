package com.example.audiovideostreaminhabib.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.audiovideostreaminhabib.R;

class OutViewHolder1 extends RecyclerView.ViewHolder {
    ImageView imgAnimals;
    TextView nameAnimals;
    Button soundAnimals;
    public OutViewHolder1(@NonNull View itemView, Context context) {
        super(itemView);
        imgAnimals = itemView.findViewById(R.id.img_hewan);
        nameAnimals = itemView.findViewById(R.id.tv_hewan);
        soundAnimals = itemView.findViewById(R.id.btn_hewan);
    }

    private void off(View... views) {
        for (View v : views) {
            v.setEnabled(false);
        }
    }

    private void on(View...views) {
        for (View v : views) {
            v.setEnabled(true);
        }

    }
}


