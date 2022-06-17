package com.example.entregados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento.CreacionEvento;
import com.example.entregados.EstructurasDeDatos.PilaEventos.NodoPila;

import java.util.ArrayList;

public class MenuVerEvento extends AppCompatActivity {
    ArrayList<String> listaDatos;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ver_evento);


    }
    @Override
    protected void onStart() {
        super.onStart();
        // La actividad est� a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Enfocarse en otra actividad  (esta actividad est� a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        // La actividad ya no es visible (ahora esta "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // La actividad est� a punto de ser destruida.
    }
    public void aceptar(View View){
        recycler = findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        String datos;
        System.out.println();
        ArrayList<NodoPila> listaDatosPila = new ArrayList<>(CreacionEvento.MostrarEvento());
        ArrayList<String> listaDatos = new ArrayList<>();
        System.out.println(listaDatos);
        for (int i = 0; i < listaDatosPila.size(); i++) {
            // aqui se puede referir al objeto con arreglo[i];
            datos = listaDatosPila.get(i).getValor().getNombre()
                    + " " + listaDatosPila.get(i).getValor().getLugar()
                    + " " + listaDatosPila.get(i).getValor().getDia()
                    + " " + listaDatosPila.get(i).getValor().getHora()
                    + " " + listaDatosPila.get(i).getValor().getEspecificaciones();
            System.out.println(datos);
            listaDatos.add(datos);

        }
        System.out.println(listaDatos);

        AdaptadorDatos adapter = new AdaptadorDatos(listaDatos);
        recycler.setAdapter(adapter);

        Toast.makeText(this, "Eventos Disponibles", Toast.LENGTH_SHORT).show();
    }

}