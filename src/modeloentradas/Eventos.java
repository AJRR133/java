package modeloentradas;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Eventos implements Comparator<Eventos> , Comparable<Eventos> {
private String nombre;
private LocalDate Fechaevento;
private String lugar;
private TreeSet <Reserva> listareservas;
public String getNombre() {
	return nombre;
}

public LocalDate getFechaevento() {
	return Fechaevento;
}

public void setFechaevento(LocalDate fechaevento) {
	Fechaevento = fechaevento;
}

public String getLugar() {
	return lugar;
}

public void setLugar(String lugar) {
	this.lugar = lugar;
}

public TreeSet<Reserva> getListareservas() {
	return listareservas;
}

public void setListareservas(TreeSet<Reserva> listareservas) {
	this.listareservas = listareservas;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public int hashCode() {
	return Objects.hash(Fechaevento, nombre);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Eventos other = (Eventos) obj;
	return Objects.equals(Fechaevento, other.Fechaevento) && Objects.equals(nombre, other.nombre);
}
@Override
public String toString() {
	return "Eventos [nombre=" + nombre + ", Fechaevento=" + Fechaevento + ", lugar=" + lugar + ", listareservas="
			+ listareservas + "]";
}
public Eventos(String nombre, LocalDate fechaevento, String lugar, TreeSet<Reserva> listareservas) {
	super();
	this.nombre = nombre;
	Fechaevento = fechaevento;
	this.lugar = lugar;
	this.listareservas = new TreeSet<Reserva>();
}


@Override
public int compare(Eventos o1, Eventos o2) {
	int comparar = o1.getFechaevento().compareTo(o2.getFechaevento());
	if( comparar == 0) {
		comparar = o1.getNombre().compareTo(o2.getNombre());
	}
	return comparar;


}

public void agregarReserva(Reserva reserva1) {
	listareservas.add(reserva1);
	
}

@Override
public int compareTo(Eventos o) {
	
        // Primero comparar por fecha
        int comparacionFecha = this.Fechaevento.compareTo(o.getFechaevento());
        
        if (comparacionFecha != 0) {
            return comparacionFecha;  // Si las fechas son diferentes, se devuelve el resultado
        }
        
        // Si las fechas son iguales, se compara por nombre
        return this.nombre.compareTo(o.getNombre());
    }

}
