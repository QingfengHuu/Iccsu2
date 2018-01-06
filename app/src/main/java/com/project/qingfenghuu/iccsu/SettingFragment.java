package com.project.qingfenghuu.iccsu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class SettingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_setting, null);
        //找到按钮前要加view.


        return view;
    }


}
