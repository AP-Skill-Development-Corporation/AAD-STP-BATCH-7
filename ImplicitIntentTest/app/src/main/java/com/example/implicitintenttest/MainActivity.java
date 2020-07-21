package com.example.implicitintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openUrl(View view) {
        //1.Action,2.Resource
        //URL   URI   URN
        Uri u = Uri.parse("https://www.google.com");
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }

    public void call(View view) {

        Uri u = Uri.parse("tel:1232324322464");
        Intent i = new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);
    }

    public void openMap(View view) {
       /* Uri u = Uri.parse("geo:15.43025,80.0435388?q=BoysHostel");
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);*/
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=restaurants");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void police(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=policestations");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
