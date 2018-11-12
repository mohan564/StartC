package com.coders3.startc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Button_Activity extends AppCompatActivity {

    CardView button_pro,button_intro,button_cult;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_);

        button_cult = findViewById(R.id.button_cult);
        button_intro = findViewById(R.id.button_intro);
        button_pro = findViewById(R.id.button_pro);
    }
    public void Click(View view)
    {
        int id = view.getId();
        if(id==button_intro.getId())
        {
            intent = new Intent(this,Button_introduction.class);
            startActivity(intent);
        }
        else if(id==button_cult.getId())
        {
            intent = new Intent(this,Button_Cultivation.class);
            startActivity(intent);
        }
        else if(id==button_pro.getId())
        {
            intent = new Intent(this,Button_products.class);
            startActivity(intent);
        }
    }
}
