import javax.swing.JOptionPane;

import java.util.Scanner;

public class MainClass {
    static Scanner teclado=new Scanner(System.in);
    static Estudiante pepita = new Estudiante("Pepita Jimenez", "ingenieria de sistemas", 21, 2);
    static Estudiante rodolfo = new Estudiante("Rodolfo gonzales", "ingenieria quimica", 18, 1);
    static Estudiante andres = new Estudiante("Andres alcazar", "ingeria de sistemas", 18, 3);
    static Actividad infinitywar  = new Actividad("Infity War", 9);
    static Actividad sao  = new Actividad("Sword Art Online", 7);
    static Actividad bigbang  = new Actividad("The big bang theory", 10);
    
	public static void main(String[] args) {
		saludar();
		saludar2();
		int opcion=0;
		do{
			opcion=menu();
			switch(opcion){
			case 1:
				pepita.mostrarPerfil();
				rodolfo.mostrarPerfil();
				andres.mostrarPerfil();
				;
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				bigbang.mostrarActividad();
				sao.mostrarActividad();
				infinitywar.mostrarActividad();
				break;
			case 6:
				break;
			case 7:
				despedirse();
				teclado.close();
				break;
			default:
				imprimir("Error en la opcion ingresada");	
			}

		}
		while(opcion!=7);
	}

	
/**
* Muestra un breve saludo al usario.
*/
	private static void saludar(){
		imprimir("Bienvenidos al programa de OcioME");
		}
	
	private static void saludar2(){
		imprimir("Enfocado a encontrar esa serie o pelicula de sus sueños");
		}
	
	private static int recibirEntero(String info){
		int dato=-1;
		String ax = JOptionPane.showInputDialog(info);
			try{	
				dato=Integer.parseInt(ax);
			}
			catch( NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

			}
			return dato;
		}
	
	private static double recibirDouble(String str){
		double resultado=-1;
		String ax = JOptionPane.showInputDialog(str);
			try{
				resultado=Double.parseDouble(ax);
			}
			catch( NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
			}
			return resultado;
		}
	private static String recibirTexto(String str){
		imprimir(str);
		String ax = teclado.nextLine();
		//String ax =JOptionPane.showInputDialog(str);
		return ax;
	}
	
	private static int menu(){
		int opcion=-1;
		String info="Que accion desea realizar: \n"
				+ "1 mostrar perfil\n"
				+ "2  Buscar un ocio\n"
				+ "3 Ver lista de ocios\n"
				+ "4  \n"
		        + "5  Mostrar lista de actividades y sus calificaciones\n"
		        + "6 \n"
		        + "7 salir  \n";

		opcion=recibirEntero(info);
		return opcion;

	}
	
	private static void despedirse(){
		imprimir("Fue un placer ayudar con tus ocios, vuelve Pronto y recomiendaselo a tus amigos!!!");
	}
/**
* Imprime la informacion.
*/
	private static void imprimir(String txt){
		//System.out.println(txt);
	 		JOptionPane.showMessageDialog(null,txt);
	 	}
}
