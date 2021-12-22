package com.example.p_1.america;

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

public class AmHotel1 extends AppCompatActivity {

    private ImageButton amhomap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amhotel1);
        final Gallery gallery=(Gallery)findViewById(R.id.gallery2);
        MyGlleryAdapter galAdapter = new MyGlleryAdapter(this);
        gallery.setAdapter(galAdapter);
        amhomap = (ImageButton)findViewById(R.id.amhomap);

        amhomap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/travel/hotels/%EB%AF%B8%EA%B5%AD/entity/ChYI6cOnv8Hx1KOvARoJL20vMDM0OHFwEAE/location?g2lb=2502548%2C2503781%2C4258168%2C4270442%2C4306835%2C4317915%2C4371335%2C4401769%2C4419364%2C4482438%2C4486153%2C4492925%2C4509341%2C4536454%2C4545889%2C4564872%2C4568542%2C4572474%2C4270859%2C4284970%2C4291517&hl=ko-KR&gl=kr&ssta=1&ap=aAE&q=%EB%AF%B8%EA%B5%AD%20%EC%88%99%EB%B0%95%EC%97%85%EC%86%8C&rp=EOacws24gauntwEQhJvEzt34sfmCARDt3-3dvO7O4LEBELSwvrzP2YK7yQE4AUAASAKiAQbrr7jqta0&ictx=1&sa=X&utm_campaign=sharing&utm_medium=link&utm_source=htls&ts=CAESCgoCCAMKAggDEAAaKgoMEgg6BuuvuOq1rRoAEhoSFAoHCOUPEAYYDhIHCOUPEAYYDxgBMgIQACoLCgcoAToDS1JXGgA&ved=0CAAQ5JsGahcKEwiA_p7AsJTxAhUAAAAAHQAAAAAQAg"));
                startActivity(intent);
            }
        });

    }


    public class MyGlleryAdapter extends BaseAdapter {
        Context context;
        Integer[] posterID = {R.drawable.amho1, R.drawable.amho2, R.drawable.amho3,
                R.drawable.amho4,R.drawable.amho5,R.drawable.amho6,R.drawable.amho7};

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
                    ImageView ivPoster=(ImageView)findViewById(R.id.ivPoster2);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);


                    return false;
                }
            });

            return imageview;
        }
    }

}