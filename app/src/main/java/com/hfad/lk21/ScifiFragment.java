package com.hfad.lk21;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class ScifiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView scifiRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_scifi, container, false);

        String[] scifiNames = new String[Scifi.scifis.length];
        for (int i = 0; i < scifiNames.length; i++) {
            scifiNames[i] = Scifi.scifis[i].getName();
        }

        int[] scifiImages = new int[Scifi.scifis.length];
        for (int i = 0; i < scifiImages.length; i++) {
            scifiImages[i] = Scifi.scifis[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(scifiNames,scifiImages);
        scifiRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        scifiRecycler.setLayoutManager(layoutManager);
        return scifiRecycler;
    }
}