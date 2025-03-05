package Modelotiendaanimales;

import java.time.LocalDate;

public class Gato extends Mascota {
	private String color;
	private String pelolargo;
	
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		 return "Gato [color=" + color + ", pelolargo=" + pelolargo + ", getNombre()=" + getNombre() + ", getEstado()="
				+ getEstado() + ", getEdad()=" + getEdad() + ", getFechanacimiento()=" + getFechanacimiento() + "]";}
	

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPelolargo() {
		return pelolargo;
	}

	public void setPelolargo(String pelolargo) {
		this.pelolargo = pelolargo;
	}

	public Gato(String nombre, String estado, int edad, LocalDate fechanacimiento, String color, String pelolargo) {
		super(nombre, estado, edad, fechanacimiento);
		this.color = color;
		this.pelolargo = pelolargo;
	}


	

	
	
	

}
