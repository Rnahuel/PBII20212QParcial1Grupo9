package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Bajista;
import ar.edu.unlam.dominio.Cantante;
import ar.edu.unlam.dominio.Musico;
import ar.edu.unlam.dominio.Productora;
import ar.edu.unlam.dominio.UsoCuerdas;

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
		Boolean cantaONo;
		
		do {
			System.out.println("¡Bienvenido al Sistema de Gestión!");
			System.out.println("Ingrese nombre de la Productora: ");
			String productora = teclado.next();
			Productora produ = new Productora(productora);

			System.out.println("Ingrese la opción deseada: ");
			System.out.println("1 - para MENÚ AGREGAR: ");
			System.out.println("2 - para MENÚ QUITAR: ");
			System.out.println("3 - para MENÚ MODIFICAR BANDA: ");
			
			System.out.println("0 - para SALIR");

			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(AGREGAR_MUSICO + " - para agregar MÚSICO a la productora");
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
					System.out.println("Agregar Músico");
					System.out.println("Ingrese ID de músico: ");
					id = teclado.nextInt();
					System.out.println("Ingrese nombre: ");
					nombre = teclado.next();
					System.out.println("Ingrese apellido: ");
					apellido = teclado.next();
					System.out.println("Ingrese nombre artístico: ");
					nombreArtistico = teclado.next();
					do {
					System.out.println("¿Tiene formación académica? 1 para SI - 2 para NO");
					op = teclado.nextInt();
					}while(op != 1 && op != 2);
					Boolean formacionAcademica;
					if(op == 1) {
						formacionAcademica = true;
					} else formacionAcademica = false;
					
					do {
					System.out.println("¿Maneja más de un instrumento? 1 para SI - 2 para NO");
					op = teclado.nextInt();
					}while(op != 1 && op != 2);
					Boolean manejaMasDeUnInstrumento;
					if(op == 1) {
						manejaMasDeUnInstrumento = true;
					} else manejaMasDeUnInstrumento = false;
					
					System.out.println("Seleccione rol principal según su instrumento: ");
					System.out.println(CANTANTE +" - para CANTANTE");
					System.out.println(BAJISTA +" - para BAJISTA");
					System.out.println(BATERISTA +" - para BATERISTA");
					System.out.println(GUITARRISTA +" - para GUITARRISTA");
					System.out.println(OTRO +" - para OTRO");
					op = teclado.nextInt();
					switch(op){
					case CANTANTE:
						do {
							System.out.println("¿El cantante es también compositor? 1 para SI - 2 para NO");
							op = teclado.nextInt();
							}while(op != 1 && op != 2);
							Boolean esCompositor;
							if(op == 1) {
								esCompositor = true;
							} else esCompositor = false;
						Cantante cantante = new Cantante(id, nombre, apellido, nombreArtistico, formacionAcademica, manejaMasDeUnInstrumento, esCompositor);
						break;
					case BAJISTA:
						do {
							System.out.println("¿Canta? 1 para SI - 2 para NO");
							op = teclado.nextInt();
							}while(op != 1 && op != 2);

							if(op == 1) {
								cantaONo = true;
							} else cantaONo = false;
							do {
								System.out.println("¿Cómo usa las cuerdas? 1 para DEDOS - 2 para PÚA");
								op = teclado.nextInt();
								}while(op != 1 && op != 2);
								UsoCuerdas usoCuerdas;
								if(op == 1) {
									usoCuerdas = UsoCuerdas.CON_DEDOS;
								} else usoCuerdas = UsoCuerdas.CON_PUA;
								Bajista bajista = new Bajista(id, nombre, apellido, nombreArtistico, formacionAcademica, manejaMasDeUnInstrumento, cantaONo, usoCuerdas);
						break;
					case BATERISTA:
						do {
							System.out.println("¿Canta? 1 para SI - 2 para NO");
							op = teclado.nextInt();
							}while(op != 1 && op != 2);
							if(op == 1) {
								cantaONo = true;
							} else cantaONo = false;
							System.out.println("Ingrese cantidad de partes de la Batería");
						break;
					case GUITARRISTA:
						break;
					case OTRO:
						break;
					}
					
					//Musico musico = new Musico(id, nombre, apellido, nombreArtistico, formacionAcademica, manejaMasDeUnInstrumento);
					break;
				}

				default:
					break;
				}
				break;
	
			case 2:
				System.out.println(QUITAR_MUSICO + " - para quitar MÚSICO de la productora");
				System.out.println(QUITAR_BANDA + " - para quitar BANDA de la productora");
				break;

			case 3:
				System.out.println(AGREGAR_MUSICO_BANDA_EXISTENTE + " - para agregar MÚSICO a banda existente");
				System.out.println(QUITAR_MUSICO_BANDA_EXISTENTE + " - para quitar MÚSICO de banda existente");
			default:
				break;
			}

		}while(opcion!=0);

}

}
