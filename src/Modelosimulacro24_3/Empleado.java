package Modelosimulacro24_3;

import java.util.Objects;

public abstract class Empleado implements ActualizableSueldo {
	
	String dni;
	String nombre;
	int sueldo;
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getSueldo() {
		return sueldo;
	}
	protected void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}
	public Empleado(String dni, String nombre, int sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
}
