package com.example.codigojava.EstructurasDeDatos.IU;

import java.util.Scanner;

public class Menu {
	
	public static void Comenzar() {
		System.out.println("Bienvenido a Eventos UNAL\n");
	}
	
	public static int RetornarOpcion() {
		
		Scanner Lector = new Scanner(System.in);
		int OpcionSeleccionada = Lector.nextInt();
		return OpcionSeleccionada;
	}
	
	public static void MostrarMenu() {
		System.out.println("Seleccione una opción: \n1.Organizador \n2.Participante \n3.Programador \n0.Salir \n");
	}
	
	public static void MostrarMenuTipoEvento() {
		System.out.println("Seleccione una opción: \n1.Cultural \n2.Academico \n0.Regresar al menú principal \n");
	}
	
	public static void MostrarMenuCultural() {
		System.out.println("Seleccione una opción: \n1.Ingresar datos \n2.Eliminar datos \n0.Regresar al menú principal \n");
	}
	
	public static void MostrarMenuAcademico() {
		System.out.println("Seleccione una opción: \n1.Facultad 1 \n2.Facultad 2 \n3.Facultad 3 \n0.Regresar al menú principal \n");
	}
	
	public static void MostrarMenuFacultades() {
		System.out.println("Seleccione una opción: \n1.Ingresar datos \n2.Eliminar datos \n0.Regresar al menú principal \n");
	}

	public static void MostrarMenuOrganizador() {
		System.out.println("Seleccione una opción: \n1.Crear Evento \n2. Ver Eventos \n0.Regresar al menú principal \n");
	}

	public static void MostrarMenuParticipante() {
		System.out.println("Seleccione una opción: \n1.Unirse a cola \n2. Ver Eventos \n0.Regresar al menú principal \n");
	}


}
