package com.example.ayzr.nepismis_v00;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ayzr on 2.06.2017.
 */

public class CommentAdapter extends BaseAdapter
{
    private LayoutInflater mInflater;
    private List<String>   mCommentList;

    public CommentAdapter(Activity activity, List<String> comments) {
        //XML'i alıp View'a çevirecek inflater'ı örnekleyelim
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //gösterilecek listeyi de alalım
        mCommentList = comments;
    }

    @Override
    public int getCount() {
        return mCommentList.size();
    }

    @Override
    public String getItem(int position) {
        //şöyle de olabilir: public Object getItem(int position)
        return mCommentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satirView;
        satirView = mInflater.inflate(R.layout.comment_textview_design, null);
        TextView textView = (TextView) satirView.findViewById(R.id.text_comment_name);


        String kisi = mCommentList.get(position);
        textView.setText(kisi);
        return satirView;
    }
}
