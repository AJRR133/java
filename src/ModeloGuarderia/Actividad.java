package ModeloGuarderia;

import java.time.LocalDate;
import java.util.Objects;

public class Actividad {
private	   String nombre;
private	    Lugar lugar;
private	    LocalDate fecha;
private	    int edadRecomendada;
private	    int maxAlumnos;
private	    Maestro maestro;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Lugar getLugar() {
	return lugar;
}
public void setLugar(Lugar lugar) {
	this.lugar = lugar;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public int getEdadRecomendada() {
	return edadRecomendada;
}
public void setEdadRecomendada(int edadRecomendada) {
	this.edadRecomendada = edadRecomendada;
}
public int getMaxAlumnos() {
	return maxAlumnos;
}
public void setMaxAlumnos(int maxAlumnos) {
	this.maxAlumnos = maxAlumnos;
}
public Maestro getMaestro() {
	return maestro;
}
public void setMaestro(Maestro maestro) {
	this.maestro = maestro;
}
@Override
public int hashCode() {
	return Objects.hash(fecha, nombre);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Actividad other = (Actividad) obj;
	return Objects.equals(fecha, other.fecha) && Objects.equals(nombre, other.nombre);
}
@Override
public String toString() {
	return "Actvidad [nombre=" + nombre + ", fecha=" + fecha + ", edadRecomendada=" + edadRecomendada + ", maxAlumnos="
			+ maxAlumnos + "]";
}
public Actividad(String nombre, Lugar lugar, LocalDate fecha, int edadRecomendada, int maxAlumnos, Maestro maestro) {
	super();
	this.nombre = nombre;
	this.lugar = lugar;
	this.fecha = fecha;
	this.edadRecomendada = edadRecomendada;
	this.maxAlumnos = maxAlumnos;
	this.maestro = maestro;
}



}
