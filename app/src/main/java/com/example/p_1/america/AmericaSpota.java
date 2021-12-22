package com.example.p_1.america;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;

public class AmericaSpota extends AppCompatActivity {
    Button ambtn1;
    TextView tv1;
    ImageButton amspmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.america_spot1);

        ambtn1=(Button) findViewById(R.id.ambtn1);
        tv1=(TextView) findViewById(R.id.tv1);
        amspmap=(ImageButton) findViewById(R.id.amspmap);

        ambtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv1.getVisibility() == View.VISIBLE)

                    tv1.setVisibility(View.GONE);

                else

                    tv1.setVisibility(View.VISIBLE);


            }
        });
        amspmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.kr/maps/place/%EC%8A%A4%ED%85%8C%EC%B8%84+%EC%98%A4%EB%B8%8C+%EB%A6%AC%EB%B2%84%ED%8B%B0+%EA%B5%AD%EA%B0%80%EA%B8%B0%EB%85%90%EB%AC%BC/@40.6892494,-74.0466891,17z/data=!3m1!4b1!4m5!3m4!1s0x89c25090129c363d:0x40c6a5770d25022b!8m2!3d40.6892494!4d-74.0445004?hl=ko"));
                startActivity(intent);
            }
        });

    }

}
