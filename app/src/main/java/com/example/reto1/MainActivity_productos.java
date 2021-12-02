package com.example.reto1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_productos extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3, drawable4, drawable5, drawable6, drawable7, drawable8, drawable9, drawable10;
    ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10,
    flecha1, flecha2, flecha3, flecha4, flecha5, flecha6, flecha7, flecha8, flecha9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_productos);

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.productos, getTheme());
        imagen1 = (ImageView) findViewById(R.id.imagen1_Productos);
        imagen1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.hamburguesa3, getTheme());
        imagen2 = (ImageView) findViewById(R.id.imagen2_Productos);
        imagen2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.perro, getTheme());
        imagen3 = (ImageView) findViewById(R.id.imagen3_Productos);
        imagen3.setImageDrawable(drawable3);

        Resources res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.pizza, getTheme());
        imagen4 = (ImageView) findViewById(R.id.imagen4_Productos);
        imagen4.setImageDrawable(drawable4);

        Resources res5 = getResources();
        drawable5 = res5.getDrawable(R.drawable.salchipapa, getTheme());
        imagen5 = (ImageView) findViewById(R.id.imagen5_Productos);
        imagen5.setImageDrawable(drawable5);

        Resources res6 = getResources();
        drawable6 = res6.getDrawable(R.drawable.desgranados, getTheme());
        imagen6 = (ImageView) findViewById(R.id.imagen6_Productos);
        imagen6.setImageDrawable(drawable6);

        Resources res7 = getResources();
        drawable7 = res7.getDrawable(R.drawable.picadas, getTheme());
        imagen7 = (ImageView) findViewById(R.id.imagen7_Productos);
        imagen7.setImageDrawable(drawable7);

        Resources res8 = getResources();
        drawable8 = res8.getDrawable(R.drawable.pechuga, getTheme());
        imagen8 = (ImageView) findViewById(R.id.imagen8_Productos);
        imagen8.setImageDrawable(drawable8);

        Resources res9 = getResources();
        drawable9 = res9.getDrawable(R.drawable.pinchos, getTheme());
        imagen9 = (ImageView) findViewById(R.id.imagen9_Productos);
        imagen9.setImageDrawable(drawable9);

        Resources res10 = getResources();
        drawable10 = res10.getDrawable(R.drawable.bebidas, getTheme());
        imagen10 = (ImageView) findViewById(R.id.imagen10_Productos);
        imagen10.setImageDrawable(drawable10);

        //Métodos onclick para las ImageView flechas
        flecha1 = (ImageView) findViewById(R.id.flecha1_productos);
        flecha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de hamburguesas", Toast.LENGTH_LONG).show();
            }
        });

        flecha2 = (ImageView) findViewById(R.id.flecha2_productos);
        flecha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de perros calientes", Toast.LENGTH_LONG).show();
            }
        });

        flecha3 = (ImageView) findViewById(R.id.flecha3_productos);
        flecha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de pizzas", Toast.LENGTH_LONG).show();
            }
        });

        flecha4 = (ImageView) findViewById(R.id.flecha4_productos);
        flecha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de salchipapas", Toast.LENGTH_LONG).show();
            }
        });

        flecha5 = (ImageView) findViewById(R.id.flecha5_productos);
        flecha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de desgranados", Toast.LENGTH_LONG).show();
            }
        });

        flecha6 = (ImageView) findViewById(R.id.flecha6_productos);
        flecha6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de picadas", Toast.LENGTH_LONG).show();
            }
        });

        flecha7 = (ImageView) findViewById(R.id.flecha7_productos);
        flecha7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de asados", Toast.LENGTH_LONG).show();
            }
        });

        flecha8 = (ImageView) findViewById(R.id.flecha8_productos);
        flecha8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de pinchos", Toast.LENGTH_LONG).show();
            }
        });

        flecha9 = (ImageView) findViewById(R.id.flecha9_productos);
        flecha9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con el menú de bébidas", Toast.LENGTH_LONG).show();
            }
        });
    }
}