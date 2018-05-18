import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		saludar();
		

	}

	
/**
* Muestra un breve saludo al usario.
*/
	private static void saludar(){
		imprimir("Bienvenidos al programa de OcioME");
		}
	
/**
* Imprime la informacion.
*/
	private static void imprimir(String txt){
		//System.out.println(txt);
	 		JOptionPane.showMessageDialog(null,txt);
	 	}
}
