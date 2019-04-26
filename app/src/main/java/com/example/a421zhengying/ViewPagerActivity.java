package com.example.a421zhengying;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<View> viewList;
    private ArrayList<String> titleList;
    private MyPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_tab);

        LayoutInflater inflater=getLayoutInflater();
        viewPager=(ViewPager) findViewById(R.id.view_pager);
        viewList=new ArrayList<View>();
        viewList.add(inflater.inflate(R.layout.view_1,null,false));
        viewList.add(inflater.inflate(R.layout.view_2,null,false));
        titleList=new ArrayList<String>();
        titleList.add("红色");
        titleList.add("绿色");
        titleList.add("蓝色");
        adapter=new MyPagerAdapter(viewList,titleList);
        viewPager.setAdapter(adapter);
    }
}
