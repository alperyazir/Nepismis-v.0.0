package com.example.ayzr.nepismis_v00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile_Activity extends AppCompatActivity {

    private Button profile_arrow;
    private Button account_arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        profile_arrow = (Button) findViewById(R.id.btn_profile_arrow);
        account_arrow = (Button) findViewById(R.id.btn_account_arrow);
    }
    public void btn_profile_arrow_clicked(View view){
        profile_arrow.setBackgroundResource(R.drawable.right_arrow);

    }

    public void btn_account_arrow_clicked(View view){
        account_arrow.setBackgroundResource(R.drawable.right_arrow);
    }
}
