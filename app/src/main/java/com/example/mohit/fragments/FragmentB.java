package com.example.mohit.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FragmentB extends android.support.v4.app.Fragment {

    TextView tv;
    String data;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        if(!(savedInstanceState == null)){
            data = savedInstanceState.getString("data");
            tv = (TextView) view.findViewById(R.id.textviewb);
            tv.setText(data);
        }
        return view;
    }

    @Override
    public void on
    ActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tv = (TextView) getActivity().findViewById(R.id.textviewb);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("data",data);
    }

    public void setChangedData(String data) {
        this.data = data;
        tv.setText(data);
    }
}
