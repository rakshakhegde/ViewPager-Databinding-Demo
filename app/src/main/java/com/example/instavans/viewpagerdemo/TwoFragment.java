package com.example.instavans.viewpagerdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Instavans-CH on 4/4/2017.
 */

public class TwoFragment extends android.support.v4.app.Fragment implements TextSetter {

    private TextView textView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmenttwo,container,false);

        return v;



    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        textView = (TextView) view.findViewById(R.id.twoView);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void setText(String str) {
        textView.setText(str);
    }
}
