package com.example.sampletestproject;

import android.app.ActivityOptions;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    AppCompatButton button;
    AppCompatButton button1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        button = view.findViewById(R.id.Button_first);
        button1 = view.findViewById(R.id.Button_third);

//        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment,null));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragmentDirections.ActionFirstFragmentToNavigation2 action = FirstFragmentDirections.actionFirstFragmentToNavigation2();
                action.setAmount(300);
                Navigation.findNavController(button)
                        .navigate(action);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragmentDirections.ActionFirstFragmentToThirdFragment action = FirstFragmentDirections.actionFirstFragmentToThirdFragment();
                action.setValue("test set String value");
                Navigation.findNavController(button1).navigate(action);
            }
        });
        return view;
    }
}
