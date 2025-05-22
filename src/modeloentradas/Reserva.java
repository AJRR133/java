package modeloentradas;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva implements Comparable<Reserva> {
private int id;
private LocalDate fechareserva;
private Estado estadoreserva;
private Usuario usuarioreserva;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getFechareserva() {
	return fechareserva;
}
public void setFechareserva(LocalDate fechareserva) {
	this.fechareserva = fechareserva;
}
public Estado getEstadoreserva() {
	return estadoreserva;
}
public void setEstadoreserva(Estado estadoreserva) {
	this.estadoreserva = estadoreserva;
}
public Usuario getUsuarioreserva() {
	return usuarioreserva;
}
public void setUsuarioreserva(Usuario usuarioreserva) {
	this.usuarioreserva = usuarioreserva;
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
	Reserva other = (Reserva) obj;
	return id == other.id;
}
@Override
public String toString() {
	return "Reserva [id=" + id + ", fechareserva=" + fechareserva + ", estadoreserva=" + estadoreserva
			+ ", usuarioreserva=" + usuarioreserva + "]";
}
public Reserva(int id, LocalDate fechareserva, Estado estadoreserva, Usuario usuarioreserva) {
	super();
	this.id = id;
	this.fechareserva = fechareserva;
	this.estadoreserva = estadoreserva;
	this.usuarioreserva = usuarioreserva;
}
@Override
public int compareTo(Reserva o) {
	return Integer.compare(this.id, o.getId());
}



}
