package ModeloFactoriacoches;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Dispositivo {

	private int id;
	private String mac;
	private Estadodispositivo estado;
	private LocalDate fechaact;
	@Override
	public int hashCode() {
		return Objects.hash(mac);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(mac, other.mac);
	}
	
	public abstract void conectarInternet();
	
	public abstract boolean pendienteactualizacion();
	
	public void apagar() {
		estado = Estadodispositivo.OFF;
	}
	public Dispositivo(int id, String mac, Estadodispositivo estado, LocalDate fechaact) {
		super();
		this.id = id;
		this.mac = mac;
		this.estado = estado;
		this.fechaact = fechaact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public Estadodispositivo getEstado() {
		return estado;
	}
	public void setEstado(Estadodispositivo estado) {
		this.estado = estado;
	}
	public LocalDate getFechaact() {
		return fechaact;
	}
	public void setFechaact(LocalDate fechaact) {
		this.fechaact = fechaact;
	}
	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", mac=" + mac + ", estado=" + estado + ", fechaact=" + fechaact + "]";
	}
	
}
