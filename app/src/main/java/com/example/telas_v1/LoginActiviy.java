package com.example.telas_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class LoginActiviy extends AppCompatActivity {

    //tudo ok,dia: 40/09/2020 ás 00:24
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void voltar(View view) {
        finish();
    }


    public void close(View view) {
        ((InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(
                view.getWindowToken(), 0);
    }
}
