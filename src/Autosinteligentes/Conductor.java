package Autosinteligentes;

import java.util.Objects;

public class Conductor {

	private String nombre;
	private int anosdeexperiencia;
	
	
	protected void quienconduce() {
		
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getAnosdeexperiencia() {
		return anosdeexperiencia;
	}

	protected void setAnosdeexperiencia(int anosdeexperiencia) {
		if(anosdeexperiencia>0) {
			this.anosdeexperiencia = anosdeexperiencia;

		} else {
			this.anosdeexperiencia = 0;
	}
	}

	@Override
	public String toString() {
		return "Conductor [nombre=" + nombre + ", anosdeexperiencia=" + anosdeexperiencia + "]";
	}

	public Conductor(String nombre, int anosdeexperiencia) {
		super();
		this.nombre = nombre;
		//this.anosdeexperiencia = getAnosdeexperiencia();
		setAnosdeexperiencia(anosdeexperiencia);
		}

	@Override
	public int hashCode() {
		return Objects.hash(anosdeexperiencia, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conductor other = (Conductor) obj;
		return anosdeexperiencia == other.anosdeexperiencia && Objects.equals(nombre, other.nombre);
	}
	
	
}
