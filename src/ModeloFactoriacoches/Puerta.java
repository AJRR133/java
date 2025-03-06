package ModeloFactoriacoches;

import java.time.LocalDate;

public class Puerta extends Dispositivo {

	public Puerta(int id, String mac, Estadodispositivo estado, LocalDate fechaact) {
		super(id, mac, estado, fechaact);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectarInternet() {
		System.out.println("conectado atraves de WPA2");

	}

	@Override
	public boolean pendienteactualizacion() {
		boolean actu = false;
		if(getFechaact().isBefore(getFechaact().plusMonths(1))) {
			actu = true;
		} else {
			actu = false;
			}
	return actu;
}

	

	

}
