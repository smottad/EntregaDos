package com.example.entregados.EstructurasDeDatos.IU.MenuUsuario;

import com.example.entregados.EstructurasDeDatos.ColaUsuarios.ColaUsuarios;

import com.example.entregados.EstructurasDeDatos.Usuarios.Participante;

import java.util.Scanner;

public class PonerEnCola {
    static String Nombre;
    static String Edad;
    static String Genero;

    static Scanner Lector = new Scanner(System.in);
    static ColaUsuarios colaEjemplo = new ColaUsuarios();

    public static void IngresarDatos() {
        System.out.println("Ingrese un nombre: ");
        Nombre = Lector.next();
        System.out.println("Ingrese su edad: ");
        Edad = Lector.next();
        System.out.println("Ingrese su genero: ");
        Genero = Lector.next();

        Participante nuevoParticipante = new Participante(Nombre,Edad,Genero);
        colaEjemplo.encolar(nuevoParticipante);
    }
}
