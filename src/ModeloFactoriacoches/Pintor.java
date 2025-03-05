package ModeloFactoriacoches;

public class Pintor extends Robot {

	
	
	@Override
	public String toString() {
		return "Pintor [getModelo()=" + getModelo() + ", getBateria()=" + getBateria() + ", getEstado()=" + getEstado()
				+ ", getId()=" + getId() + "]";
	}

	public Pintor(String modelo, int bateria, Estado estado) {
		super(modelo, bateria, estado);
	}

	@Override
	public String ejecutartarea() {
		String tarea = "";
		if (getEstado() == Estado.ENCENDIDO) {
			tarea = " aplica pintura a los vehículos de manera uniforme.";
		} else {
			tarea = "el robot no esta realizando su tarea ";
		}
		return tarea;
	}

	@Override
	public boolean recargar() {
		boolean recargando = true;
			System.out.println("Recargando por electricidad");
		return recargando;
	}

}
