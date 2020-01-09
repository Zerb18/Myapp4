package com.example.myapp4;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Juego_de_aciertos extends AppCompatActivity
{

    fpaises fpaises;
    fcapitales fcapitales;

    TextView txtPais;
    TextView txtCapital;

    ListView listaPaises;
    ListView listaCapitales;

    Fragment pais;
    Fragment capital;

    String[] arrayPaises;
    String[] arrayCapitales;

    Button btnComprobar;

    Fragment Correcto;
    Fragment Error;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);

        fpaises = new fpaises();
        fcapitales = new fcapitales();

        txtPais = findViewById(R.id.txtPais);
        txtCapital = findViewById(R.id.txtCapital);

        arrayPaises = getResources().getStringArray(R.array.paises);
        arrayCapitales = getResources().getStringArray(R.array.capitales);

        pais = (Fragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
        capital = (Fragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);

        listaPaises = pais.getActivity().findViewById(R.id.listaPaises);
        listaCapitales = capital.getActivity().findViewById(R.id.listaCapitales);

        btnComprobar = findViewById(R.id.btnCheck);

        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                String pais = "";


                switch (position)
                {
                    case 0:
                        pais = arrayPaises[0];
                        break;

                    case 1:
                        pais = arrayPaises[1];
                        break;

                    case 2:
                        pais = arrayPaises[2];
                        break;

                    case 3:
                        pais = arrayPaises[3];
                        break;

                    case 4:
                        pais = arrayPaises[4];
                        break;

                    case 5:
                        pais = arrayPaises[5];
                        break;

                    case 6:
                        pais = arrayPaises[6];
                        break;

                    case 7:
                        pais = arrayPaises[7];
                        break;

                    case 8:
                        pais = arrayPaises[8];
                        break;
                }
                txtPais.setText(pais);
            }
        });


        listaCapitales.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                String capital = "";


                switch (position)
                {
                    case 0:
                        capital = arrayCapitales[0];
                        break;

                    case 1:
                        capital = arrayCapitales[1];
                        break;

                    case 2:
                        capital = arrayCapitales[2];
                        break;

                    case 3:
                        capital = arrayCapitales[3];
                        break;

                    case 4:
                        capital = arrayCapitales[4];
                        break;

                    case 5:
                        capital = arrayCapitales[5];
                        break;

                    case 6:
                        capital = arrayCapitales[6];
                        break;

                    case 7:
                        capital = arrayCapitales[7];
                        break;

                    case 8:
                        capital = arrayCapitales[8];
                        break;
                }
                txtCapital.setText(capital);
            }
        });

        btnComprobar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String pais_l = txtPais.getText().toString();
                String capital_l= txtCapital.getText().toString();

                int posicionPais = listaPaises.getSelectedItemPosition();
                int posicionCapital = listaCapitales.getSelectedItemPosition();


                if (pais_l.equals(getString(R.string.españa)) && capital_l.equals(getString(R.string.madrid)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction1 = getSupportFragmentManager().beginTransaction();
                    transacction1.add(R.id.container, Correcto);
                    transacction1.commit();
                }
                else if (pais_l.equals(getString(R.string.portugal)) && capital_l.equals(getString(R.string.lisboa)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction2 = getSupportFragmentManager().beginTransaction();
                    transacction2.add(R.id.container, Correcto);
                    transacction2.commit();
                }
                else if (pais_l.equals(getString(R.string.francia)) && capital_l.equals(getString(R.string.paris)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction3 = getSupportFragmentManager().beginTransaction();
                    transacction3.add(R.id.container, Correcto);
                    transacction3.commit();
                }
                else if (pais_l.equals(getString(R.string.italia)) && capital_l.equals(getString(R.string.roma)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction4 = getSupportFragmentManager().beginTransaction();
                    transacction4.add(R.id.container, Correcto);
                    transacction4.commit();
                }
                else if (pais_l.equals(getString(R.string.holanda)) && capital_l.equals(getString(R.string.amsterdam)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction5 = getSupportFragmentManager().beginTransaction();
                    transacction5.add(R.id.container, Correcto);
                    transacction5.commit();
                }
                else if (pais_l.equals(getString(R.string.alemania)) && capital_l.equals(getString(R.string.berlin)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction6 = getSupportFragmentManager().beginTransaction();
                    transacction6.add(R.id.container, Correcto);
                    transacction6.commit();
                }
                else if (pais_l.equals(getString(R.string.noruega)) && capital_l.equals(getString(R.string.oslo)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction7 = getSupportFragmentManager().beginTransaction();
                    transacction7.add(R.id.container, Correcto);
                    transacction7.commit();
                }
                else if (pais_l.equals(getString(R.string.colombia)) && capital_l.equals(getString(R.string.bogota)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction8 = getSupportFragmentManager().beginTransaction();
                    transacction8.add(R.id.container, Correcto);
                    transacction8.commit();
                }
                else if (pais_l.equals(getString(R.string.peru)) && capital_l.equals(getString(R.string.lima)))
                {
                    Correcto = new FragmentCorrecto();
                    FragmentTransaction transacction9 = getSupportFragmentManager().beginTransaction();
                    transacction9.add(R.id.container, Correcto);
                    transacction9.commit();
                }
                else
                {
                    Error = new FragmentError();
                    FragmentTransaction transacctionX = getSupportFragmentManager().beginTransaction();
                    transacctionX.add(R.id.container, Error);
                    transacctionX.commit();
                }
            }
        });
    }
}