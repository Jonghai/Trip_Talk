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

public class AmList extends AppCompatActivity {

    ArrayList<AmData> countryDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amlist);

        this.InitializecountryData();

        ListView listView = (ListView)findViewById(R.id.listView);
        final AmAdapter myAdapter = new AmAdapter(this,countryDataList);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), AmericaSpota.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), myAdapter.getItem(position).getCountry(), Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Intent intent2 = new Intent(getApplicationContext(), AmericaSpota.class);
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

        countryDataList.add(new AmData(R.drawable.usa1, "자유의여신상","뉴욕"));
        countryDataList.add(new AmData(R.drawable.usa2, "엠파이어 스테이트 빌딩","뉴욕"));
        countryDataList.add(new AmData(R.drawable.usa3, "타임 스퀘어","뉴욕"));
        countryDataList.add(new AmData(R.drawable.usa4, "센트럴파크","뉴욕"));
    }
}
