package Repositoriobancoalimentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Modelobancoalimentos.*;

public class Bancoalimentos {

	private ArrayList<Centrolo> centros;

	public ArrayList<Centrolo> getCentros() {
		return centros;
	}

	public void setCentros(ArrayList<Centrolo> centros) {
		this.centros = centros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(centros);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bancoalimentos other = (Bancoalimentos) obj;
		return Objects.equals(centros, other.centros);
	}

	@Override
	public String toString() {
		return "Bancoalimentos [centros=" + centros + "]";
	}

	public Bancoalimentos(ArrayList<Centrolo> centros) {
		super();
		this.centros = new ArrayList<Centrolo>();
	}
	
	public void agregarcentro (Centrolo c) throws BancoException {
		if(centros.size()>0) {
		for (Centrolo b : centros) {
			if(c.getId() == b.getId()) {
				throw new BancoException("El id ya existe");
			}}
				centros.add(c);
		
		} else {
			centros.add(c);
		}
	}
	public Centrolo obtenerdatos (int id) {
		Centrolo devo = null;
		for(Centrolo c : centros) {
			if(c.getId() == id) {
				devo = c;
			} else {
				System.out.println("No exite centro con ese id");
			}
		}
		return devo;
	}
	
	
	public Trabajador obtenerdatostra(String dni) {
	    Trabajador devo = null;
	    for (Centrolo c : centros) {
	        for (Trabajador t : c.getTrabajadores()) {
	            if (t.getDni().equals(dni) && devo == null) {
	                devo = t;
	            }
	        }
	    }
	    if (devo == null) {
	        System.out.println("No existe Trabajador con ese dni");
	    }
	    return devo; 
	}

}
