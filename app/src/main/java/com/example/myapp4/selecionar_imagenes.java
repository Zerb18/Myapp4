package com.example.myapp4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selecionar_imagenes extends AppCompatActivity
{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    Fragment frag1;
    Fragment frag2;
    Fragment frag3;
    Fragment frag4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar_imagenes);

        btn1 = findViewById(R.id.btnPlanta1);
        btn2 = findViewById(R.id.btnPlanta2);
        btn3 = findViewById(R.id.btnPlanta3);
        btn4 = findViewById(R.id.btnPlanta4);


        btn1.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                frag1 = new planta1();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.replace(R.id.container, frag1);
                transacction.commit();
            }
        });

        btn2.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                frag2 = new planta2();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.replace(R.id.container, frag2);
                transacction.commit();
            }
        });

        btn3.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                frag3 = new planta3();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.replace(R.id.container, frag3);
                transacction.commit();
            }
        });

        btn4.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                frag4 = new planta4();
                FragmentTransaction transacction = getSupportFragmentManager().beginTransaction();
                transacction.replace(R.id.container, frag4);
                transacction.commit();
            }
        });
    }
}