import javax.swing.JOptionPane;

import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);
	// Arreglos Fabio
	static Ocio ociosFabio[] = new Ocio[2];
	static Actividad peliculasFabio[] = new Actividad[10];
	static Actividad animesFabio[] = new Actividad[6];
	static Estudiante fabio = new Estudiante("Fabio", "Derecho", 20, 2, ociosFabio);

	// Arreglos Pedro
	static Ocio ociosPedro[] = new Ocio[3];
	static Actividad peliculasPedro[] = new Actividad[8];
	static Actividad seriesPedro[] = new Actividad[2];
	static Actividad librosPedro[] = new Actividad[9];
	static Estudiante pedro = new Estudiante("Pedro", "Diseño Industrial", 18, 3, ociosPedro);

	// Arreglos Laura
	static Ocio ociosLaura[] = new Ocio[3];
	static Actividad peliculasLaura[] = new Actividad[5];
	static Actividad animesLaura[] = new Actividad[5];
	static Actividad seriesLaura[] = new Actividad[4];
	static Estudiante laura = new Estudiante("Laura", "Diseño Industrial", 27, 3, ociosLaura);

	private static void llenarDatos() {
		// Datos de Fabio
		peliculasFabio[0] = new Actividad("It", 8);
		peliculasFabio[1] = new Actividad("El Padrino", 2);
		peliculasFabio[2] = new Actividad("Los Vengadores", 10);
		peliculasFabio[3] = new Actividad("Up", 5);
		peliculasFabio[4] = new Actividad("Toy Story", 8);
		peliculasFabio[5] = new Actividad("Jurassic Park", 1);
		peliculasFabio[6] = new Actividad("Moana", 7);
		peliculasFabio[7] = new Actividad("Lilo y Stitch", 4);
		peliculasFabio[8] = new Actividad("Rambo", 9);
		peliculasFabio[9] = new Actividad("Rapido y Furioso", 2);

		animesFabio[0] = new Actividad("Evangelion", 3);
		animesFabio[1] = new Actividad("Boku No Hero Academia", 4);
		animesFabio[2] = new Actividad("Blood C", 6);
		animesFabio[3] = new Actividad("Parasyte", 10);
		animesFabio[4] = new Actividad("Hunter x Hunter", 8);
		animesFabio[5] = new Actividad("One Piece", 3);

		ociosFabio[0] = new Ocio("Peliculas", 10, peliculasFabio);
		ociosFabio[1] = new Ocio("Animes", 6, animesFabio);

		// Datos de Pedro
		peliculasPedro[0] = new Actividad("Jurassic Park", 8);
		peliculasPedro[1] = new Actividad("Toy Story", 8);
		peliculasPedro[2] = new Actividad("It", 1);
		peliculasPedro[3] = new Actividad("Los Vengadores", 5);
		peliculasPedro[4] = new Actividad("Star Trek", 7);
		peliculasPedro[5] = new Actividad("Forrest Gump", 4);
		peliculasPedro[6] = new Actividad("Rambo", 4);
		peliculasPedro[7] = new Actividad("Interestelar", 8);

		seriesPedro[0] = new Actividad("The Walking Dead", 8);
		seriesPedro[1] = new Actividad("Stranger Things", 6);

		librosPedro[0] = new Actividad("Harry Potter", 10);
		librosPedro[1] = new Actividad("Percy Jackson", 7);
		librosPedro[2] = new Actividad("Los Legados De Lorien", 8);
		librosPedro[3] = new Actividad("Miss Peregrine", 9);
		librosPedro[4] = new Actividad("Divergente", 8);
		librosPedro[5] = new Actividad("Los Juegos Del Hambre", 5);
		librosPedro[6] = new Actividad("Las Cronicas De Narnia", 4);
		librosPedro[7] = new Actividad("Las Cronicas De Kane", 6);
		librosPedro[8] = new Actividad("Luna De Pluton", 1);
		
		ociosPedro[0] = new Ocio("Peliculas", 8, peliculasPedro);
		ociosPedro[1] = new Ocio("Series", 2, seriesPedro);
		ociosPedro[2] = new Ocio("Libros", 8, librosPedro);

		// Datos de Laura
		peliculasLaura[0] = new Actividad("Moana", 8);
		peliculasLaura[1] = new Actividad("Up", 7);
		peliculasLaura[2] = new Actividad("Cenicienta", 4);
		peliculasLaura[3] = new Actividad("Lilo y Stitch", 1);
		peliculasLaura[4] = new Actividad("Frozen", 6);

		animesLaura[0] = new Actividad("Sword Art Online", 8);
		animesLaura[1] = new Actividad("Boku No Hero Academia", 7);
		animesLaura[2] = new Actividad("One Piece", 5);
		animesLaura[3] = new Actividad("Shokugeki No Souma", 4);
		animesLaura[4] = new Actividad("Tales Of Zestiria", 7);

		seriesLaura[0] = new Actividad("Stranger Things", 6);
		seriesLaura[1] = new Actividad("La Casa De Papel", 9);
		seriesLaura[2] = new Actividad("The Big Bang Theory", 7);
		seriesLaura[3] = new Actividad("Two And A Half Men", 2);
		
		ociosLaura[0] = new Ocio("Peliculas", 5, peliculasLaura);
		ociosLaura[0] = new Ocio("Animes", 5, animesLaura);
		ociosLaura[0] = new Ocio("Series", 4, seriesLaura);

	}

	public static void main(String[] args) {
		saludar();
		llenarDatos();
		int d;
		do {
			String sesion = iniciarSesion().toLowerCase();
			if (sesion.equals(pedro.nombre.toLowerCase())) {
				d = 1;
				int opcion = 0;
				do {
					opcion = menu();
					switch (opcion) {
					case 1:
						pedro.mostrarPerfil();
						break;
					case 2:
						int g = 1;
						do {
							String ocioEleccion = recibirTexto("¿En qué Ocio desea ingresar su actividad?");
							if (ocioEleccion.equals(pedro.ocios[0].tipo)) {
								pedro.ocios[0].aniadirActividad(recibirTexto("Ingrese el título de su actividad"),
										recibirEntero("Ingrese la calificación que le da a la actividad"));
								imprimir("¡Añadido!");
							} else if (ocioEleccion.equals(pedro.ocios[1].tipo)) {
								pedro.ocios[1].aniadirActividad(recibirTexto("Ingrese el título de su actividad"),
										recibirEntero("Ingrese la calificación que le da a la actividad"));
								imprimir("¡Añadido!");
							} else if (ocioEleccion.equals(pedro.ocios[2].tipo)) {
								pedro.ocios[2].aniadirActividad(recibirTexto("Ingrese el título de su actividad"),
										recibirEntero("Ingrese la calificación que le da a la actividad"));
								imprimir("¡Añadido!");
							} else {
								g = 2;
							}
						} while (g == 2);
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						System.exit(0);
						break;
					default:
						imprimir("Error en la opcion ingresada");
					}

				} while (opcion != 7);
			} else if (sesion == laura.nombre) {
				d = 1;
			} else if (sesion == fabio.nombre) {
				d = 1;
			} else {
				d = 0;
				imprimir("Este usuario no existe.");
			}
		} while (d == 1);
		despedirse();
	}

	/**
	 * Muestra un breve saludo al usario.
	 */
	private static void saludar() {
		imprimir("Bienvenidos al programa de OcioME \n" + "Enfocado a encontrar esa serie o pelicula de sus sueños");
	}

	private static int recibirEntero(String info) {
		int dato = -1;
		String ax = JOptionPane.showInputDialog(info);
		try {
			dato = Integer.parseInt(ax);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

		}
		return dato;
	}

	private static double recibirDouble(String str) {
		double resultado = -1;
		String ax = JOptionPane.showInputDialog(str);
		try {
			resultado = Double.parseDouble(ax);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
		return resultado;
	}

	private static String recibirTexto(String str) {
		imprimir(str);
		// String ax = teclado.nextLine();
		String ax = JOptionPane.showInputDialog(str);
		return ax;
	}

	private static String iniciarSesion() {
		return recibirTexto("Ingrese su nombre: ");
	}

	private static int menu() {
		int opcion = -1;
		String info = "¿Qué acción desea realizar? \n" + "1. Mostrar mi perfil.\n" + "2. Añadir una actividad.\n"
				+ "3. Comparar ocio con otra persona.\n" + "4. Comparar mi perfil con otra persona.\n"
				+ "5. Mostrar lista de actividades.\n"
				+ "6. Muestra la calificación de las actividades, menos de 6 es mala y más de 6 es aceptable.\n"
				+ "7. Salir.\n";

		opcion = recibirEntero(info);
		return opcion;

	}

	private static void despedirse() {
		imprimir("Fue un placer ayudar con tus ocios, vuelve Pronto y recomiendaselo a tus amigos!!!");
	}

	/**
	 * Imprime la informacion.
	 */
	private static void imprimir(String txt) {
		// System.out.println(txt);
		JOptionPane.showMessageDialog(null, txt);
	}
}
