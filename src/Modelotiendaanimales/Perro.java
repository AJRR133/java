package Modelotiendaanimales;

import java.time.LocalDate;

public class Perro extends Mascota {

	private String raza;
	private Boolean pulgas;
	
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + ", getNombre()=" + getNombre() + ", getEstado()="
		+ getEstado() + ", getEdad()=" + getEdad() + "]";
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	public Perro(String nombre, String estado, int edad, LocalDate fechanacimiento, String raza, Boolean pulgas) {
		super(nombre, estado, edad, fechanacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Boolean getPulgas() {
		return pulgas;
	}

	public void setPulgas(Boolean pulgas) {
		this.pulgas = pulgas;
	}

	
	
	

}
