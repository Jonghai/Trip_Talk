package com.example.p_1.australia;

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

public class AuBottomGwang extends BottomSheetDialogFragment implements View.OnClickListener{

    public static AuBottomGwang getInstance() { return new AuBottomGwang(); }

    ImageButton aUinfo, aUfood, aUstay, aUspot ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.au_bottom_sheet, container,false);

        aUinfo = (ImageButton) view.findViewById(R.id.aUinfo);
        aUfood = (ImageButton) view.findViewById(R.id.aUfood);
        aUstay = (ImageButton) view.findViewById(R.id.aUstay);
        aUspot = (ImageButton) view.findViewById(R.id.aUspot);

        aUinfo.setOnClickListener(this);
        aUfood.setOnClickListener(this);
        aUstay.setOnClickListener(this);
        aUspot.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.aUinfo:
                Intent intent = new Intent(getActivity(), Australiainfo.class);
                startActivity(intent);
                Toast.makeText(getContext(),"나라정보", Toast.LENGTH_SHORT).show();
                break;
            case R.id.aUfood:
                Intent intent2 = new Intent(getActivity(),Australiafood.class);
                startActivity(intent2);
                Toast.makeText(getContext(),"먹거리",Toast.LENGTH_SHORT).show();
                break;
            case R.id.aUstay:
                Intent intent3 = new Intent(getActivity(), AuStList.class);
                startActivity(intent3);
                Toast.makeText(getContext(),"숙박시설",Toast.LENGTH_SHORT).show();
                break;
            case R.id.aUspot:
                Intent intent4 = new Intent(getActivity(), AuList.class);
                startActivity(intent4);
                Toast.makeText(getContext(),"관광지",Toast.LENGTH_SHORT).show();
                break;
        }
        dismiss();
    }
}