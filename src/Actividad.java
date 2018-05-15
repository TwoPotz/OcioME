
public class Actividad {
	String titulo;
	int calificacion;

	public Actividad(String titulo, int calificacion) {
		super();
		this.titulo = titulo;
		this.calificacion = calificacion;
	}

	/*
	 * Prueba si una actividad fue calificada con una nota superior a otra
	 */
	boolean esMejorQue(Actividad otraActividad) {
		if (this.calificacion > otraActividad.calificacion) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Imprime la actividad requerida
	 */
	void mostrarActividad() {
		System.out.println("Actividad: " + this.titulo);
	}
}
