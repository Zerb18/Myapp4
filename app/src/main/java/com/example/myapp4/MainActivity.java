package com.example.myapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.calcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),primo.class);
                startActivity(intent);
            }
        });
            Button btn2 = (Button) findViewById(R.id.btnjuego);
        btn2.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),Juego_de_aciertos.class);
                    startActivity(intent);
                }
        });
        Button btn3 = (Button) findViewById(R.id.btndesplazar);
        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),desplazar_imagenes.class);
                startActivity(intent);
            }
        });
        Button btn4 = (Button) findViewById(R.id.btnselecionar);
        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),selecionar_imagenes.class);
                startActivity(intent);
            }
        });

    }
}
