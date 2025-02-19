package Simulacroclase19_2;

import java.util.Objects;

public class Usuario {

	private String nombre;
	private String dni;
	private String Departamento;
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected String getDepartamento() {
		return Departamento;
	}
	protected void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public Usuario(String nombre, String dni, String departamento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		Departamento = departamento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Departamento, dni, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
}
