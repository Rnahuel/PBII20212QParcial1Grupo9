package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Cantante;
import ar.edu.unlam.dominio.Musico;
import ar.edu.unlam.dominio.Productora;

public class PruebaSistema {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		final int AGREGAR_MUSICO = 1;
		final int AGREGAR_BANDA = 2;
		final int AGREGAR_FESTIVAL = 3;
		final int QUITAR_MUSICO = 1;
		final int QUITAR_BANDA = 2;
		final int AGREGAR_MUSICO_BANDA_EXISTENTE = 1;
		final int QUITAR_MUSICO_BANDA_EXISTENTE = 2;
		final int CANTANTE = 1;
		final int BAJISTA= 2;
		final int BATERISTA = 3;
		final int GUITARRISTA = 4;
		final int OTRO = 5;
		
		do {
			System.out.println("�Bienvenido al Sistema de Gesti�n!");
			System.out.println("Ingrese nombre de la Productora: ");
			String productora = teclado.next();
			Productora produ = new Productora(productora);

			System.out.println("Ingrese la opci�n deseada: ");
			System.out.println("1 - para MEN� AGREGAR: ");
			System.out.println("2 - para MEN� QUITAR: ");
			System.out.println("3 - para MEN� MODIFICAR BANDA: ");
			
			System.out.println("0 - para SALIR");

			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(AGREGAR_MUSICO + " - para agregar M�SICO a la productora");
				System.out.println(AGREGAR_BANDA + " - para agregar BANDA a la productora");
				System.out.println(AGREGAR_FESTIVAL + " - para crear FESTIVAL a realizar");
				int opcionMenu1 = teclado.nextInt();
				switch (opcionMenu1) {
				case AGREGAR_MUSICO:{
					Integer id;
					String nombre;
					String apellido;
					String nombreArtistico;
					int op;
					System.out.println("Agregar M�sico");
					System.out.println("Ingrese ID de m�sico: ");
					id = teclado.nextInt();
					System.out.println("Ingrese nombre: ");
					nombre = teclado.next();
					System.out.println("Ingrese apellido: ");
					apellido = teclado.next();
					System.out.println("Ingrese nombre art�stico: ");
					nombreArtistico = teclado.next();
					do {
					System.out.println("�Tiene formaci�n acad�mica? 1 para SI - 2 para NO");
					op = teclado.nextInt();
					}while(op != 1 && op != 2);
					Boolean formacionAcademica;
					if(op == 1) {
						formacionAcademica = true;
					} else formacionAcademica = false;
					
					do {
					System.out.println("�Maneja m�s de un instrumento? 1 para SI - 2 para NO");
					op = teclado.nextInt();
					}while(op != 1 && op != 2);
					Boolean manejaMasDeUnInstrumento;
					if(op == 1) {
						manejaMasDeUnInstrumento = true;
					} else manejaMasDeUnInstrumento = false;
					
					System.out.println("Seleccione rol principal seg�n su instrumento: ");
					System.out.println(CANTANTE +" - para CANTANTE");
					System.out.println(BAJISTA +" - para BAJISTA");
					System.out.println(BATERISTA +" - para BATERISTA");
					System.out.println(GUITARRISTA +" - para GUITARRISTA");
					System.out.println(OTRO +" - para OTRO");
					op = teclado.nextInt();
					switch(op){
					case CANTANTE:
						Cantante musico = new Cantante(id, nombre, apellido, nombreArtistico, formacionAcademica, manejaMasDeUnInstrumento);
					}
					
					Musico musico = new Musico(id, nombre, apellido, nombreArtistico, formacionAcademica, manejaMasDeUnInstrumento);
					break;
				}

				default:
					break;
				}
				break;
	
			case 2:
				System.out.println(QUITAR_MUSICO + " - para quitar M�SICO de la productora");
				System.out.println(QUITAR_BANDA + " - para quitar BANDA de la productora");
				break;

			case 3:
				System.out.println(AGREGAR_MUSICO_BANDA_EXISTENTE + " - para agregar M�SICO a banda existente");
				System.out.println(QUITAR_MUSICO_BANDA_EXISTENTE + " - para quitar M�SICO de banda existente");
			default:
				break;
			}

		}while(opcion!=0);

}

}
