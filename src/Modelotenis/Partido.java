package Modelotenis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Partido {
	private Jugador j1;
	private Jugador j2;
	private Estado estado;
	private LocalDate fecha;
	private ArrayList<Integer> puntj1;
	private ArrayList<Integer> puntj2;
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public ArrayList<Integer> getPuntj1() {
		return puntj1;
	}
	public void setPuntj1(ArrayList<Integer> puntj1) {
		this.puntj1 = puntj1;
	}
	public ArrayList<Integer> getPuntj2() {
		return puntj2;
	}
	public void setPuntj2(ArrayList<Integer> puntj2) {
		this.puntj2 = puntj2;	
	}
	public Jugador getJ1() {
		return j1;
	}
	public void setJ1(Jugador j1) {
		this.j1 = j1;
	}
	public Jugador getJ2() {
		return j2;
	}
	public void setJ2(Jugador j2) {
		this.j2 = j2;
	}
	@Override
	public int hashCode() {
		return Objects.hash(estado, fecha, puntj1, puntj2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return estado == other.estado && Objects.equals(fecha, other.fecha) && Objects.equals(puntj1, other.puntj1)
				&& Objects.equals(puntj2, other.puntj2);
	}
	
	@Override
	public String toString() {
		return "Partido [j1=" + j1 + ", j2=" + j2 + ", estado=" + estado + ", fecha=" + fecha + ", puntj1=" + puntj1
				+ ", puntj2=" + puntj2 + "]";
	}
	
	public Partido(Jugador j1, Jugador j2, Estado estado, LocalDate fecha, ArrayList<Integer> puntj1,
			ArrayList<Integer> puntj2) {
		super();
		this.j1 = j1;
		this.j2 = j2;
		this.estado = estado;
		this.fecha = fecha;
		this.puntj1 = new ArrayList<Integer>();
		this.puntj2 = new ArrayList<Integer>();
	}
	
	
}
