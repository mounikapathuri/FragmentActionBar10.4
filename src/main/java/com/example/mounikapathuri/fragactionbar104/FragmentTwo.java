package com.example.mounikapathuri.fragactionbar104;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

/**
 * Created by mounikapathuri on 21-02-2018.
 */

public class FragmentTwo extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflating layout fragment_two
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        TextView videoText = (TextView) view.findViewById(R.id.tvVideoFragment);
        //Toast.makeText(getContext()," YOU CLICKED VIDEO ", Toast.LENGTH_LONG).show();
        return view;
    }
}
