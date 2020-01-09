package com.example.myapp4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fpaises extends Fragment
{

    String[] arrayPaises;
    String[] arrayCapitales;
    ListView listView;

    String pais = "";

    ArrayAdapter<String> listPaisesAdapter;


    public fpaises() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_fpaises, container, false);

        arrayPaises = getResources().getStringArray(R.array.paises);
        arrayCapitales = getResources().getStringArray(R.array.capitales);
        listView = view.findViewById(R.id.listaPaises);

        listPaisesAdapter = new ArrayAdapter<String>(
                getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1,
                arrayPaises
        );

        listView.setAdapter(listPaisesAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}