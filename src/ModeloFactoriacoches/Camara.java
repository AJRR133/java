package ModeloFactoriacoches;

import java.time.LocalDate;

public class Camara extends Dispositivo {

	public Camara(int id, String mac, Estadodispositivo estado, LocalDate fechaact) {
		super(id, mac, estado, fechaact);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarInternet() {
		System.out.println("conectado atraves de WPA3");

	}

	@Override
	public boolean pendienteactualizacion() {
		boolean actu = false;
		if(getFechaact().isBefore(getFechaact().plusDays(14))) {
			actu = true;
		} else {
			actu = false;
			}
	return actu;
}

	

}
