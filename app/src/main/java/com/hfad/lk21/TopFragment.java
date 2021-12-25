package com.hfad.lk21;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class TopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView topRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_top, container, false);

        String[] topNames = new String[Top.tops.length];
        for (int i = 0; i < topNames.length; i++) {
            topNames[i] = Top.tops[i].getName();
        }

        int[] topImages = new int[Top.tops.length];
        for (int i = 0; i < topImages.length; i++) {
            topImages[i] = Top.tops[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(topNames,topImages);
        topRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        topRecycler.setLayoutManager(layoutManager);
        return topRecycler;
    }
}