package Modelosimulacro19_3;

import java.util.Arrays;
import java.util.Objects;

public abstract class Vehiculo implements IAlquilable{
	int id;
	Alquiler [] alquileres;
	boolean disponible;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean estaalquilado() {
		boolean alquilado = true;
		if(this.disponible=false) {
			alquilado = true;
		} else {
			alquilado = false;
		}
		return alquilado;}

	/*double getImporetotalgenerado() {
		double importetotal = 0;
	for(int i = 0; alquileres.length >0 ; i++)
		if(alquileres[i].Estado.ENTREGADO && alquileres[i].Estado. ) {
		 importetotal = importetotal +(alquileres[i].numdias*getPreciopordia());}
		return importetotal;*/

	double getImporetotalgenerado() {
		double importetotal = 0;
	for(Alquiler a : getAlquileres())
		if(a !=null && a.getEstado().equals(Estadoalquiler.ENTREGADO) && a.getEstado().equals(Estadoalquiler.CERRADO)) {
		 importetotal = importetotal +(alquileres[i].numdias*getPreciopordia());}
		return importetotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(alquileres);
		result = prime * result + Objects.hash(disponible, id);
		return result;
	}

	@Override
	public abstract boolean equals(Object obj);
	}
