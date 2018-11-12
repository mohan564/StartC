package com.coders3.startc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Oyster_Activity extends AppCompatActivity {

    CardView oyster_intro,oyster_pro,oyster_cult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyster_);

        oyster_cult = findViewById(R.id.oyster_cult);
        oyster_intro = findViewById(R.id.oyster_intro);
        oyster_pro = findViewById(R.id.oyster_pro);

    }
    public void Click_Oyster(View view)
    {
        Intent intent;
        int id = view.getId();
        if(id==oyster_intro.getId())
        {
            intent = new Intent(this,Oyster_introduction.class);
            startActivity(intent);
        }
        else if(id==oyster_pro.getId())
        {
            intent = new Intent(this,Oyster_Products.class);
            startActivity(intent);
        }
        else if(id==oyster_cult.getId())
        {
            intent = new Intent(this,Oyster_Cultivation.class);
            startActivity(intent);
        }

    }
}
