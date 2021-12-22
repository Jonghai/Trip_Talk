package com.example.p_1.australia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;

public class AustraliaSpota extends AppCompatActivity {
    Button aubtn1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.australia_spot1);

        aubtn1=(Button) findViewById(R.id.aubtn1);
        tv2=(TextView) findViewById(R.id.tv2);

        aubtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv2.getVisibility() == View.VISIBLE)

                    tv2.setVisibility(View.GONE);

                else

                    tv2.setVisibility(View.VISIBLE);
            }
        });
    }

}
