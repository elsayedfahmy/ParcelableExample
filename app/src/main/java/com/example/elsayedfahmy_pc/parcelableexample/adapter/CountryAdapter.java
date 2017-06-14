package com.example.elsayedfahmy_pc.parcelableexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marwatalaat.mal2.R;
import com.example.marwatalaat.mal2.model.Country;

import java.util.List;

/**
 * Created by MarwaTalaat on 10/15/2016.
 */

public class CountryAdapter extends BaseAdapter {
    Context context;
    List<Country> countries;

    public CountryAdapter(Context context, List<Country> countries) {
        this.context = context;
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Country getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.country_row,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }


        Country item = getItem(position);
        holder.iv.setImageResource(item.getFlag());
        holder.tv.setText(item.getName());
        return convertView;
    }

    class ViewHolder{
        ImageView iv;
        TextView tv;
        ViewHolder(View v){
            iv = (ImageView) v.findViewById(R.id.imageView);
            tv = (TextView) v.findViewById(R.id.textView);


        }
    }
}











