package com.riad.dictionary.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.riad.dictionary.R;
import com.riad.dictionary.WordMeaningActivity;

public class FragmentDefinition extends Fragment {
    public FragmentDefinition() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition,container, false);//Inflate Layout


        Context context=getActivity();
        TextView text = (TextView) view.findViewById(R.id.textViewD);
        TextView textView=(TextView) view.findViewById(R.id.textViewCatogory);

        String en_definition= ((WordMeaningActivity)context).enDefinition;
        String Category=((WordMeaningActivity)context).category;


        text.setText(en_definition);
        if(en_definition==null)
        {
            text.setText("No definition found");
        }

        textView.setText(Category);
        if(Category==null)
        {
            textView.setText("No category found");


        }
        else{
            textView.setText("Category: "+ Category);
        }
        return view;
    }
}
