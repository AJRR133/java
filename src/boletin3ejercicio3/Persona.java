package boletin3ejercicio3;

import java.time.LocalDate;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechanacimiento;
	
	
	public Persona(String dni, String nombre, String apellidos, LocalDate fechanacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechanacimiento = fechanacimiento;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
	
	
	
	
	
	
}
