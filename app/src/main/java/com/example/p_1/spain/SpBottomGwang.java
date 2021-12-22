package com.example.p_1.spain;

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

public class SpBottomGwang extends BottomSheetDialogFragment implements View.OnClickListener{

    public static SpBottomGwang getInstance() { return new SpBottomGwang(); }

    ImageButton sPinfo, sPfood, sPstay, sPspot ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sp_bottom_sheet, container,false);

        sPinfo = (ImageButton) view.findViewById(R.id.sPinfo);
        sPfood = (ImageButton) view.findViewById(R.id.sPfood);
        sPstay = (ImageButton) view.findViewById(R.id.sPstay);
        sPspot = (ImageButton) view.findViewById(R.id.sPspot);

        sPinfo.setOnClickListener(this);
        sPfood.setOnClickListener(this);
        sPstay.setOnClickListener(this);
        sPspot.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sPinfo:
                Intent intent = new Intent(getActivity(), Spaininfo.class);
                startActivity(intent);
                Toast.makeText(getContext(),"나라정보", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sPfood:
                Intent intent2 = new Intent(getActivity(),Spainfood.class);
                startActivity(intent2);
                Toast.makeText(getContext(),"먹거리",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sPstay:
                Intent intent3 = new Intent(getActivity(), SpStList.class);
                startActivity(intent3);
                Toast.makeText(getContext(),"숙박시설",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sPspot:
                Intent intent4 = new Intent(getActivity(),SpList.class);
                startActivity(intent4);
                Toast.makeText(getContext(),"관광지",Toast.LENGTH_SHORT).show();
                break;
        }
        dismiss();
    }
}