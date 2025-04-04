package explicacionmapa;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Agenda {
	private Map<String,Contacto> agenda;

	public Agenda() {
		super();
		this.agenda = new TreeMap<String , Contacto>(); ;
	}

	public Map<String, Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<String, Contacto> agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}
	
	
}
