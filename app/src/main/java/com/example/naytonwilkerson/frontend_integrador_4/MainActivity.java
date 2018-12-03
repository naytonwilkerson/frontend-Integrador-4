package com.example.naytonwilkerson.frontend_integrador_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt2(View view){

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

}
