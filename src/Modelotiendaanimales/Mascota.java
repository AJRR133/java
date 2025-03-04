package Modelotiendaanimales;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascota {

	private String nombre;
	private String estado;
	private int edad;
	private LocalDate fechanacimiento;
	
	
	public abstract String muestra();
	
	public LocalDate cumpleaños() {
		return fechanacimiento;
	}

	public boolean morir() {
		return true;
	}
	
	public abstract boolean habla();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, fechanacimiento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return edad == other.edad && Objects.equals(fechanacimiento, other.fechanacimiento)
				&& Objects.equals(nombre, other.nombre);
	}

	public Mascota(String nombre, String estado, int edad, LocalDate fechanacimiento) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.edad = edad;
		this.fechanacimiento = fechanacimiento;
	}
	
	
	
}
