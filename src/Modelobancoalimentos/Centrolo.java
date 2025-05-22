package Modelobancoalimentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Centrolo {

	private int id;
	private String nombre;
	private String ciudad;
	private int numcomedores;
	private ArrayList<Trabajador> trabajadores;
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getNumcomedores() {
		return numcomedores;
	}
	public void setNumcomedores(int numcomedores) {
		this.numcomedores = numcomedores;
	}
	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}
	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
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
		Centrolo other = (Centrolo) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Centrolo [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", numcomedores=" + numcomedores
				+ ", trabajadores=" + trabajadores + "]";
	}
	public Centrolo(int id, String nombre, String ciudad, int numcomedores, ArrayList<Trabajador> trabajadores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numcomedores = numcomedores;
		this.trabajadores = new ArrayList<Trabajador>() ;
	}
	
	public void agregartrabajador (Trabajador t) throws BancoException{
		for(Trabajador a : trabajadores) {
			if(a.getDni().equals(t.getDni())) {
			
				throw new BancoException("El trabajador ya pertenece a el centro");
			} else {
				trabajadores.add(t);
			}
		}
	
	}
	
	
}
