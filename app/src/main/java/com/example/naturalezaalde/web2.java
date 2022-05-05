package com.example.naturalezaalde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web2 extends AppCompatActivity {
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);
        wv1 = (WebView)findViewById(R.id.w1);

        //recuperar valores de internet
        String URL = getIntent().getStringExtra("SitioWeb");
        //permitira al user navegar en la app
        wv1.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicito
        wv1.loadUrl(URL);
    }
    public void Cerrar(View view){
        finish(); //cierra el activity actual
    }
}