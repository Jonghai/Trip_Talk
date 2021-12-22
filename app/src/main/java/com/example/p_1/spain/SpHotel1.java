package com.example.p_1.spain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;

public class SpHotel1 extends AppCompatActivity {
    private ImageButton sphomap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sphotel);
        final Gallery gallery=(Gallery)findViewById(R.id.gallery3);
        MyGlleryAdapter galAdapter = new MyGlleryAdapter(this);
        gallery.setAdapter(galAdapter);
        sphomap = (ImageButton)findViewById(R.id.sphomap);

        sphomap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/travel/hotels/%EC%8A%A4%ED%8E%98%EC%9D%B8/entity/CgoIk-_X5Z2g9LdTEAE/location?g2lb=2502548%2C2503781%2C4258168%2C4270442%2C4306835%2C4317915%2C4371335%2C4401769%2C4419364%2C4482438%2C4486153%2C4492925%2C4509341%2C4536454%2C4545889%2C4564872%2C4568542%2C4572474%2C4270859%2C4284970%2C4291517&hl=ko-KR&gl=kr&ssta=1&ap=aAE&q=%EC%8A%A4%ED%8E%98%EC%9D%B8%20%EC%88%99%EB%B0%95%EC%8B%9C%EC%84%A4&rp=EJPv1-WdoPS3UxCuroq1gIfVo2kQhaqlsbPJ4pDHARC8oaGPg-210c4BOAFAAEgCogEJ7Iqk7Y6Y7J24wAEDyAEA&ictx=1&utm_campaign=sharing&utm_medium=link&utm_source=htls&ts=CAESABogCgIaABIaEhQKBwjlDxAGGBgSBwjlDxAGGBkYATICEAAqCQoFOgNLUlcaAA&ved=0CAAQ5JsGahcKEwjIyOPWsJTxAhUAAAAAHQAAAAAQEg"));
                startActivity(intent);
            }
        });

    }
    public class MyGlleryAdapter extends BaseAdapter {
        Context context;
        Integer[] posterID = {R.drawable.spho1, R.drawable.spho2, R.drawable.spho3,
                R.drawable.spho4,R.drawable.spho5,R.drawable.spho6,R.drawable.spho7};

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
                    ImageView ivPoster=(ImageView)findViewById(R.id.ivPoster3);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);


                    return false;
                }
            });

            return imageview;
        }
    }
}