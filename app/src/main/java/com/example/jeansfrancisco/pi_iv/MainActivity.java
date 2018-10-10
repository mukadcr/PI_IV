package com.example.jeansfrancisco.pi_iv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragLogin fl = new FragLogin();
        getSupportFragmentManager().beginTransaction().replace(R.id.moldura,fl).commit();
    }
}
