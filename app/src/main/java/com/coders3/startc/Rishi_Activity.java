package com.coders3.startc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Rishi_Activity extends AppCompatActivity {

    CardView reishi_intro,reishi_pro,reishi_cult;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rishi_);

        reishi_cult =findViewById(R.id.reishi_cult);
        reishi_intro = findViewById(R.id.reishi_intro);
        reishi_pro = findViewById(R.id.reishi_pro);
    }
    public void Click_Reishi(View view)
    {
        int id = view.getId();
        if(id==reishi_intro.getId())
        {
            intent = new Intent(this,Reishi_Intoduction.class);
            startActivity(intent);
        }
        else if(id==reishi_cult.getId())
        {
            intent = new Intent(this,Reishi_Cultivation.class);
            startActivity(intent);
        }
        else if(id==reishi_pro.getId())
        {
            intent = new Intent(this,Reishi_Products.class);
            startActivity(intent);
        }
    }
}
