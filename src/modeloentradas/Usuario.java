package modeloentradas;

import java.util.Objects;

public class Usuario {
private int id;
private String nombre;
private String email;
private int contadorid;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getContadorid() {
	return contadorid;
}
public void setContadorid(int contadorid) {
	this.contadorid = contadorid;
}
@Override
public int hashCode() {
	return Objects.hash(id);
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
	return id == other.id;
}
public Usuario( String nombre, String email) {
	super();
	this.id = contadorid++;
	this.nombre = nombre;
	this.email = email;
}
@Override
public String toString() {
	return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
}


}
