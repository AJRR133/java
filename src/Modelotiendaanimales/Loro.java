package Modelotiendaanimales;

import java.time.LocalDate;

public class Loro extends Aves {

	
	private String origen;
	private boolean habla;
	
	
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		 return "Loro [origen=" + origen + ", habla=" + habla + ", isPico()=" + isPico() + ", isVuela()=" + isVuela()
		+ ", getNombre()=" + getNombre() + ", getEstado()=" + getEstado() + ", getEdad()=" + getEdad()
		+ ", getFechanacimiento()=" + getFechanacimiento() + "]";
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}

	public Loro(String nombre, String estado, int edad, LocalDate fechanacimiento, boolean pico, boolean vuela,
			String origen, boolean habla) {
		super(nombre, estado, edad, fechanacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}

	@Override
	public boolean volar() {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	
	
	
}
