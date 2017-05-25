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
 * Created by ayzr on 25.05.2017.
 */

public class Custom_order_adapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<String> mKisiListesi;


    public Custom_order_adapter(Activity activity, List<String> kisiler){
        //XML'i alıp View'a çevirecek inflater'ı örnekleyelim
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        //gösterilecek listeyi de alalım
        mKisiListesi = kisiler;
    }

    public Custom_order_adapter() {
    }

    @Override
    public int getCount() {
        return  mKisiListesi.size();
    }

    @Override
    public Object getItem(int position) {
        //şöyle de olabilir: public Object getItem(int position)
        return mKisiListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView = mInflater.inflate(R.layout.order_row, null);
        TextView textView =
                (TextView) satirView.findViewById(R.id.isimsoyisim);

String str = mKisiListesi.get(position);

        textView.setText(str);

        return satirView;
    }
}
