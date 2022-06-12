package com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento;

import com.example.entregados.EstructurasDeDatos.IU.Menu;
import com.example.entregados.EstructurasDeDatos.PilaEventos.PilaEventos;

import java.util.Scanner;

public class CreacionEvento {

    static String Nombre;
    static String Lugar;
    static String Dia;
    static String Hora;
    static String Especificaciones;
    static Scanner Lector = new Scanner(System.in);
    static PilaEventos pilaEjemplo = new PilaEventos();

    public static void IngresarDatos() {
        System.out.println("Ingrese un nombre para el evento: ");
        Nombre = Lector.nextLine();
        System.out.println("Ingrese un lugar para el evento:");
        Lugar = Lector.nextLine();
        System.out.println("Ingrese un dia para el evento:");
        Dia = Lector.nextLine();
        System.out.println("Ingrese una hora para el evento:");
        Hora = Lector.nextLine();
        System.out.println("Ingrese especificaciones para el evento:");
        Especificaciones = Lector.nextLine();
        DatosEventos nuevoEvento = new DatosEventos(Nombre,Lugar,Dia,Hora,Especificaciones);
        pilaEjemplo.apilar(nuevoEvento);
    }

    public static void MostrarEvento() {
       pilaEjemplo.listar();
    }

}
