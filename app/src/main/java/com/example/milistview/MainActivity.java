package com.example.milistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> miLista;
    String[] contenidoFruta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*miLista = new ArrayList<String>();
        cargarLista();*/
         //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, miLista);
        //ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,android.R.id.text1,miLista);

        ListView list = findViewById(R.id.lista);
        contenidoFruta = list.getResources().getStringArray(R.array.frutas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,contenidoFruta);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapter.getItem(i);
                Toast.makeText(getApplicationContext(),valor,Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void cargarLista(){

        miLista.add("Hola");
        miLista.add("Hello");
        miLista.add("Bonjou");
        miLista.add("Adios");

    }

}