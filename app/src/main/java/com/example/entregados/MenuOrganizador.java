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

    // metodo boton siguiente
    public void Siguiente(View View){
        Intent siguiente = new Intent(this, MenuCreacionEvento.class);
        startActivity(siguiente);
    }
    public void VerEvento(View View){
        Intent siguiente = new Intent(this, MenuVerEvento.class);
        startActivity(siguiente);
    }
}
