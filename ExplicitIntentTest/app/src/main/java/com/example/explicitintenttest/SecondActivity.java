package com.example.explicitintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = findViewById(R.id.res);
        String data = getIntent()
                .getStringExtra("key");

        tv.setText(data);
        Toast.makeText(this,
                data, Toast.LENGTH_SHORT).show();
    }
}
