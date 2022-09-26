package com.example.ciclodevidaactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btncerrar;


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados", "6-Ejecuto onDestrroy A2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados","5 - Ejecuto onStop A2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados","4 - Ejecuto onPause A2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados","3 - Ejecuto onResune A2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados","2 - Ejecuto onStart A2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("Estados","2 - Ejecuto onCreate A2");
        btncerrar = findViewById(R.id.btnCerrarSegunda);
        btncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}