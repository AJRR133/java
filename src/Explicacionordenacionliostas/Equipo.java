package Explicacionordenacionliostas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import Boletinlistasejercicio2.Alumno;
import Boletinlistasejercicio2.DeportivosException;
import Explicacionlistasprovincias.Provincia;

public class Equipo {
	private String nombre;
	private Set<Persona> personas;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Persona> getAlumnos() {
		return personas;
	}
	public void setAlumnos(Set<Persona> alumnos) {
		this.personas = alumnos;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", Persona=" + personas + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(personas, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(personas, other.personas) && Objects.equals(nombre, other.nombre);
	}
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.personas = new HashSet<Persona>();
	}
	public void addalumno(Persona a) throws DeportivosException{
		if(personas.contains(a)) {
			throw new DeportivosException("El alumno ya esta en la lista");
		} else {
			personas.add(a);
			System.out.println("alumno añadido");
		}
	}


}
	
	