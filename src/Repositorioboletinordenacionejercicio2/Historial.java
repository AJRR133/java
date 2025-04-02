package Repositorioboletinordenacionejercicio2;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import Modeloboletinordenacionejercicio2.*;
public class Historial {

	Set<Paginaweb> registro = new TreeSet<Paginaweb>();

	public Set<Paginaweb> getRegistro() {
		return registro;
	}

	public void setRegistro(Set<Paginaweb> registro) {
		this.registro = registro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(registro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historial other = (Historial) obj;
		return Objects.equals(registro, other.registro);
	}

	public Historial(Set<Paginaweb> registro) {
		super();
		this.registro = registro;
	}
	
	
	
	
}
