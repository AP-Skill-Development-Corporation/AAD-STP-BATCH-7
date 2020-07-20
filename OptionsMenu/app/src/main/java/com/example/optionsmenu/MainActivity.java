package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    int c_year,c_month,c_day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c=Calendar.getInstance();

        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_day=c.get(Calendar.DAY_OF_MONTH);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.m1:

                AlertDialog.Builder b=new
                        AlertDialog.Builder(this);

                b.setTitle("alert");

                b.setMessage("are u continue the application or not");

                b.setIcon(R.drawable.share);

                b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finish();
                    }
                });
                b.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                b.show();





                break;
            case R.id.m2:
                Toast.makeText(this, "clicked"+item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.m3:

                DatePickerDialog dp=new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                      Toast.makeText(MainActivity.this,"date is:"+i+"/"+(i1+1)+"/"+i2,Toast.LENGTH_LONG).show();
                    }
                },c_year,c_month,c_day);

                dp.show();

                break;

        }
        return super.onOptionsItemSelected(item);
    }
}