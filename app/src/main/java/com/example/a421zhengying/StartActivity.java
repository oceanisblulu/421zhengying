package com.example.a421zhengying;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_start);


    }

    public void onClick(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btn_wechat:
                intent=new Intent(StartActivity.this,WechatActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_fragment_viewpager:
                intent=new Intent(StartActivity.this,FragmentViewpagerActivity.class);
                startActivity(intent);
                break;
        }
    }
}