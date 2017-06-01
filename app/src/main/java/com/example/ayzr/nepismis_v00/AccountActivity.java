package com.example.ayzr.nepismis_v00;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

    }

    public void btn_profile_clicked(View view){
        startActivity(new Intent(this,Profile_Activity.class));
    }

    public void btn_comment_clicked(View view){

    }


}
