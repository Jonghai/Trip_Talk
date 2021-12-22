package com.example.p_1.australia;

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

public class AuStList extends AppCompatActivity {

    ArrayList<com.example.p_1.america.AmStData> countryDataListb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.austlist);

        this.InitializecountryData();

        ListView listView = (ListView)findViewById(R.id.listView1);
        final com.example.p_1.america.AmStAdapter myAdapter = new AmStAdapter(this, countryDataListb);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), Auhotel1.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), Auhotel1.class);
                        startActivity(intent2);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 2:
                        Intent intent3 = new Intent(getApplicationContext(), Auhotel1.class);
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

        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.aust1, "길리건스 백패커","Cairns City", 3, "4.1"));
        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.aust2, "블루 비치 리조트","Bateau Bay", 4, "4.1"));
        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.aust3, "RAC 세르반테스","Cervantes", 4, "4.2"));
        countryDataListb.add(new com.example.p_1.america.AmStData(R.drawable.aust4, "오리지널 백패커스"," Potts Point", 4, "4.4"));
        countryDataListb.add(new AmStData(R.drawable.aust5, "카라벨라 백패커스","Cairns City", 4, "3.9"));
    }
}
