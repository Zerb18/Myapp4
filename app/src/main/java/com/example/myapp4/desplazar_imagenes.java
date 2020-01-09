package com.example.myapp4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class desplazar_imagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazar_imagenes);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewPageDesplazandoImagenes(getSupportFragmentManager()));


    }
}
