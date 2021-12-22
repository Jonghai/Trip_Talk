package com.example.p_1.america;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;

import java.util.ArrayList;

public class AmStList extends AppCompatActivity {

    ArrayList<AmStData> countryDataListb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amstlist);

        this.InitializecountryData();

        ListView listView = (ListView)findViewById(R.id.listView2);
        final AmStAdapter myAdapter = new AmStAdapter(this, countryDataListb);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), AmHotel1.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), AmHotel1.class);
                        startActivity(intent2);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 2:
                        Intent intent3 = new Intent(getApplicationContext(), AmHotel1.class);
                        startActivity(intent3);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }

    public void InitializecountryData()
    {
        countryDataListb = new ArrayList<AmStData>();

        countryDataListb.add(new AmStData(R.drawable.ht1, "웨스트게이트","LA", 3, "3.9"));
        countryDataListb.add(new AmStData(R.drawable.ht2, "SAHARA","LA", 4, "4.2"));
        countryDataListb.add(new AmStData(R.drawable.ht3, "엑스칼리버","뉴욕", 4, "4.1"));
        countryDataListb.add(new AmStData(R.drawable.ht4, "스트래토스피어","워싱턴", 4, "4.1"));
        countryDataListb.add(new AmStData(R.drawable.ht5, "플라밍고","시카고", 4, "4.1"));
    }
}
