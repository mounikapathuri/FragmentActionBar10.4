package com.example.mounikapathuri.fragactionbar104;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

/**
 * Created by mounikapathuri on 23-02-2018.
 */

public class FragmentOne extends Fragment{

    public FragmentOne(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_one,container,false);
        TextView textView = (TextView) view.findViewById(R.id.tvAudioFragment);
       // Toast.makeText(getContext()," YOU CLICKED AUDIO ", Toast.LENGTH_LONG).show();

        return view;
    }
}
