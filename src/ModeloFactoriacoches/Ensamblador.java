package ModeloFactoriacoches;

public class Ensamblador extends Robot {

	@Override
	public String toString() {
		return "Ensamblador [getModelo()=" + getModelo() + ", getBateria()=" + getBateria() + ", getEstado()=" + getEstado()
				+ ", getId()=" + getId() + "]";
	}
	
	public Ensamblador(String modelo, int bateria, Estado estado) {
		super(modelo, bateria, estado);
	}

	@Override
	public String ejecutartarea() {
		String tarea = "";
		if (getEstado() == Estado.ENCENDIDO) {
			tarea = " ensamblar piezas";
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
			System.out.println("Recargando por gasolina");
		} else {
			recargando = false;
			System.out.println("Estoy encendido y no puedo recargar");
		}

		return recargando;
	}

}
