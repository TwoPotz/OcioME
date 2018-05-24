public class Ocio {
	String tipo;
	int cantidadActividades;
	Actividad[] actividades = new Actividad[cantidadActividades];

	public Ocio(String tipo, int cantidadActividades, Actividad[] actividades) {
		this.tipo = tipo;
		this.cantidadActividades = cantidadActividades;
		this.actividades = actividades;
	}

	/**
	 * Muestra las características principales de un Ocio.
	 */
	void mostrarOcio() {
		System.out.println("Ocio: " + this.tipo + "\n" + "Cantidad de Actividades: " + this.cantidadActividades);
	}

	/**
	 * Muestra una lista con las actividades dentro de un Ocio.
	 */
	void verListasDeActividades() {
		System.out.println("[#] Actividad");
		for (int i = 0; i <= cantidadActividades; i++) {
			System.out.println("[" + i + 1 + "] " + this.actividades[i].titulo);
		}
	}

	/**
	 * Muestra una lista con las actividades dentro de un Ocio y sus respectivas
	 * calificaciones.
	 */
	void verListasDeActividadesYCalificaciones() {
		for (int i = 0; i <= cantidadActividades; i++) {
			System.out
					.println("[" + i + 1 + "] " + this.actividades[i].titulo + " " + this.actividades[i].calificacion);
		}
	}

	/**
	 * Añade una actividad dentro de un Ocio ya establecido
	 * 
	 * @param titulo
	 *            Nombre de la actividad
	 * @param nota
	 *            Calificacion de la actividad
	 */
	void aniadirActividad(String titulo, int nota) {
		cantidadActividades++;
		actividades[cantidadActividades - 1] = new Actividad(titulo, nota);
	}

	/**
	 * Compara dos Ocios para determinar cuál de ambos tiene más actividades.
	 * 
	 * @param otroOcio
	 *            Ocio a comparar con el primero.
	 * @return Si este tiene una cantidad de Actividades inferior al primer Ocio, el
	 *         método retornará true.
	 */
	boolean tieneMasActividadesQue(Ocio otroOcio) {
		if (this.cantidadActividades > otroOcio.cantidadActividades) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Encuentra el promedio de las calificaciones dadas a todas las actividades
	 * dentro de un Ocio.
	 * 
	 * @return Valor del promedio.
	 */
	double hallarPromedioCalificaciones() {
		int suma = 0;
		for (int i = 0; i < this.cantidadActividades; i++) {
			suma = +this.actividades[i].calificacion;
		}
		return suma / this.cantidadActividades;
	}

}
