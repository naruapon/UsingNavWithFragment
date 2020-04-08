package com.example.thaivb.usingnavwithfragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SlideshowFragment extends androidx.fragment.app.Fragment {
    public SlideshowFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         return inflater.inflate(R.layout.fragment_slideshow, container, false);
    }
}
