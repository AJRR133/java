package modeloentradas;

import java.util.Objects;

public class Usuario {
private int id;
private String nombre;
private String email;
private int contadorid;

protected int getId() {
	return id;
}
protected void setId(int id) {
	this.id = id;
}
protected String getNombre() {
	return nombre;
}
protected void setNombre(String nombre) {
	this.nombre = nombre;
}
protected String getEmail() {
	return email;
}
protected void setEmail(String email) {
	this.email = email;
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
public Usuario(int id, String nombre, String email) {
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
