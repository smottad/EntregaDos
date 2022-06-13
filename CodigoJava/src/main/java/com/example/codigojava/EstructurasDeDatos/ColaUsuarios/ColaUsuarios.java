package com.example.codigojava.EstructurasDeDatos.ColaUsuarios;


import com.example.codigojava.EstructurasDeDatos.PilaEventos.NodoPila;
import com.example.codigojava.EstructurasDeDatos.Usuarios.Participante;

public class ColaUsuarios {
    private NodoCola inicioCola, finalCola;
    String Cola = "";

    public ColaUsuarios(){
        inicioCola = null;
        finalCola = null;
    }

    //Método para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    //Método para insertar a la cola
    public void encolar(Participante valor){
        NodoCola nuevo_nodo = new NodoCola();
        nuevo_nodo.setValor(valor) ;
        nuevo_nodo.setSiguiente(null);

        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.setSiguiente(nuevo_nodo);
            finalCola = nuevo_nodo;
        }
    }

    //Método para extraer de la cola
    public Participante extraer(){
        if (!ColaVacia()) {
            Participante valor = inicioCola.getValor();

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.getSiguiente();
            }
            return valor;
        }
        return null;
    }
    public void listar(){
        // Crea una copia de la cola.
        NodoCola aux = inicioCola;
        // Recorre la cola hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
