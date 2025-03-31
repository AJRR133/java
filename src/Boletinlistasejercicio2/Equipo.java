package Boletinlistasejercicio2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import Explicacionlistasprovincias.Provincia;

public class Equipo {
	private String nombre;
	private Set<Alumno> alumnos = new HashSet<Alumno>();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(alumnos, nombre);
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
		return Objects.equals(alumnos, other.alumnos) && Objects.equals(nombre, other.nombre);
	}
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.alumnos = new HashSet<>();
	}
	
	
	public void addalumno(Alumno a) throws DeportivosException{
		if(alumnos.contains(a)) {
			throw new DeportivosException("El alumno ya esta en la lista");
		} else {
			alumnos.add(a);
			System.out.println("alumno añadido");
		}
	}
	
	public void deletealumno(Alumno a) throws DeportivosException {
		if(alumnos.contains(a)) {
			alumnos.remove(a);
		} else {
			throw new DeportivosException("El alumno no existe");
		}
	}
	
	public Alumno pertenecealumno(Alumno a) {
		Alumno b;
		if(alumnos.contains(a)) {
			b = a;
		} else  {
			b =null;
		}
		return b;
	}
	
	public void listadoalumno() {
		for (Alumno cadena: alumnos)
		{
			System.out.println(cadena);
		}
	}
	
	public Equipo unionequipos(Equipo e) {
		Equipo union = new Equipo("Equipos unidos");
		union.alumnos.addAll(this.alumnos);
		union.alumnos.addAll(e.alumnos);
		return union;
	}
	
	public Equipo interseccionequipos(Equipo e) {
		Equipo inter = new Equipo("Jugadores que forman parte de ambos equipos");
		inter.alumnos.addAll(this.alumnos);
		inter.alumnos.retainAll(e.alumnos);
		return inter;
	}
}
