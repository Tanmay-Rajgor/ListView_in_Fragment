package com.tanmay.listfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class FragmentSecond extends Fragment {
    ImageView imageView;


    public FragmentSecond() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second2, container, false);
        imageView = view.findViewById(R.id.imageView);
        Bundle bundle = getArguments();
        int position = bundle.getInt("position",0);

        if(position == 0){
              imageView.setImageResource(R.drawable.image);
        }
        else if(position == 1){
              imageView.setImageResource(R.drawable.image);
        }
        else if(position == 2){
            imageView.setImageResource(R.drawable.image);
        }
        else if(position == 3){
            imageView.setImageResource(R.drawable.image);
        }
        return view;
    }
}