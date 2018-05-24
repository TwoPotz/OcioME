import javax.swing.JOptionPane;

public class Estudiante {

	String nombre;
	String carrera;
	int edad;
	int cantidadOcios;
	Ocio[] ocios;

	public Estudiante(String nombre, String carrera, int edad, int cantidadOcios, Ocio[] ocios) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.edad = edad;
		this.cantidadOcios = cantidadOcios;
		this.ocios = ocios;
	}

	/**
	 * Muestra el perfil de los usarios registrados con OcioME.
	 */
	public void mostrarPerfil() {
		String txt = "Nombre:      " + this.nombre + "\n" + "Carrera:       " + this.carrera + "\n" + "Edad:     "
				+ this.edad + "\n" + "Cantidad de ocios: " + this.cantidadOcios + "\n";
		imprimir(txt);
	}

	public void verOcios(String nombre) {

	}

	/**
	 * Imprime la información.
	 */
	private static void imprimir(String txt) {
		// System.out.println(txt);
		JOptionPane.showMessageDialog(null, txt);
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
			return true;
		} else {
			return false;
		}
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

	public void compararOcio(Estudiante otroEstudiante, Ocio ocio) {

	}

	public void aniadirOcio(String titulo) {

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
