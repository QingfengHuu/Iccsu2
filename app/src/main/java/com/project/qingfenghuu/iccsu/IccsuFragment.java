package com.project.qingfenghuu.iccsu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class IccsuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_iccsu, null);
        ImageView grade = (ImageView) view.findViewById(R.id.ig_grade);
        grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),GradeActivity.class);
                startActivity(intent);
            }
        });
        ImageView lost = (ImageView) view.findViewById(R.id.ig_lost);
        lost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),LostActivity.class);
                startActivity(intent);
            }
        });
        ImageView map = (ImageView) view.findViewById(R.id.ig_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MapActivity.class);
                startActivity(intent);
            }
        });
        ImageView card = (ImageView) view.findViewById(R.id.ig_card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),CardActivity.class);
                startActivity(intent);
            }
        });
        //找到按钮前要加view.
        return view;
}
@Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}