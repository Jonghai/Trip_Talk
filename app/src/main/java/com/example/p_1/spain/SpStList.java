package com.example.p_1.spain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;
import com.example.p_1.america.AmStAdapter;
import com.example.p_1.america.AmStData;

import java.util.ArrayList;

public class SpStList extends AppCompatActivity {

    ArrayList<com.example.p_1.america.AmStData> countryDataListb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spstlist);

        this.InitializecountryData();

        ListView listView = (ListView)findViewById(R.id.listView3);
        final com.example.p_1.america.AmStAdapter myAdapter = new AmStAdapter(this, countryDataListb);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), SpHotel1.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), SpHotel1.class);
                        startActivity(intent2);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 2:
                        Intent intent3 = new Intent(getApplicationContext(), SpHotel1.class);
                        startActivity(intent3);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }

    public void InitializecountryData()
    {
        countryDataListb = new ArrayList<com.example.p_1.america.AmStData>();

        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.spho1, "하드록 호텔 이비자"," Balearic Islands", 3, "4.6"));
        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.spst2, "Hotel La Vega","Teruel", 4, "3.9"));
        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.spst3, "이베로스타 플라야","Málaga", 4, "4.7"));
        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.spst4, "Ushuaia Hotel","Balearic Islands", 4, "4.6"));
        countryDataListb.add(new AmStData(R.drawable.spst5, "Los Duendes Sur","Santa Cruz de Tenerife", 4, "4.4"));
    }
}
