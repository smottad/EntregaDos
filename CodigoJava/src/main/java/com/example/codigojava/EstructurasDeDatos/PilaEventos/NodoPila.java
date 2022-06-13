package com.example.codigojava.EstructurasDeDatos.PilaEventos;

import com.example.codigojava.EstructurasDeDatos.IU.MenuCrearEvento.DatosEventos;

public class NodoPila {
    // Variable en la cual se va a guardar el valor.
    private DatosEventos valor;
    // Variable para enlazar los nodos.
    private NodoPila siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public NodoPila(){
        this.valor = null;
        this.siguiente = null;
    }

    // Métodos get y set para los atributos.

    public DatosEventos getValor() {
        return valor;
    }

    public void setValor(DatosEventos valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}

