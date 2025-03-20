package Modelosimulacro20_3;

import java.time.LocalDate;
import java.util.Objects;

public class Prueba {
	int id;
	String lugar;
	LocalDate fechaprueba;
	Estadoprueba Estadopru ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public LocalDate getFechaprueba() {
		return fechaprueba;
	}
	public void setFechaprueba(LocalDate fechaprueba) {
		this.fechaprueba = fechaprueba;
	}
	public Estadoprueba getEstadopru() {
		return Estadopru;
	}
	public void setEstadopru(Estadoprueba estadopru) {
		Estadopru = estadopru;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Estadopru, fechaprueba, id, lugar);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prueba other = (Prueba) obj;
		return Estadopru == other.Estadopru && Objects.equals(fechaprueba, other.fechaprueba) && id == other.id
				&& Objects.equals(lugar, other.lugar);
	}
	public Prueba(int id, String lugar, LocalDate fechaprueba, Estadoprueba estadopru) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.fechaprueba = fechaprueba;
		Estadopru = estadopru;
	}
	@Override
	public String toString() {
		return "Prueba [id=" + id + ", lugar=" + lugar + ", fechaprueba=" + fechaprueba + ", Estadopru=" + Estadopru
				+ "]";
	}
	
	
	
	
	
	
}

	