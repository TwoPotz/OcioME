import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estudiante {

	String nombre;
	String carrera;
	int edad;
	int compararEdades;
	int cantidadOcios;
	Ocio[] ocios;

	public Estudiante(String nombre, String carrera, int edad, int compararEdades, int cantidadOcios, Ocio[] ocios) {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.edad = edad;
		this.compararEdades = compararEdades;
		this.cantidadOcios = cantidadOcios;
		this.ocios = ocios;
	}
	
	static Scanner teclado = new Scanner(System.in);

	/**
	 * Muestra el perfil de los usarios registrados con OcioME.
	 */
	public void mostrarPerfil() {
		String txt = "Nombre " + this.nombre + "\n" + "Carrera: " + this.carrera + "\n" + "Edad: " + this.edad + "\n"
				+ "Cantidad de ocios: " + this.cantidadOcios + "\n";
		imprimir(txt);
	}

	public void verOcios(String nombre) {

	}

	/**
	 * Imprime la información.
	 */
	private static void imprimir(String txt) {
		System.out.println(txt);
		// JOptionPane.showMessageDialog(null, txt);
	}

	/**
	 * Compara las edades de dos estudiantes con una diferencia de edad máxima
	 * establecida.
	 * 
	 * @param otroEstudiante
	 *            Segundo estudiante al que se quiere comparar.
	 * @return Retorna verdadero si la diferencia de edades está dentro del rango
	 *         establecido.
	 */
	public boolean compararEdades(Estudiante otroEstudiante) {
		int diferencia = recibirEntero("Inserta la diferencia de edad máxima entre tú y otro estudiante");
		if (Math.abs(this.edad - otroEstudiante.edad) <= diferencia) {
			// imprimir("Tú y " + otroEstudiante.nombre + " tienen una diferencia de edad
			// menor a la indicada. ("
			// + Math.abs(this.edad - otroEstudiante.edad) + ")");
			return true;
		} else {
			// imprimir("La diferencia de edad es mayor a la indicada.");
			return false;
		}
		// return Math.abs(this.edad - otroEstudiante.edad);
	}

	/**
	 * Compara si dos estudiantes cursan la misma carrera.
	 * 
	 * @param otroEstudiante
	 *            Segundo estudiante al que se quiere comparar.
	 * @return Retorna verdadero si los dos estudiantes cursan la misma carrera.
	 */
	public boolean compararCarreras(Estudiante otroEstudiante) {
		if (this.carrera == otroEstudiante.carrera) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Compara los perfiles de dos estudiantes ignorando sus gustos.
	 * 
	 * @param otroEstudiante
	 *            Segundo estudiante al que se quiere comparar.
	 */
	public void compararEstudiantes(Estudiante otroEstudiante) {
		String txt;
		String txt1;
		if (this.compararEdades(otroEstudiante)) {
			txt = "¡Bien! Tú y " + otroEstudiante.nombre + " tienen una diferencia de edad menor a la indicada. ("
					+ Math.abs(this.edad - otroEstudiante.edad) + ")";
		} else {
			txt = "Qué mal. Tú y " + otroEstudiante.nombre + " tienen una diferencia de edad mayor a la indicada. ("
					+ Math.abs(this.edad - otroEstudiante.edad) + ")";
		}
		if (this.compararCarreras(otroEstudiante)) {
			txt1 = "Tú y " + otroEstudiante.nombre + " cursan la misma carrera.";
		} else {
			txt1 = "Tú y " + otroEstudiante.nombre + " no son compañeros de carrera.";
		}
		imprimir("Tu comparación con " + otroEstudiante.nombre + " es:");
		imprimir(txt);
		imprimir(txt1);
	}

	public void compararGustos(Estudiante otroEstudiante) {

	}

	public void preguntarOcio(Estudiante otroEstudiante, Ocio ocio) {
		int i = 0;
		for (i = 0; i <= this.cantidadOcios; i++) {
			if (ocio.tipo != this.ocios[i].tipo) {
				i++;
			}
		}
	}

	public void aniadirOcio(String titulo) {
		int i=0;
		for (i = 0; i <= this.cantidadOcios; i++) {
			 titulo = recibirTexto("por favor ingresa el titulo del nuevo ocio" +i);
			 this.ocios[i]=titulo;
		}
	}
	
	private static String recibirTexto(String str) {
		imprimir(str);
		String ax = teclado.nextLine();
		// String ax =JOptionPane.showInputDialog(str);
		return ax;
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

}
