package com.example.p_1.america;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.p_1.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomGwang extends BottomSheetDialogFragment implements View.OnClickListener{

    public static BottomGwang getInstance() { return new BottomGwang(); }

    ImageButton aMinfo, aMfood, aMstay, aMspot ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.am_bottom_sheet, container,false);

        aMinfo = (ImageButton) view.findViewById(R.id.aMinfo);
        aMfood = (ImageButton) view.findViewById(R.id.aMfood);
        aMstay = (ImageButton) view.findViewById(R.id.aMstay);
        aMspot = (ImageButton) view.findViewById(R.id.aMspot);

        aMinfo.setOnClickListener(this);
        aMfood.setOnClickListener(this);
        aMstay.setOnClickListener(this);
        aMspot.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.aMinfo:
                Intent intent = new Intent(getActivity(), Americainfo.class);
                startActivity(intent);
                Toast.makeText(getContext(),"나라정보", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aMfood:
                Intent intent2 = new Intent(getActivity(),Americafood.class);
                startActivity(intent2);
                Toast.makeText(getContext(),"먹거리",Toast.LENGTH_SHORT).show();
                break;
            case R.id.aMstay:
                Intent intent3 = new Intent(getActivity(),AmStList.class);
                startActivity(intent3);
                Toast.makeText(getContext(),"숙박시설",Toast.LENGTH_SHORT).show();
                break;
            case R.id.aMspot:
                Intent intent4 = new Intent(getActivity(),AmList.class);
                startActivity(intent4);
                Toast.makeText(getContext(),"관광지",Toast.LENGTH_SHORT).show();
                break;
        }
        dismiss();
    }
}