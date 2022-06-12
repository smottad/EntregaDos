package com.example.entregados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuOrganizador extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_organizador);
    }

    // metodo boton siguiente
    public void Siguiente(View View){
        Intent siguiente = new Intent(this, MenuCreacionEvento.class);
        startActivity(siguiente);
    }
    public void VerEvento(View View){
        Intent siguiente = new Intent(this, MenuCreacionEvento.class);
        startActivity(siguiente);
    }
}
