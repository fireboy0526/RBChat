package com.skws.rbchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.skws.rbchat.Test.MainActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_register);

        //Intent intent = new Intent(getApplicationContext(), Activity_Sliding_Tab_Register.class);
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intent);
        finish();
    }
}
