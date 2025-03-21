
package Modelosimulacro21_3;

import java.util.Arrays;
import java.util.Objects;

public class Piloto {
	String nombre;
	String nacionalidad;
	int edad;
	int numlicencia;
	double horasvuelo;
	Vuelo [] vuelos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNumlicencia() {
		return numlicencia;
	}
	public void setNumlicencia(int numlicencia) {
		this.numlicencia = numlicencia;
	}
	public double getHorasvuelo() {
		return horasvuelo;
	}
	public void setHorasvuelo(double horasvuelo) {
		this.horasvuelo = horasvuelo;
	}
	public Vuelo[] getVuelos() {
		return vuelos;
	}
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numlicencia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		return numlicencia == other.numlicencia;
	}
	public Piloto(String nombre, String nacionalidad, int edad, int numlicencia, double horasvuelo) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numlicencia = numlicencia;
		this.horasvuelo = horasvuelo;
		this.vuelos = new Vuelo[30];
	}
	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", numlicencia="
				+ numlicencia + ", horasvuelo=" + horasvuelo + ", vuelos=" + Arrays.toString(vuelos) + "]";
	}
	
	public void agregarvuelo(Vuelo v ) throws Vueloexception {
		for(int i =0 ; i < vuelos.length; i++)
		if(v.getDuracion()>8 && this instanceof Comercial == true) {
			throw new Vueloexception("No puedes añadir un vuelo de mas de 8 horas a un piloto comercial");
		} else if(v.equals(vuelos[i])) {
			throw new Vueloexception("No puedes agregar un vuelo ya existente");
		} else {
			
		}
	}
	
}
