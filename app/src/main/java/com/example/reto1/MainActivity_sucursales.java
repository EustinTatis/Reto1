package com.example.reto1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_sucursales extends AppCompatActivity {

    Drawable drawable1;
    ImageView imagen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sucursales);

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.sucursales, getTheme());
        imagen1 = (ImageView) findViewById(R.id.imagen1_sucursales);
        imagen1.setImageDrawable(drawable1);

    }
}