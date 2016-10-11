package com.example.rafaelmeyer.mymaskstudying;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.rafaelmeyer.mymaskstudying.util.MaskHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextPhoneNumber = (EditText) findViewById(R.id.phoneNumber);
        editTextPhoneNumber.addTextChangedListener(MaskHelper.insert("(##)####-####", editTextPhoneNumber));

        EditText editTextCPFNumber = (EditText) findViewById(R.id.cpfNumber);
        editTextCPFNumber.addTextChangedListener(MaskHelper.insert("###.###.###-##", editTextCPFNumber));

    }

}
