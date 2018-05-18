import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estudiante {

	String nombre;
	String carrera;
	int edad;
	int compararEdades;
	int cantidadOcios;
	Ocio[] ocios;

	/**
	 * Muestra un breve saludo al usario.
	 */
	private static void saludar() {
		imprimir("Bienvenidos al programa de OcioME");
	}

	/**
	 * Muestra el perfil de los usarios registrados con OcioME.
	 */
	public void mostrarPerfil() {
		String txt = "Nombre " + this.nombre + "\n" + "Carrera: " + this.carrera + "\n" + "Edad: " + this.edad + "\n"
				+ "Cantidad de ocios: " + this.cantidadOcios + "\n";
		System.out.println(txt);
	}

	public void verOcios(String nombre) {

	}

	/**
	 * Imprime la informacion.
	 */
	private static void imprimir(String txt) {
		// System.out.println(txt);
		JOptionPane.showMessageDialog(null, txt);
	}

public static void compararEstudiantes(String txt) {
	String terror;
	String ocio1=terror;
	String ocio2=terror;
	ocio1=JOptionPane.showMessageDialog(null, txt);
	ocio2=JOptionPane.showMessageDialog(null, txt);
	
	if(ocio1.equals(ocio2)) {
		JOptionPane.showMessageDialog(null, "Comparten los mismos ocios");	
	}
	else {
		JOptionPane.showMessageDialog(null, "tienen diferentes ocios");
	}
	
}

	public void compararGustos() {

	}

	public void preguntarOcio() {

	}

	public void aniadirOcio(String titulo) {

	}

	public static boolean compararCarreras() {
		return false;

	}

}
