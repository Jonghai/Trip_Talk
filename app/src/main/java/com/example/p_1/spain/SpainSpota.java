package com.example.p_1.spain;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;

public class SpainSpota extends AppCompatActivity {
    Button spbtn1;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spain_spota);

        spbtn1=(Button) findViewById(R.id.spbtn1);
        tv3=(TextView) findViewById(R.id.tv3);

        spbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv3.getVisibility() == View.VISIBLE)

                    tv3.setVisibility(View.GONE);

                else

                    tv3.setVisibility(View.VISIBLE);
            }
        });
    }

}

