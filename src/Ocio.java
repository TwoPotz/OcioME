public class Ocio {
	private String tipo;
	private int cantidadActividades;
	Actividad[] actividades = new Actividad[cantidadActividades];

	
	
	public Ocio(String tipo, int cantidadActividades, Actividad[] actividades) {
		super();
		this.tipo = tipo;
		this.cantidadActividades = cantidadActividades;
		this.actividades = actividades;
	}
	void verListasDeActividades() {
		System.out.println("[#] Actividad");
		for (int i = 0; i <= cantidadActividades; i++) {
			System.out.println("[" + i+1 + "] " + this.actividades[i]);
		}
	}
	
}
