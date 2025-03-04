package Modelotiendaanimales;

import java.time.LocalDate;

public class Canario extends Aves {

	private String color;
	private Boolean canta;
	
	@Override
	public boolean volar() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		 return "Canario [color=" + color + ", canta=" + canta + ", isPico()=" + isPico() + ", isVuela()=" + isVuela()
		+ ", getNombre()=" + getNombre() + ", getEstado()=" + getEstado() + ", getEdad()=" + getEdad()
		+ ", getFechanacimiento()=" + getFechanacimiento() + "]";
	}
	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return super.habla();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getCanta() {
		return canta;
	}
	public void setCanta(Boolean canta) {
		this.canta = canta;
	}
	public Canario(String nombre, String estado, int edad, LocalDate fechanacimiento, boolean pico, boolean vuela,
			String color, Boolean canta) {
		super(nombre, estado, edad, fechanacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	
	
}
