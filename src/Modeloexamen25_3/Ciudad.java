package Modeloexamen25_3;

import java.util.Objects;

public class Ciudad {

	String nombre;
	int numhabitantes;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumhabitantes() {
		return numhabitantes;
	}
	public void setNumhabitantes(int numhabitantes) {
		this.numhabitantes = numhabitantes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre, other.nombre);
	}
	public Ciudad(String nombre, int numhabitantes) {
		super();
		this.nombre = nombre;
		this.numhabitantes = numhabitantes;
	}
	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", numhabitantes=" + numhabitantes + "]";
	}
	
	
}
