package com.example.codigojava.EstructurasDeDatos;

import com.example.codigojava.EstructurasDeDatos.ColaUsuarios.ColaUsuarios;
import com.example.codigojava.EstructurasDeDatos.PilaEventos.PilaEventos;

public class Pruebatiempo {
    public static void main(String[] args) {
        System.out.println("Prueba 100 millones datos");
        PilaEventos pilaEjemplo = new PilaEventos();
        for (long i = 0; i < 100000000; ++i) {
            pilaEjemplo.retirar();
        }
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        //ALGORITMO
        for (long i = 0; i < 100000000; ++i) {
            pilaEjemplo.retirar();
        }

        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = (TFin - TInicio); //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos

    }
}

