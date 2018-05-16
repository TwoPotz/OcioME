import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estudiante {

String nombre;
String carrera;
int edad;
int cantidadOcios;
Ocio []ocios;


private static void saludar(){
 		imprimir("Bienvenidos al programa de OcioME");
 		}

public void mostrarPerfil() {
	String txt="Nombre "+this.nombre+"\n"+"Carrera: "+this.carrera+"\n"+"Edad: "+this.edad+"\n"+"Cantidad de ocios: "+this.cantidadOcios+"\n";
	System.out.println(txt);
	   }

private static void imprimir(String txt){
	//System.out.println(txt);
 		JOptionPane.showMessageDialog(null,txt);
 	}

}
