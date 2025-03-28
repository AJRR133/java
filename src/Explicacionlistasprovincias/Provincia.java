package Explicacionlistasprovincias;

import java.util.Objects;

public class Provincia {

	private String nombre;
	private int poblacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, poblacion);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		return Objects.equals(nombre, other.nombre) ;
	}
	public Provincia(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}
	
}
