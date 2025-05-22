package Repositorioentradas;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

import modeloentradas.*;

public class Repoeventos  {
private TreeSet <Eventos> listaeventos;

protected TreeSet<Eventos> getListaeventos() {
	return listaeventos;
}

protected void setListaeventos(TreeSet<Eventos> listaeventos) {
	this.listaeventos = listaeventos;
}

@Override
public int hashCode() {
	return Objects.hash(listaeventos);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Repoeventos other = (Repoeventos) obj;
	return Objects.equals(listaeventos, other.listaeventos);
}

@Override
public String toString() {
	return "Repoeventos [listaeventos=" + listaeventos + "]";
}

public Repoeventos(TreeSet<Eventos> listaeventos) {
	super();
	this.listaeventos = new TreeSet <Eventos>();
}

public void agregarEvento(Eventos e) throws ReservaException {
	if (e.getFechaevento().isBefore(LocalDate.now())) {
        throw new ReservaException("No se puede agregar un evento con fecha pasada.");
    } else {
    	listaeventos.add(e);
    }
}

public Reserva devolvereserva(int id, String nombre, LocalDate Fecha) {
	Reserva r = null;
	for (Eventos s: listaeventos) {
		if(s.getNombre().equals(nombre) && s.getFechaevento().equals(Fecha)) {
	for (Reserva r1 : s.getListareservas()) {
		if (r1.getId() == id) {
			r = r1;}
	}
  }
}

return r;
}
public void agregarreserva(String email, int id) throws ReservaException{
	for(Eventos s : listaeventos) {
		for(Reserva r : s.getListareservas()) {
			if(r.getId() == id) {
			Usuario u = r.getUsuarioreserva();
				if(u.getEmail().equals(email)) {
					listaeventos.add(s);
				} else {
			        throw new ReservaException("No existe dicho evento");
				}
		}else {
		throw new ReservaException("No existe dicho evento");
		}
			}
		}
	}

public void modificarreserva(int idreserva, String nombreevento, LocalDate Fechaevento, Usuario us) throws ReservaException{
	 Reserva modi;
	 for(Eventos s :listaeventos) {
		 if(s.getNombre().equals(nombreevento) && s.getFechaevento().equals(Fechaevento)) {
			  for (Reserva r : s.getListareservas()) {
				 if(r.getId() == idreserva && r.getUsuarioreserva().equals(us)) {
				s.getListareservas().add(r);
				 } else {
					 throw new ReservaException("No existe una reserva con ese identificador asociada a ese evento");
				 }
			  }
		 } else {
			 throw new ReservaException("No existe  evento con ese nombre y fecha");
		 }
	 }
	
}







}

