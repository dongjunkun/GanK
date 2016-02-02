package com.yyydjk.gank.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yyydjk.gank.R;
import com.yyydjk.gank.http.HttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HttpClient.get(MainActivity.class.getName(),"http://gank.avosapps.com/api/data/all/20/2",null);
    }
}
