package com.example.telas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    //Ultima atualização dia 31/08 às 00:50
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view) {
        Intent entrar = new Intent(this, LoginActiviy.class);
        startActivity(entrar);
    }

    public void criar(View view) {
        Intent criar = new Intent(this, CreateActivity.class);
        startActivity(criar);
    }
}
