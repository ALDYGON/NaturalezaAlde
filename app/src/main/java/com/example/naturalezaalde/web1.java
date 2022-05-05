package com.example.naturalezaalde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class web1 extends AppCompatActivity {
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        //enlazar parte logica y disenio
        et1 = (EditText) findViewById(R.id.txt_web);
    }
    public void Navegar(View view) {
        //se establecen cambios de panatallas o activitys
        Intent i = new Intent(this, web2.class);
        //enviar parametros intent, metodo put extra
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }
}