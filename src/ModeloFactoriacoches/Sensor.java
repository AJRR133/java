package ModeloFactoriacoches;

import java.time.LocalDate;

public class Sensor extends Dispositivo {

	public Sensor(int id, String mac, Estadodispositivo estado, LocalDate fechaact) {
		super(id, mac, estado, fechaact);
		this.temperatura = temperatura;
	}

	private double temperatura;
	
	@Override
	public void conectarInternet() {
		System.out.println("conectado atraves de WPA");
	}

	@Override
	public boolean pendienteactualizacion() {
		boolean actu = false;
			if(getFechaact().isBefore(getFechaact().plusMonths(3))) {
				actu = true;
			} else {
				actu = false;
				}
		return actu;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Sensor [temperatura=" + temperatura + ", getId()=" + getId() + ", getMac()=" + getMac()
				+ ", getEstado()=" + getEstado() + ", getFechaact()=" + getFechaact() + "]";
	}
	
	
	
	
}
