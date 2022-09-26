package com.example.ciclodevidaactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    // PASO 1 . Variables de la vista
    private Button btnAbrir;





    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados", "6-Ejecuto onDestrroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados","5 - Ejecuto onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados","4 - Ejecuto onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados","3 - Ejecuto onResune");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados","2 - Ejecuto onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Estados","Ejecuto onCreate");

        btnAbrir = findViewById(R.id.btnAbrirSegunda);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}