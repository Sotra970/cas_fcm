package com.cas_fcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        try {
         String desc =     getIntent().getExtras().getString("desc") ;
            Toast.makeText(getApplicationContext(), desc , Toast.LENGTH_LONG) .show();
        }catch (NullPointerException e){

        }

    }
}
