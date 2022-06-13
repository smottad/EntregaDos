package com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento;

import com.example.entregados.EstructurasDeDatos.PilaEventos.PilaEventos;
import com.example.entregados.EstructurasDeDatos.PilaEventos.NodoPila;

import java.util.ArrayList;
import java.util.Scanner;

public class CreacionEvento {

    static String Nombre;
    static String Lugar;
    static String Dia;
    static String Hora;
    static String Especificaciones;
    static Scanner Lector = new Scanner(System.in);
    static PilaEventos pilaEjemplo = new PilaEventos();

    public static DatosEventos IngresarDatos(DatosEventos dato) {

        DatosEventos nuevoEvento = dato;
        pilaEjemplo.apilar(nuevoEvento);

        return nuevoEvento;
    }

    public static ArrayList<NodoPila> MostrarEvento() {
        ArrayList<NodoPila> listaDatos;
        listaDatos = pilaEjemplo.listar();
        return listaDatos;
    }

}
