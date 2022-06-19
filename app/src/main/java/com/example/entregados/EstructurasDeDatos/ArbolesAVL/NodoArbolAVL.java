package com.example.entregados.EstructurasDeDatos.ArbolesAVL;
//Clase Nodo
public class NodoArbolAVL {
    int dato, fe;
    String contenido;
    NodoArbolAVL hijoIzdo, hijoDcho;

    public NodoArbolAVL(int dato) {
        this.dato = dato;
        this.fe = 0;
        this.contenido = null;
        this.hijoIzdo = null;
        this.hijoDcho = null;
    }
}
