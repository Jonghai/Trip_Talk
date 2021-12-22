package com.example.p_1.spain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.p_1.R;
import com.example.p_1.america.AmAdapter;
import com.example.p_1.america.AmData;

import java.util.ArrayList;

public class SpList extends AppCompatActivity {

    ArrayList<AmData> countryDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splist);

        this.InitializecountryData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final AmAdapter myAdapter = new AmAdapter(this,countryDataList);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), SpainSpota.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), SpainSpota.class);
                        startActivity(intent2);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }

    public void InitializecountryData()
    {
        countryDataList = new ArrayList<AmData>();

        countryDataList.add(new AmData(R.drawable.spspot1, "사그라다 파밀리아","바르셀로나"));
        countryDataList.add(new AmData(R.drawable.spspot2, "마드리드 왕국","마드리드"));
        countryDataList.add(new AmData(R.drawable.spspot3, "스페인 광장","세빌"));
        countryDataList.add(new AmData(R.drawable.spspot4, "Es Trenc","마요르카"));
    }
}

