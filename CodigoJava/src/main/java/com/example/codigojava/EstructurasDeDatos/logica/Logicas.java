package com.example.codigojava.EstructurasDeDatos.logica;

import com.example.codigojava.EstructurasDeDatos.IU.Menu;
import com.example.codigojava.EstructurasDeDatos.IU.MenuCrearEvento.CreacionEvento;
import com.example.codigojava.EstructurasDeDatos.IU.MenuUsuario.PonerEnCola;
import com.example.codigojava.EstructurasDeDatos.PilaEventos.NodoPila;

import java.util.ArrayList;

public class Logicas {
    public static void main(String[] args) {
        //Datos que ingrese el usuario

        Menu.Comenzar();
        Menu.MostrarMenu();
        int Opcion = Menu.RetornarOpcion();
        System.out.println();
        int Salir = 0;
        while(Opcion != Salir) {
            switch (Opcion) {
                case 1:
                    Menu.MostrarMenuOrganizador();
                    int Opcion1 =Menu.RetornarOpcion();
                    System.out.println();
                    while(Opcion1 != Salir) {
                        switch(Opcion1) {
                            case 1:
                                System.out.println();
                                CreacionEvento.IngresarDatos();
                                break;

                            case 2:
                                System.out.println();
                                ArrayList<NodoPila> listaDatosPila = CreacionEvento.MostrarEvento();
                                for (int i = 0; i < listaDatosPila.toArray().length; i++) {
                                    // aqui se puede referir al objeto con arreglo[i];
                                    System.out.println(listaDatosPila.get(i).getValor().getNombre());
                                }
                                break;

                            case 3:
                                System.out.println();
                                break;

                            default:
                                System.out.println("Error\n");
                        }
                        Menu.MostrarMenuOrganizador();
                        Opcion1 = Menu.RetornarOpcion();
                        System.out.println();
                    }
                    break;

                case 2:
                    Menu.MostrarMenuParticipante();
                    int Opcion2 =Menu.RetornarOpcion();
                    System.out.println();
                    while(Opcion2 != Salir) {
                        switch(Opcion2) {
                            case 1:
                                PonerEnCola.IngresarDatos();
                                System.out.println();
                                break;

                            case 2:
                                CreacionEvento.MostrarEvento();
                                System.out.println();
                                break;

                            default:
                                System.out.println("Error\n");
                        }
                        Menu.MostrarMenuParticipante();
                        Opcion2 = Menu.RetornarOpcion();
                        System.out.println();
                    }
                    break;

                case 3:
                    Menu.MostrarMenuFacultades();
                    int Opcion5 =Menu.RetornarOpcion();
                    System.out.println();
                    while(Opcion5 != Salir) {
                        switch(Opcion5) {
                            case 1:
                                System.out.println();
                                break;

                            case 2:
                                System.out.println();
                                break;

                            default:
                                System.out.println("Error\n");
                        }
                        Menu.MostrarMenuFacultades();
                        Opcion5 = Menu.RetornarOpcion();
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Error\n");
            }
            Menu.MostrarMenu();
            Opcion =Menu.RetornarOpcion();
            System.out.println();
        }
        System.out.println("Muchas gracias por usar Eventos UNAL");
    }

}
