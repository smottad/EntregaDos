package com.example.entregados.EstructurasDeDatos.IU.MenuCrearEvento;

public class DatosEventos {
    String Nombre;
    String Lugar;
    String Dia;
    String Hora;
    String Especificaciones;

    public DatosEventos (String Nombre, String Lugar, String Dia, String Hora, String Especificaciones){
        this.Nombre = Nombre;
        this.Lugar = Lugar;
        this.Dia = Dia;
        this.Hora = Hora;
        this.Especificaciones = Especificaciones;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre (String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLugar() {
        return Lugar;
    }
    public void setLugar (String Lugar) {
        this.Lugar = Lugar;
    }

    public String getDia() {
        return Dia;
    }
    public void setDia (String Dia) {
        this.Dia = Dia;
    }

    public String getHora() {
        return Hora;
    }
    public void setHora (String Hora) {
        this.Hora = Hora;
    }

    public String getEspecificaciones() {
        return Especificaciones;
    }
    public void setEspecificaciones (String Especificaciones) {
        this.Especificaciones = Especificaciones;
    }

}