package ModeloFactoriacoches;

public class Soldador extends Robot {

	private double temperatura;
	private String seguridad;

	public Soldador(String modelo, int bateria, Estado estado, double temperatura, String seguridad) {
		super(modelo, bateria, estado);
		this.temperatura = temperatura;
		this.seguridad = seguridad;
	}

	@Override
	public String ejecutartarea() {
		String tarea = "";
		if (getEstado() == Estado.ENCENDIDO) {
			tarea = "soldaduras precisas en la carrocería del automóvil";
		} else {
			tarea = "el robot no esta realizando su tarea ";
		}
		return tarea;
	}

	@Override
	public boolean recargar() {
		boolean recargando = false;
		if (getEstado() == Estado.APAGADO) {
			recargando = true;
			System.out.println("Recargando por electricidad");
		} else {
			recargando = false;
			System.out.println("Estoy encendido y no puedo recargar");
		}

		return recargando;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getSeguridad() {
		return seguridad;
	}

	public void setSeguridad(String seguridad) {
		this.seguridad = seguridad;
	}

	@Override
	public String toString() {
		return "Soldador [temperatura=" + temperatura + ", seguridad=" + seguridad + ", getModelo()=" + getModelo()
				+ ", getBateria()=" + getBateria() + ", getEstado()=" + getEstado() + ", getId()=" + getId() + "]";
	}

}
