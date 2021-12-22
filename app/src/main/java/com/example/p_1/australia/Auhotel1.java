package com.example.p_1.australia;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;

public class Auhotel1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auhotel1);
        final Gallery gallery=(Gallery)findViewById(R.id.gallery1);
        MyGlleryAdapter galAdapter = new MyGlleryAdapter(this);
        gallery.setAdapter(galAdapter);

    }
    public class MyGlleryAdapter extends BaseAdapter {
        Context context;
        Integer[] posterID = {R.drawable.auho1, R.drawable.auho2, R.drawable.auho3,
                R.drawable.auho4,R.drawable.auho5,R.drawable.auho6,R.drawable.auho7};

        public MyGlleryAdapter(Context c){
            context=c;
        }

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview=new ImageView(context);
            imageview.setLayoutParams(new Gallery.LayoutParams(200,300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5,5,5,5);
            imageview.setImageResource(posterID[position]);
            final int pos=position;
            imageview.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView ivPoster=(ImageView)findViewById(R.id.ivPoster1);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);


                    return false;
                }
            });

            return imageview;
        }
    }
}