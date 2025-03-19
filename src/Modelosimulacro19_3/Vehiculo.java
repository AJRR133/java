package Modelosimulacro19_3;

import java.util.Arrays;
import java.util.Objects;

public abstract class Vehiculo implements IAlquilable{
	int id;
	Alquiler [] alquileres;
	boolean disponible;
	
	
	public boolean estaalquilado() {
		boolean alquilado = true;
		if(this.disponible=false) {
			alquilado = true;
		} else {
			alquilado = false;
		}
		return alquilado;}

	double getImporetotalgenerado() {
		double importetotal = 0;
	for(int i = 0; alquileres.length >0 ; i++)
		 importetotal = importetotal +(alquileres[i].numdias*getPreciopordia());
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
