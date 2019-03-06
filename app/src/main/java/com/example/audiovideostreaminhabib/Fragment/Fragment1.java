package com.example.audiovideostreaminhabib.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.audiovideostreaminhabib.Adapter.Adapter1;
import com.example.audiovideostreaminhabib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    Adapter1 adapter;
    RecyclerView rvHewan;
    String[] namaHewan = {"DOG", "MONKEY", "PIG", "SNAKE", "TIGER"};
    int[] gambarHewan = {R.drawable.dog, R.drawable.monkey, R.drawable.pig, R.drawable.snake, R.drawable.tiger};
    int[] soundHewan = {R.raw.bark, R.raw.rmonkeycolobus, R.raw.pig, R.raw.pig, R.raw.snakehit2, R.raw.tiger};


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        rvHewan = view.findViewById(R.id.rv1);
        rvHewan.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        adapter = new Adapter1(getActivity(), namaHewan, gambarHewan, soundHewan);
        rvHewan.setAdapter(adapter);
        return view;
    }

}
