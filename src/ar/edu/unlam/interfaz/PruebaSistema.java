package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Bajista;
import ar.edu.unlam.dominio.Banda;
import ar.edu.unlam.dominio.Baterista;
import ar.edu.unlam.dominio.Cantante;
import ar.edu.unlam.dominio.Festival;
import ar.edu.unlam.dominio.Genero;
import ar.edu.unlam.dominio.Guitarrista;
import ar.edu.unlam.dominio.Musico;
import ar.edu.unlam.dominio.Otro;
import ar.edu.unlam.dominio.Productora;
import ar.edu.unlam.dominio.TipoGuitarra;
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
		final int BAJISTA = 2;
		final int BATERISTA = 3;
		final int GUITARRISTA = 4;
		final int OTRO = 5;
		Boolean cantaONo;
		Boolean seAgrego;
		int op;
		Genero generoBanda = null;
		String nombre;
		String apellido;
		String nombreArtistico;

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
				case AGREGAR_MUSICO: {
					Integer id;
					
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
					} while (op != 1 && op != 2);
					Boolean formacionAcademica;
					if (op == 1) {
						formacionAcademica = true;
					} else
						formacionAcademica = false;

					do {
						System.out.println("�Maneja m�s de un instrumento? 1 para SI - 2 para NO");
						op = teclado.nextInt();
					} while (op != 1 && op != 2);
					Boolean manejaMasDeUnInstrumento;
					if (op == 1) {
						manejaMasDeUnInstrumento = true;
					} else
						manejaMasDeUnInstrumento = false;

					System.out.println("Seleccione rol principal seg�n su instrumento: ");
					System.out.println(CANTANTE + " - para CANTANTE");
					System.out.println(BAJISTA + " - para BAJISTA");
					System.out.println(BATERISTA + " - para BATERISTA");
					System.out.println(GUITARRISTA + " - para GUITARRISTA");
					System.out.println(OTRO + " - para OTRO");
					op = teclado.nextInt();
					switch (op) {
					case CANTANTE:
						do {
							System.out.println("�El cantante es tambi�n compositor? 1 para SI - 2 para NO");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);
						Boolean esCompositor;
						if (op == 1) {
							esCompositor = true;
						} else
							esCompositor = false;
						Musico cantante = new Cantante(id, nombre, apellido, nombreArtistico, formacionAcademica,
								manejaMasDeUnInstrumento, esCompositor);
						seAgrego = produ.agregarMusico(cantante);
						if (seAgrego) {
							System.out.println("Se agrego el m�sico correctamente");
						} else
							System.out.println("Error al agregar m�sico. Intente de nuevo.");
						break;
					case BAJISTA:
						do {
							System.out.println("�Canta? 1 para SI - 2 para NO");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);

						if (op == 1) {
							cantaONo = true;
						} else
							cantaONo = false;
						do {
							System.out.println("�C�mo usa las cuerdas? 1 para DEDOS - 2 para P�A");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);
						UsoCuerdas usoCuerdas;
						if (op == 1) {
							usoCuerdas = UsoCuerdas.CON_DEDOS;
						} else
							usoCuerdas = UsoCuerdas.CON_PUA;
						Musico bajista = new Bajista(id, nombre, apellido, nombreArtistico, formacionAcademica,
								manejaMasDeUnInstrumento, cantaONo, usoCuerdas);
						seAgrego = produ.agregarMusico(bajista);
						if (seAgrego) {
							System.out.println("Se agrego el m�sico correctamente");
						} else
							System.out.println("Error al agregar m�sico. Intente de nuevo.");
						break;
					case BATERISTA:
						do {
							System.out.println("�Canta? 1 para SI - 2 para NO");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);
						if (op == 1) {
							cantaONo = true;
						} else
							cantaONo = false;
						System.out.println("Ingrese cantidad de partes de la Bater�a");
						Integer partesDeLaBateria = teclado.nextInt();
						Musico baterista = new Baterista(id, nombre, apellido, nombreArtistico, formacionAcademica,
								manejaMasDeUnInstrumento, cantaONo, partesDeLaBateria);
						seAgrego = produ.agregarMusico(baterista);
						if (seAgrego) {
							System.out.println("Se agrego el m�sico correctamente");
						} else
							System.out.println("Error al agregar m�sico. Intente de nuevo.");
						break;
					case GUITARRISTA:
						do {
							System.out.println("�Canta? 1 para SI - 2 para NO");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);

						if (op == 1) {
							cantaONo = true;
						} else
							cantaONo = false;
						do {
							System.out.println("�C�mo usa las cuerdas? 1 para DEDOS - 2 para P�A");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);
						if (op == 1) {
							usoCuerdas = UsoCuerdas.CON_DEDOS;
						} else
							usoCuerdas = UsoCuerdas.CON_PUA;
						do {
							System.out.println("�Qu� tipo de guitarra usa? 1 para AC�STICA - 2 para EL�CTRICA");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);
						TipoGuitarra tipoGuitarra;
						if (op == 1) {
							tipoGuitarra = TipoGuitarra.ACUSTICA;
						} else
							tipoGuitarra = TipoGuitarra.ELECTRICA;
						Musico guitarrista = new Guitarrista(id, nombre, apellido, nombreArtistico, formacionAcademica,
								manejaMasDeUnInstrumento, cantaONo, tipoGuitarra, usoCuerdas);
						seAgrego = produ.agregarMusico(guitarrista);
						if (seAgrego) {
							System.out.println("Se agrego el m�sico correctamente");
						} else
							System.out.println("Error al agregar m�sico. Intente de nuevo.");
						break;
					case OTRO:
						do {
							System.out.println("�Canta? 1 para SI - 2 para NO");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);

						if (op == 1) {
							cantaONo = true;
						} else
							cantaONo = false;
						System.out.println("Ingrese descripci�n de la tarea del m�sico - �Qu� instrumento toca?");
						String descripcion = teclado.next();
						Musico otro = new Otro(id, nombre, apellido, nombreArtistico, formacionAcademica,
								manejaMasDeUnInstrumento, descripcion, cantaONo);
						break;
					}

					
					break;
				}
				case AGREGAR_BANDA:
					System.out.println("Ingrese ID de la banda: ");
					Integer id = teclado.nextInt();
					System.out.println("Ingrese n�mero de integrantes: ");
					Integer nroIntegrantes = teclado.nextInt();
					
					do {
					System.out.println("Seleccione el g�nero de la banda: ");
					System.out.println("1 - para ROCK");
					System.out.println("2 - para POP");
					System.out.println("3 - para INDIE");
					System.out.println("4 - para JAZZ");
					System.out.println("5 - para METAL");
					System.out.println("6 - para RAP");
					System.out.println("7 - para TRAP");
					System.out.println("8 - para REGGAETON");
					System.out.println("9 - para CUMBIA");
					System.out.println("0 - para REGGAE");
					op = teclado.nextInt();
					}while(op < 0 || op > 9);
					switch(op) {
					case 1:
						generoBanda = Genero.ROCK;
						break;
					case 2:
						generoBanda = Genero.POP;
						break;
					case 3:
						generoBanda = Genero.INDIE;
						break;
					case 4:
						generoBanda = Genero.JAZZ;
						break;
					case 5:
						generoBanda = Genero.METAL;
						break;
					case 6:
						generoBanda = Genero.RAP;
						break;
					case 7:
						generoBanda = Genero.TRAP;
						break;
					case 8:
						generoBanda = Genero.REGGAETON;
						break;
					case 9:
						generoBanda = Genero.CUMBIA;
						break;
					case 0:
						generoBanda = Genero.REGGAE;
						break;
					default:
						break;
					}
					Banda banda = new Banda(id, nroIntegrantes, generoBanda);
					seAgrego = produ.agregarBanda(banda);
					if(seAgrego) {
						System.out.println("Se agreg� banda en blanco. Procediendo a cargar los integrantes...");
					} else System.out.println("Error al agregar banda. Intente nuevamente.");
					for (int i = 0; i < nroIntegrantes; i++) {
						System.out.println("Agregar m�sico n�mero " + i);
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
						} while (op != 1 && op != 2);
						Boolean formacionAcademica;
						if (op == 1) {
							formacionAcademica = true;
						} else
							formacionAcademica = false;

						do {
							System.out.println("�Maneja m�s de un instrumento? 1 para SI - 2 para NO");
							op = teclado.nextInt();
						} while (op != 1 && op != 2);
						Boolean manejaMasDeUnInstrumento;
						if (op == 1) {
							manejaMasDeUnInstrumento = true;
						} else
							manejaMasDeUnInstrumento = false;

						System.out.println("Seleccione rol principal seg�n su instrumento: ");
						System.out.println(CANTANTE + " - para CANTANTE");
						System.out.println(BAJISTA + " - para BAJISTA");
						System.out.println(BATERISTA + " - para BATERISTA");
						System.out.println(GUITARRISTA + " - para GUITARRISTA");
						System.out.println(OTRO + " - para OTRO");
						op = teclado.nextInt();
						switch (op) {
						case CANTANTE:
							do {
								System.out.println("�El cantante es tambi�n compositor? 1 para SI - 2 para NO");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);
							Boolean esCompositor;
							if (op == 1) {
								esCompositor = true;
							} else
								esCompositor = false;
							Musico cantante = new Cantante(id, nombre, apellido, nombreArtistico, formacionAcademica,
									manejaMasDeUnInstrumento, esCompositor);
							seAgrego = produ.agregarMusico(cantante);
							if (seAgrego) {
								System.out.println("Se agrego el m�sico correctamente");
							} else
								System.out.println("Error al agregar m�sico. Intente de nuevo.");
							break;
						case BAJISTA:
							do {
								System.out.println("�Canta? 1 para SI - 2 para NO");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);

							if (op == 1) {
								cantaONo = true;
							} else
								cantaONo = false;
							do {
								System.out.println("�C�mo usa las cuerdas? 1 para DEDOS - 2 para P�A");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);
							UsoCuerdas usoCuerdas;
							if (op == 1) {
								usoCuerdas = UsoCuerdas.CON_DEDOS;
							} else
								usoCuerdas = UsoCuerdas.CON_PUA;
							Musico bajista = new Bajista(id, nombre, apellido, nombreArtistico, formacionAcademica,
									manejaMasDeUnInstrumento, cantaONo, usoCuerdas);
							seAgrego = produ.agregarMusico(bajista);
							if (seAgrego) {
								System.out.println("Se agrego el m�sico correctamente");
							} else
								System.out.println("Error al agregar m�sico. Intente de nuevo.");
							break;
						case BATERISTA:
							do {
								System.out.println("�Canta? 1 para SI - 2 para NO");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);
							if (op == 1) {
								cantaONo = true;
							} else
								cantaONo = false;
							System.out.println("Ingrese cantidad de partes de la Bater�a");
							Integer partesDeLaBateria = teclado.nextInt();
							Musico baterista = new Baterista(id, nombre, apellido, nombreArtistico, formacionAcademica,
									manejaMasDeUnInstrumento, cantaONo, partesDeLaBateria);
							seAgrego = produ.agregarMusico(baterista);
							if (seAgrego) {
								System.out.println("Se agrego el m�sico correctamente");
							} else
								System.out.println("Error al agregar m�sico. Intente de nuevo.");
							break;
						case GUITARRISTA:
							do {
								System.out.println("�Canta? 1 para SI - 2 para NO");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);

							if (op == 1) {
								cantaONo = true;
							} else
								cantaONo = false;
							do {
								System.out.println("�C�mo usa las cuerdas? 1 para DEDOS - 2 para P�A");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);
							if (op == 1) {
								usoCuerdas = UsoCuerdas.CON_DEDOS;
							} else
								usoCuerdas = UsoCuerdas.CON_PUA;
							do {
								System.out.println("�Qu� tipo de guitarra usa? 1 para AC�STICA - 2 para EL�CTRICA");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);
							TipoGuitarra tipoGuitarra;
							if (op == 1) {
								tipoGuitarra = TipoGuitarra.ACUSTICA;
							} else
								tipoGuitarra = TipoGuitarra.ELECTRICA;
							Musico guitarrista = new Guitarrista(id, nombre, apellido, nombreArtistico, formacionAcademica,
									manejaMasDeUnInstrumento, cantaONo, tipoGuitarra, usoCuerdas);
							seAgrego = produ.agregarMusico(guitarrista);
							if (seAgrego) {
								System.out.println("Se agrego el m�sico correctamente");
							} else
								System.out.println("Error al agregar m�sico. Intente de nuevo.");
							break;
						case OTRO:
							do {
								System.out.println("�Canta? 1 para SI - 2 para NO");
								op = teclado.nextInt();
							} while (op != 1 && op != 2);

							if (op == 1) {
								cantaONo = true;
							} else
								cantaONo = false;
							System.out.println("Ingrese descripci�n de la tarea del m�sico - �Qu� instrumento toca?");
							String descripcion = teclado.next();
							Musico otro = new Otro(id, nombre, apellido, nombreArtistico, formacionAcademica,
									manejaMasDeUnInstrumento, descripcion, cantaONo);
							break;
						}			
					}
				case AGREGAR_FESTIVAL:
					System.out.println("Ingrese nombre del Festival: ");
					nombre = teclado.next();
					System.out.println("Ingrese d�as de duraci�n: ");
					Integer diasDeDuracion = teclado.nextInt();
					System.out.println("Ingrese ID del Festival: ");
					id = teclado.nextInt();
					System.out.println("Ingrese cantidad m�xima de espectadores: ");
					Integer cantidadMax = teclado.nextInt();
					Festival festival = new Festival(nombre, diasDeDuracion, id, cantidadMax);
					seAgrego = produ.agregarFestival(festival);
					if(seAgrego) {
						System.out.println("Festival agregado correctamente");
					} else System.out.println("Error al agregar festival. Intente nuevamente.");
					
					do {
						System.out.println("Ingrese 1 para INICIAR FESTIVAL");
						System.out.println("Ingrese 2 para FINALIZAR FESTIVAL");
						op = teclado.nextInt();
						} while (op != 1 && op != 2);
						if (op == 1) {
							festival.empezarFestival();
						} else festival.finalizarFestival();
						
					do {
						System.out.println("Seleccione opci�n");
						System.out.println("1 - para agregar banda existente a Festival ");
						System.out.println("2 - para quitar banda existente de Festival ");
						op = teclado.nextInt();
						}while (op != 1 && op != 2);
						if(op == 1) {
							System.out.println("Ingrese ID Festival a modificar: ");
							id = teclado.nextInt();
							System.out.println("Ingrese ID de Banda a agregar: ");
							Integer idBanda = teclado.nextInt();
							
						}
					
					break;
				default:
					break;
				}
				break;

			case 2:
				do {
				System.out.println(QUITAR_MUSICO + " - para quitar M�SICO de la productora");
				System.out.println(QUITAR_BANDA + " - para quitar BANDA de la productora");
				op = teclado.nextInt();
				} while (op != 1 && op != 2);
				switch(op) {
				case QUITAR_MUSICO:
					System.out.println("Ingrese id del m�sico a sacar: ");
					Integer id = teclado.nextInt();
					Boolean seQuito = produ.quitarMusico(id);
					if(seQuito) {
						System.out.println("M�sico quitado correctamente de la productora.");	
					} else System.out.println("Error al quitar m�sico de la productora. Intente nuevamente.");
				break;
				case QUITAR_BANDA:
					System.out.println("Ingrese id de la banda a sacar");
					id = teclado.nextInt();
					seQuito = produ.quitarBanda(id);
					if(seQuito) {
						System.out.println("Banda quitada correctamente de la productora.");	
					} else System.out.println("Error al quitar banda de la productora. Intente nuevamente.");
					break;
				default:
					break;
				}
				break;

			case 3:
				Integer idBanda = null;
				Integer idMusico = null;
				do {
				System.out.println(AGREGAR_MUSICO_BANDA_EXISTENTE + " - para agregar M�SICO a banda existente");
				System.out.println(QUITAR_MUSICO_BANDA_EXISTENTE + " - para quitar M�SICO de banda existente");
				op = teclado.nextInt();
				} while (op != 1 && op != 2);
				if(op == AGREGAR_MUSICO_BANDA_EXISTENTE) {
					System.out.println("Ingrese ID de banda: ");
					idBanda = teclado.nextInt();
					System.out.println("Ingrese ID de m�sico a agregar (ya debe estar cargado en la lista de musicos)");
					idMusico = teclado.nextInt();
					seAgrego = produ.agregarMusicoAUnaBanda(idBanda, idMusico);
					if(seAgrego) {
						System.out.println("Se agreg� m�sico a la banda.");
					} else System.out.println("Error en alguno de los datos. Chequee los ID.");
				}else {
					produ.quitarMusicoDeUnaBanda(idBanda, idMusico);
				}
				break;
			case 4:
				
				break;
			default:
				break;
			
		}
		
		} while (opcion != 0);

	}

}
