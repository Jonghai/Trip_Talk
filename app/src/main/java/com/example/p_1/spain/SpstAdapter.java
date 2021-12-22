package com.example.p_1.spain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.p_1.R;
import com.example.p_1.australia.AuStData;

import java.util.ArrayList;

public class SpstAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<AuStData> sample;

    public SpstAdapter(Context context, ArrayList<AuStData> data) {
        mContext = context;
        sample = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return sample.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public AuStData getItem(int position) {
        return sample.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.spstdesign, null);

        ImageView imageView = (ImageView)view.findViewById(R.id.img);
        TextView country = (TextView)view.findViewById(R.id.country);
        TextView city = (TextView)view.findViewById(R.id.city);
        RatingBar ratingBar = (RatingBar)view.findViewById(R.id.RatingBar);
        TextView srating = (TextView)view.findViewById(R.id.Srating);

        imageView.setImageResource(sample.get(position).getImg());
        country.setText(sample.get(position).getCountry());
        city.setText(sample.get(position).getCity());
        ratingBar.setRating(sample.get(position).getRating());
        srating.setText(sample.get(position).getSrating());


        return view;
    }
}
