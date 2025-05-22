package Modelobancoalimentos;

import java.time.LocalDate;
import java.util.Objects;

public class Trabajador {

	private String nombre;
	private String dni;
	private LocalDate fechanacimiento;
	private Tipo tipo;
	private Centrolo centro;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Centrolo getCentro() {
		return centro;
	}
	public void setCentro(Centrolo centro) {
		this.centro = centro;
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
		Trabajador other = (Trabajador) obj;
		return Objects.equals(dni, other.dni);
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", fechanacimiento=" + fechanacimiento + ", tipo="
				+ tipo + ", centro=" + centro + "]";
	}
	public Trabajador(String nombre, String dni, LocalDate fechanacimiento, Tipo tipo, Centrolo centro) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		this.tipo = tipo;
		this.centro = centro;
	}
	
	
	
}
