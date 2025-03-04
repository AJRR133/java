package Modelotiendaanimales;

import java.time.LocalDate;

public abstract class Aves extends Mascota {

	private boolean pico;
	private boolean vuela;

	public abstract boolean volar();
	
	@Override
	public String muestra() {
		// TODO Auto-generated method stub
		return "Aves [pico=" + pico + ", vuela=" + vuela + ", getNombre()=" + getNombre() + ", getEstado()="
				+ getEstado() + ", getEdad()=" + getEdad() + ", getFechanacimiento()=" + getFechanacimiento() + "]";
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}

	public Aves(String nombre, String estado, int edad, LocalDate fechanacimiento, boolean pico, boolean vuela) {
		super(nombre, estado, edad, fechanacimiento);
		this.pico = pico;
		this.vuela = vuela;
	}

	public boolean isPico() {
		return pico;
	}

	public void setPico(boolean pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}


	
	
}
