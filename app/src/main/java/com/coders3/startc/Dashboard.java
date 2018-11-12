package com.coders3.startc;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Hp- on 6/28/2018.
 */

public class Dashboard extends Fragment {


    CardView button,rishi,shiitake,oyster;
    Intent intent;
    ImageView button_image,shiitake_image,oyster_image,rishi_image;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dashboard,container,false);
        button_image = view.findViewById(R.id.button_image);
        button = view.findViewById(R.id.button);
        rishi = view.findViewById(R.id.rishi);
        oyster = view.findViewById(R.id.oyster);
        shiitake = view.findViewById(R.id.shiitake);
        //button_image = view.findViewById(R.id.button_image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "Button Clicked", Toast.LENGTH_SHORT).show();
                 intent = new Intent(getActivity(),Button_Activity.class);
                 ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),view.findViewById(R.id.button_image),"transition_button");
                 startActivity(intent,compat.toBundle());
            }
        });

        rishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "Rishi Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(getActivity(),Rishi_Activity.class);
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),view.findViewById(R.id.rishi_image),"transition_rishi");
                startActivity(intent,compat.toBundle());
            }
        });


        shiitake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "Shiitake Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(getActivity(),Shiitake_Activity.class);
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),view.findViewById(R.id.shiitake_image),"transition_shiitake");
                startActivity(intent,compat.toBundle());
            }
        });

        oyster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(), "Oyster CLicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(getActivity(),Oyster_Activity.class);
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),view.findViewById(R.id.oyster_image),"transition_oyster");
                startActivity(intent,compat.toBundle());
            }
        });

        return view;
    }

}
