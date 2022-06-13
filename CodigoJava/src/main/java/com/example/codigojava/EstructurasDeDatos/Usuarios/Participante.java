package com.example.codigojava.EstructurasDeDatos.Usuarios;

public class Participante {
    String Nombre;
    String Edad;
    String Genero;


    public Participante (String Nombre, String Edad, String Genero){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre (String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }
    public void setEdad (String Lugar) {
        this.Edad = Lugar;
    }

    public String getGenero() {
        return Genero;
    }
    public void setGenero (String Dia) {
        this.Genero = Dia;
    }



}

