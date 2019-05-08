package com.example.a421zhengying;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class WechatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wechat);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.content_layout, new ChatFragment());
        transaction.commit();
        initView();
    }

    private void initView() {
        RadioGroup rgTabs = (RadioGroup) findViewById(R.id.rg_tabs);
        rgTabs.setOnCheckedChangeListener(new MyOnCheckedChangedListener());
    }

    class MyOnCheckedChangedListener implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            switch (checkedId) {
                case R.id.rb_chat:
                    transaction.replace(R.id.content_layout, new ChatFragment());
                    break;
                case R.id.rb_moment:
                    transaction.replace(R.id.content_layout, new MomentFragment());
                    break;
                case R.id.rb_mine:
                    Intent intent = new Intent(WechatActivity.this, MineActivity.class);
                    startActivity(intent);
                    break;
            }
            transaction.commit();
        }
    }
}
