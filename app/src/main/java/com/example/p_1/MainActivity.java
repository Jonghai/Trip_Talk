package com.example.p_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.america.BottomGwang;
import com.example.p_1.australia.AuBottomGwang;
import com.example.p_1.spain.SpBottomGwang;

public class MainActivity extends AppCompatActivity {

    // 초기변수 설정
    // 바텀 다이얼로그 띄우기 버튼
    private ImageButton Newyorkbtn, Spainbtn, Australiabtn;
    private ImageButton talk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Newyorkbtn = findViewById(R.id.Newyorkbtn);
        Spainbtn = findViewById(R.id.Spainbtn);
        Australiabtn = findViewById(R.id.Australiabtn);
        talk = findViewById(R.id.talk);

        Newyorkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomGwang bottomSheetDialog = new BottomGwang();
                bottomSheetDialog.show(getSupportFragmentManager(), "AmBottomSheet");

            }
        });

        Spainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpBottomGwang bottomSheetDialog = new SpBottomGwang();
                bottomSheetDialog.show(getSupportFragmentManager(), "SpBottomSheet");
            }
        });

        Australiabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AuBottomGwang bottomSheetDialog = new AuBottomGwang();
                bottomSheetDialog.show(getSupportFragmentManager(), "AuBottomSheet");
            }
        });
        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainPostActivity.class));
            }
        });

    }
}

