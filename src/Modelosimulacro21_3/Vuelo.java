package Modelosimulacro21_3;

import java.time.LocalDate;
import java.util.Objects;

public class Vuelo {
	int id;
	String aerolinea;
	String destino;
	LocalDate fechavuelo;
	double duracion;
	Estadovuelo estadov;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFechavuelo() {
		return fechavuelo;
	}
	public void setFechavuelo(LocalDate fechavuelo) {
		this.fechavuelo = fechavuelo;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Estadovuelo getEstadov() {
		return estadov;
	}
	public void setEstadov(Estadovuelo estadov) {
		this.estadov = estadov;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", aerolinea=" + aerolinea + ", destino=" + destino + ", fechavuelo=" + fechavuelo
				+ ", duracion=" + duracion + ", estadov=" + estadov + "]";
	}
	public Vuelo(int id, String aerolinea, String destino, LocalDate fechavuelo, double duracion, Estadovuelo estadov) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fechavuelo = fechavuelo;
		this.duracion = duracion;
		this.estadov = estadov;
	}
	
	
	
}
