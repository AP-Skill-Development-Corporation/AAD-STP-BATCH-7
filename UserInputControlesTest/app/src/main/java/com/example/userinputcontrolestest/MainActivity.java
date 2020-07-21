package com.example.userinputcontrolestest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_name,et_mobile,et_email,et_pass;
    TextView tv;
    RadioButton r_male,r_female;
    String gender;
    Spinner sp_branch;

    CheckBox ch_android,ch_java,ch_python;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = findViewById(R.id.name);
        et_mobile = findViewById(R.id.mobile);
        et_email = findViewById(R.id.email);
        et_pass = findViewById(R.id.password);

        tv = findViewById(R.id.userdata);
        r_male = findViewById(R.id.male);
        r_female = findViewById(R.id.female);

        sp_branch = findViewById(R.id.sp);
        ch_android = findViewById(R.id.android);
        ch_java = findViewById(R.id.java);
        ch_python = findViewById(R.id.python);
    }

    public void submit(View view) {
        String name = et_name.getText().toString();
        String mobile = et_mobile.getText().toString();
        String email = et_email.getText().toString();
        String pass = et_pass.getText().toString();
        if(r_male.isChecked()){
            gender = r_male.getText().toString();
        }
        if(r_female.isChecked()){
            gender = r_female.getText().toString();
        }

        String b = sp_branch.getSelectedItem().toString();

        StringBuilder builder = new StringBuilder();
        if(ch_android.isChecked()){
            builder.append(ch_android.getText().toString()+",");
        }

        if(ch_java.isChecked()){
            builder.append(ch_java.getText().toString()+",");
        }
        if(ch_python.isChecked()){
            builder.append(ch_python.getText().toString());
        }

        tv.setText(name+"\n"+mobile+"\n"+email+
                "\n"+pass+"\n"+gender+"\n"+b+"\n"+builder.toString());

    }
}
