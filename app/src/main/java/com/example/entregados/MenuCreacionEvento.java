package com.example.entregados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento.DatosEventos;
import com.example.entregados.EstructurasDeDatos.PilaEventos.PilaEventos;

public class MenuCreacionEvento extends AppCompatActivity {

    public EditText et1;
    public EditText et2;
    public EditText et3;
    public EditText et4;
    public EditText et6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_creacion_evento);

        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        et3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        et4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        et6 = (EditText) findViewById(R.id.editTextTextPersonName6);
    }
    public void IngresarDatos (View View){
        String Nombre = et1.getText().toString();
        String Lugar = et1.getText().toString();
        String Dia = et1.getText().toString();
        String Hora = et1.getText().toString();
        String Especificaciones = et1.getText().toString();
        PilaEventos pilaEjemplo = new PilaEventos();

        DatosEventos nuevoEvento = new DatosEventos(Nombre,Lugar,Dia,Hora,Especificaciones);
        pilaEjemplo.apilar(nuevoEvento);
    }

}