package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Productora;

public class PruebaSistema {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion; 
		final int AGREGAR_MUSICO = 1;
		final int AGREGAR_BANDA = 2;
		final int AGREGAR_FESTIVAL = 3;
		final int QUITAR_MUSICO = 1;
		final int QUITAR_BANDA = 2;
		
		
		do {
			System.out.println("�Bienvenido al Sistema de Gesti�n!");
			System.out.println("Ingrese nombre de la Productora: ");
			String productora = input.next();
			Productora produ = new Productora (productora);
			
			System.out.println("Ingrese la opci�n deseada: ");	
			System.out.println("1 - para MEN� AGREGAR: ");
			System.out.println("2 - para MEN� QUITAR: ");
			System.out.println("3 - para MEN� MODIFICAR BANDA: ");
			
			opcion = Integer.parseInt(input.nextLine());
			switch (opcion) {
			case 1:
				System.out.println( AGREGAR_MUSICO + " - para agregar M�SICO a la productora");
				System.out.println( AGREGAR_BANDA + " - para agregar BANDA a la productora");
				System.out.println( AGREGAR_FESTIVAL + " - para agregar FESTIVAL a realizar");
				break;
			
			case 2:
				System.out.println( QUITAR_MUSICO + " - para quitar M�SICO de la productora");
				System.out.println( QUITAR_BANDA + " - para quitar BANDA de la productora");
				break;
			
			case 3:
				System.out.println("");
			default:
				break;
			}
			
		}while(opcion != 0);

	

	}

}
