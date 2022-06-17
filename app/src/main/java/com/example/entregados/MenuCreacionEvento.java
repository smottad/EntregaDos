package com.example.entregados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento.CreacionEvento;
import com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento.DatosEventos;
import com.example.entregados.EstructurasDeDatos.PilaEventos.PilaEventos;


public class MenuCreacionEvento extends AppCompatActivity {

    public EditText et1;
    public EditText et2;
    public EditText et3;
    public EditText et4;
    public EditText et6;
    public EditText et51;
    PilaEventos pilaEjemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_creacion_evento);

        et1 = findViewById(R.id.editTextTextPersonName);
        et2 = findViewById(R.id.editTextTextPersonName2);
        et3 = findViewById(R.id.editTextTextPersonName3);
        et4 = findViewById(R.id.editTextTextPersonName4);
        et6 = findViewById(R.id.editTextTextPersonName6);


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
    public PilaEventos IngresarDatos (View View){
        String Nombre = et1.getText().toString();
        String Lugar = et2.getText().toString();
        String Dia = et3.getText().toString();
        String Hora = et4.getText().toString();
        String Especificaciones = et6.getText().toString();

        this.pilaEjemplo = new PilaEventos();
        DatosEventos nuevoEvento = new DatosEventos(Nombre,Lugar,Dia,Hora,Especificaciones);
        CreacionEvento.IngresarDatos(nuevoEvento);
        this.pilaEjemplo.apilar(nuevoEvento);
        this.pilaEjemplo.listaras();

        Toast.makeText(this, "Evento Creado", Toast.LENGTH_SHORT).show();
        return pilaEjemplo;
    }

}