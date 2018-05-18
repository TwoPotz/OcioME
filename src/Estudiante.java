import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estudiante {

	String nombre;
	String carrera;
	int edad;
	int compararEdades;
	int cantidadOcios;
	Ocio[] ocios;

	public Estudiante(String nombre, String carrera, int edad, int cantidadOcios) {
	super();
	this.nombre = nombre;
	this.carrera = carrera;
	this.edad = edad;
	this.cantidadOcios = cantidadOcios;
}
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
	 * Imprime la informacion.
	 */
	private static void imprimir(String txt) {
		// System.out.println(txt);
		JOptionPane.showMessageDialog(null, txt);
	}

public static void compararEstudiantes(String txt) {
	//Agregar los generos?
	int terror = 0;
	int comedia=1;
	int anime=2;
	int accion=3;
	int carros=4;
	int romance=5;
	int deportes=6;
	int documnetales=7;
	int ocio1=comedia;
	int ocio2=terror;
	
	
	if(ocio1 == ocio2) {
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
