package com.example.mohit.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentA extends Fragment implements View.OnClickListener{

    Button bt;
    int cnt = 0;

    Communicator comm;

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        if(!(savedInstanceState == null)){
            cnt = savedInstanceState.getInt("counter");
        }
        else {
            cnt = 0;
        }

        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        bt = (Button) getActivity().findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("counter",cnt);
    }

    @Override
    public void onClick(View v) {
        if(v == bt) {
            cnt++;
            comm.respond(Integer.toString(cnt));
        }
    }
}
