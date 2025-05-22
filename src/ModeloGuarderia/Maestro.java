package ModeloGuarderia;

import java.util.Objects;

public class Maestro {
private	String nombre;
private String apellidos;
private String dni;
private String grupoTutor;
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
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getGrupoTutor() {
	return grupoTutor;
}
public void setGrupoTutor(String grupoTutor) {
	this.grupoTutor = grupoTutor;
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
	Maestro other = (Maestro) obj;
	return Objects.equals(dni, other.dni);
}
@Override
public String toString() {
	return "Maestro [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", grupoTutor=" + grupoTutor
			+ "]";
}
public Maestro(String nombre, String apellidos, String dni, String grupoTutor) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
	this.grupoTutor = grupoTutor;
}



}
