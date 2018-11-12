package com.coders3.startc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Shiitake_Activity extends AppCompatActivity {

    CardView shi_intro,shi_cult,shi_pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiitake_);

        shi_intro = findViewById(R.id.shi_intro);
        shi_cult = findViewById(R.id.shi_cult);
        shi_pro = findViewById(R.id.shi_pro);
    }
    public void Shi_Click(View view)
    {
        int id = view.getId();
        Intent intent;
        if(id==shi_intro.getId())
        {
            intent = new Intent(this,Shiitake_Introduction.class);
            startActivity(intent);
        }
        else if(id==shi_pro.getId())
        {
            intent =new Intent(this,Shiitake_Products.class);
            startActivity(intent);
        }
        else if(id==shi_cult.getId())
        {
            intent = new Intent(this,Shiitake_Cultivation.class);
            startActivity(intent);
        }

    }
}
