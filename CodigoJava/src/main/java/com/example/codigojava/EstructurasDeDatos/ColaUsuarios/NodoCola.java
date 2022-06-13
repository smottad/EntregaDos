package com.example.codigojava.EstructurasDeDatos.ColaUsuarios;

import com.example.codigojava.EstructurasDeDatos.Usuarios.Participante;

public class NodoCola {
    // Variable en la cual se va a guardar el valor.
    private Participante valor;
    // Variable para enlazar los nodos.
    private NodoCola siguiente;
    private NodoCola anterior;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public NodoCola(){
        this.valor = null;
        this.siguiente = null;
        this.anterior = null;
    }

    // Métodos get y set para los atributos.

    public Participante getValor() {
        return valor;
    }

    public void setValor(Participante valor) {
        this.valor = valor;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCola getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCola anterior) {
        this.anterior = anterior;
    }
}
