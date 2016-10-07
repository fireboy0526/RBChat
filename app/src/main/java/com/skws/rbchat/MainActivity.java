package com.skws.rbchat;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_register);

        Intent intent = new Intent(getApplicationContext(), Activity_Sliding_Tab_Register.class);
        startActivity(intent);
        finish();
    }
}
