package com.example.ayzr.nepismis_v00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CommentActivity extends AppCompatActivity {

    final List<String> comments=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        comments.add(0,"neşet");
        comments.add(1,"izzet");
        comments.add(2,"mahsuni");
        comments.add(3,"muarrem");
        comments.add(4,"hamido");
        comments.add(5,"salako");

        ListView listView = (ListView) findViewById(R.id.list_comments);
        CommentAdapter adapter = new CommentAdapter(this,comments);
        listView.setAdapter(adapter);
    }
}
