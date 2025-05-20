package ModeloMapasRegistrodevehículo;

import java.util.HashMap;

public class Registrotra {

private HashMap<Rematri,Vehiculo> listave;

protected HashMap<Rematri, Vehiculo> getListave() {
	return listave;
}

protected void setListave(HashMap<Rematri, Vehiculo> listave) {
	this.listave = listave;
}

@Override
public String toString() {
	return "Registrotra [listave=" + listave + "]";
}

public Registrotra(HashMap<Rematri, Vehiculo> listave) {
	super();
	this.listave = listave;
}
	
public Boolean agregarvehiculo(Rematri r , Vehiculo v) {
	boolean regis = false;
	if(v.equals(v)) {
		System.out.println("Este vehiculo ya esta en la lista");
	} else {
		listave.put(r, v);
		regis = true;
	}
	return regis;
	
}
public boolean registrarrema (Rematri r) {
	boolean regis = false;
	Vehiculo vant = listave.get(r.g)
	Vehiculo vact = null;
	if(listave.containsKey(r.getNumbastidor())) {
		v.setMatricula(r.getMatriculafin());
	}
	return regis;
}


}
