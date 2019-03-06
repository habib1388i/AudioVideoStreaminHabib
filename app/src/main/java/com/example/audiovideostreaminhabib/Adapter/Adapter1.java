package com.example.audiovideostreaminhabib.Adapter;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.audiovideostreaminhabib.R;

import java.io.IOException;

public class Adapter1 extends RecyclerView.Adapter<OutViewHolder1> {
    MediaPlayer player;
    String[] namaHewan;
    int[] soundHewan;
    int[] gambarHewan;
    Context context;
    public Adapter1(Context context, String[] namaHewan, int[] gambarHewan, int[] soundHewan) {
        this.context = context;
        this.gambarHewan = gambarHewan;
        this.soundHewan = soundHewan;
        this.namaHewan = namaHewan;
    }

    @NonNull
    @Override
    public OutViewHolder1 onCreateViewHolder(@NonNull ViewGroup viewGroup,final int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.tampilan_fragment1, null);
        return new OutViewHolder1(v, context);
    }

    @Override
    public void onBindViewHolder(@NonNull OutViewHolder1 outViewHolder1, final int i) {
        outViewHolder1.imgAnimals.setImageResource(gambarHewan[i]);
        outViewHolder1.nameAnimals.setText(namaHewan[i]);
        outViewHolder1.soundAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button hwn = v.findViewById(R.id.btn_hewan);

        Uri uri = Uri.parse("android.resource://" + context.getPackageName() + "/" + soundHewan[i]);
        if(hwn.isClickable()) {
            player = new MediaPlayer();
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);


            try {
                player.setDataSource(context
                        , uri);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            try {
                player.prepare();
            } catch (IOException e) {
                e.printStackTrace();
            }
            player.start();
        }

    }
});
        }



    @Override
    public int getItemCount() {
        return namaHewan.length;
    }
}
