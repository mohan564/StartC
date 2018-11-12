package com.coders3.startc;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigationView;
    CardView button,rishi,shiitake,oyster;
    FrameLayout frame ;
    Intent intent;
    ImageView button_image;
    static private final String site = "http://www.gmail.com";

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         navigationView = findViewById(R.id.bottom_nav);
         frame = findViewById(R.id.frame);

         FragmentTransaction ft = getFragmentManager().beginTransaction();
         ft.add(R.id.frame,new Dashboard());
         ft.commit();

         navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                int id = item.getItemId();

                if(id == R.id.home)
                {
                    fragment = new Dashboard();
                }
                else if(id == R.id.from_where)
                {
                    fragment = new Account();
                }
                else if(id == R.id.feedback)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(site));
                    startActivity(intent);
                }
                if(fragment!=null)
                {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frame,fragment);
                    ft.commit();
                }
                return true;

            }
        });
    }

}
