package com.example.entregados.EstructurasDeDatos.PilaEventos;

import com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento.DatosEventos;

public class Pilas {
    private PilaEventos pilaEjemplo;

    public void Pilas(){
        PilaEventos pilaEjemplo = new PilaEventos();

    }
    public void setValor(PilaEventos valor) {
        this.pilaEjemplo = valor;
    }
    PilaEventos retornar(){
        return this.pilaEjemplo;
    }
}
