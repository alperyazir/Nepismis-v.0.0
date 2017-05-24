package com.example.ayzr.nepismis_v00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_cook_clicked(View view){
        startActivity(new Intent(this,LoginActivity.class));
    }
    public void button_market_clicked(View view){
        startActivity(new Intent(this,LoginActivity.class));
    }
    public void button_courier_clicked(View view){
        startActivity(new Intent(this,LoginActivity.class));
    }
}
