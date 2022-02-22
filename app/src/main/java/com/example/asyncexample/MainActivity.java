package com.example.asyncexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_ip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_ip=(TextView)findViewById(R.id.tv_ip);
         new AsyncTaskNetwork(this,tv_ip).execute("http://google.com.vn/");
    }
}