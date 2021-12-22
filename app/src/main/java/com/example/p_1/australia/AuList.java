package com.example.p_1.australia;

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

public class AuList extends AppCompatActivity {

    ArrayList<AmData> countryDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aulist);

        this.InitializecountryData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final AmAdapter myAdapter = new AmAdapter(this,countryDataList);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), AustraliaSpota.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), AustraliaSpota.class);
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

        countryDataList.add(new AmData(R.drawable.auspot1, "시드니 오페라 하우스","시드니"));
        countryDataList.add(new AmData(R.drawable.auspot2, "내셔널 갤러리 오브 빅토리아","맬버른"));
        countryDataList.add(new AmData(R.drawable.auspot3, "Story Bridge","브리즈번"));
        countryDataList.add(new AmData(R.drawable.auspot4, "킹스 파크 앤드 보태닉 가든","퍼스"));
    }
}
