package com.example.duyquang.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvhello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvhello=(TextView) findViewById(R.id.tvHello);
        tvhello.setText("Hello World, I am beginer!!!!");
    }
}
