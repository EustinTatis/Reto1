package com.example.reto1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_servicios extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4, flecha1, flecha2, flecha3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_servicios);

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.servicios, getTheme());
        imagen1 = (ImageView) findViewById(R.id.imagen1_servicios);
        imagen1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.domicilio, getTheme());
        imagen2 = (ImageView) findViewById(R.id.imagen2_servicios);
        imagen2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.salon, getTheme());
        imagen3 = (ImageView) findViewById(R.id.imagen3_servicios);
        imagen3.setImageDrawable(drawable3);

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.juegos, getTheme());
        imagen4 = (ImageView) findViewById(R.id.imagen4_servicios);
        imagen4.setImageDrawable(drawable4);

        //Métodos onclick para las ImageView flechas
        flecha1 = (ImageView) findViewById(R.id.flecha1_servicios);
        flecha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el servicio", Toast.LENGTH_LONG).show();
            }
        });

        flecha2 = (ImageView) findViewById(R.id.flecha2_servicios);
        flecha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el servicio", Toast.LENGTH_LONG).show();
            }
        });

        flecha3 = (ImageView) findViewById(R.id.flecha3_servicios);
        flecha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el servicio", Toast.LENGTH_LONG).show();
            }
        });

    }
}