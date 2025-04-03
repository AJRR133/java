package Repositorioboletinordenacionejercicio2;

import java.time.LocalDate;
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

	public Historial() {
		super();
		this.registro = new TreeSet<Paginaweb>() ;
	}
	
	public void añadirpagina(Paginaweb a) throws Historialexception {
		if(a.getFechayhora() == null) {
			a.setFechayhora(LocalDate.now());
			registro.add(a);
			System.out.println("Pagina añadida correctamente");
		} else if(a.getFechayhora() != null && a.getFechayhora().isBefore(LocalDate.now())){
			registro.add(a);
			System.out.println("Pagina añadida correctamente");
		}else if(a.getFechayhora().isAfter(LocalDate.now())) {
			throw new Historialexception("No es posible añadir una pagina web con una fecha futura");
		}
		
	}
	
	public Set<Paginaweb> hiscompleto() {
		return this.registro;
	}
	
	public Set<Paginaweb> hisdia(LocalDate f) {
		Set<Paginaweb> registrodia = new TreeSet<Paginaweb>();
		for(Paginaweb cadena : registro ) {
			if(cadena.getFechayhora().equals(f) == true)
				registrodia.add(cadena);
		}
		return registrodia;
	}
	
	public Set<Paginaweb> hisurl(String u){
		Set<Paginaweb> registrourl = new TreeSet<Paginaweb>();
		for(Paginaweb cadena : registro ) {
			if(cadena.getUrl().equals(u) == true)
				registrourl.add(cadena);
		}
		return registrourl;
	}
	
	public Set<Paginaweb> borrar(String u){
		Set<Paginaweb> registromodificado = new TreeSet<Paginaweb>();
		registromodificado = registro;
		for(Paginaweb cadena : registromodificado ) {
			if(cadena.getUrl().equals(u) == true)
				registromodificado.remove(cadena);
		}
		return registromodificado;
	}

	@Override
	public String toString() {
		return "Historial [registro=" + registro + "]";
	}
	
}
