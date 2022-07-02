package com.example.entregados.EstructurasDeDatos;

import com.example.entregados.EstructurasDeDatos.ArbolesAVL.NodoArbolAVL;
import com.example.entregados.EstructurasDeDatos.ArbolesAVL.ArbolAVL;

import java.util.HashMap;

public class Pruebatiempo {
    private static NodoArbolAVL raiz;
    public static void main(String[] args) {
        System.out.println("Prueba 100 millones datos");

        HashMap<Long, Integer> hashMap = new HashMap<>();
        ArbolAVL arbol = new ArbolAVL();

/*        for (long i = 0; i < 100000000; ++i) {
            arbol.insertar((int) i);
        }*/
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        //ALGORITMO
        for (long i = 0; i < 100000000; ++i) {
            hashMap.put(i, 1);
        }

        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = (TFin - TInicio); //Calculamos los milisegundos de diferencia
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos

    }
}

