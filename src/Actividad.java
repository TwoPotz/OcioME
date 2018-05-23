import javax.swing.JOptionPane;

public class Actividad {
	String titulo;
	int calificacion;

	public Actividad(String titulo, int calificacion) {
		super();
		this.titulo = titulo;
		this.calificacion = calificacion;
	}

	/**
	 * Prueba si una actividad fue calificada con una nota superior a otra.
	 * 
	 * @param otraActividad
	 *            Actividad a comparar con la primera.
	 * @return Si otraActividad tiene menos calificación que la primera Actividad,
	 *         devolverá true.
	 */
	boolean esMejorQue(Actividad otraActividad) {
		if (this.calificacion > otraActividad.calificacion) {
			return true;
		} else {
			return false;
		}
	}
	
	
	double esCalificacionPromedio() {
		double calificacionPromedio = 0;
		for (int i=0; i<1; i++) {
			if (calificacion > 6) {
				calificacion = calificacion;
				System.out.println( "La serie es aceptable en: " +titulo);
			}
			else {
				System.out.println("La serie tiene una mala calificacion en: " +titulo);
			}
		}
		return calificacionPromedio;
	}
	
	
	/**
	 * Muestra una actividad requerida.
	 */
	void mostrarActividad() {
		imprimir("Actividad: " + this.titulo);
	}
	
	private static void imprimir(String txt) {
		// System.out.println(txt);
		JOptionPane.showMessageDialog(null, txt);
	}
}

