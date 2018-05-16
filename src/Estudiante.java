import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estudiante {

String nombre;
String carrera;
int edad;
int cantidadOcios;
Ocio []ocios;

/**
 * Muestra un breve saludo al usario.
 */
private static void saludar(){
 		imprimir("Bienvenidos al programa de OcioME");
 		}

/**
 * Muestra el perfil de los usarios registrados con OcioME.
 */
public void mostrarPerfil() {
	String txt="Nombre "+this.nombre+"\n"+"Carrera: "+this.carrera+"\n"+"Edad: "+this.edad+"\n"+"Cantidad de ocios: "+this.cantidadOcios+"\n";
	System.out.println(txt);
	   }

public void verOcios(String nombre) {
	
}

/**
 * Imprime la informacion.
 */
private static void imprimir(String txt){
	//System.out.println(txt);
 		JOptionPane.showMessageDialog(null,txt);
 	}

}
