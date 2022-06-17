package com.example.entregados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.entregados.EstructurasDeDatos.ColaUsuarios.ColaUsuarios;

import com.example.entregados.EstructurasDeDatos.Usuarios.Participante;

public class MenuCrearUsuario extends AppCompatActivity {
    public EditText et1;
    public EditText et2;
    public EditText et3;
    public static ColaUsuarios cola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_crear_usuario);

        et1 = findViewById(R.id.editTextTextPersonName5);
        et2 = findViewById(R.id.editTextTextPersonName7);
        et3 = findViewById(R.id.editTextTextPersonName8);
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
    public void IngresarDatos (View View){
        String Nombre = et1.getText().toString();
        String Edad = et2.getText().toString();
        String Genero = et3.getText().toString();


        this.cola = new ColaUsuarios();
        Participante nuevoParticipante = new Participante(Nombre,Edad,Genero);
        cola.encolar(nuevoParticipante);


        Toast.makeText(this, "Usuario Aceptado", Toast.LENGTH_SHORT).show();
    }
}