package com.project.qingfenghuu.iccsu;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ig_home, ig_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ig_home = (ImageView) findViewById(R.id.ig_home);
        ig_setting = (ImageView) findViewById(R.id.ig_setting);

        ig_home.setOnClickListener(this);
        ig_setting.setOnClickListener(this);


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(R.id.ll_layout, new IccsuFragment());
        ig_home.setImageResource(R.drawable.home2);
        beginTransaction.commit();



    }

    @Override
    public void onClick(View view) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();

        switch (view.getId()) {
            case R.id.ig_home:

                beginTransaction.replace(R.id.ll_layout, new IccsuFragment());
                ig_home.setImageResource(R.drawable.home2);
                ig_setting.setImageResource(R.drawable.user);
                break;

            case R.id.ig_setting:

                beginTransaction.replace(R.id.ll_layout, new SettingFragment());
                ig_home.setImageResource(R.drawable.home1);
                ig_setting.setImageResource(R.drawable.user2);
                break;

        }
        beginTransaction.commit();

    }

}
