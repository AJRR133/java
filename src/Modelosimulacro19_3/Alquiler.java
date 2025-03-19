package Modelosimulacro19_3;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler {
	int id;
	Vehiculo datosvehiculo;
	int numpermiso;
	String dni;
	LocalDate fechaentrega;
	LocalDate fecharegistro;
	int numdias;
	Estadoalquiler Estado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vehiculo getDatosvehiculo() {
		return datosvehiculo;
	}
	public void setDatosvehiculo(Vehiculo datosvehiculo) {
		this.datosvehiculo = datosvehiculo;
	}
	public int getNumpermiso() {
		return numpermiso;
	}
	public void setNumpermiso(int numpermiso) {
		this.numpermiso = numpermiso;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaentrega() {
		return fechaentrega;
	}
	public void setFechaentrega(LocalDate fechaentrega) {
		this.fechaentrega = fechaentrega;
	}
	public LocalDate getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public int getNumdias() {
		return numdias;
	}
	public void setNumdias(int numdias) {
		this.numdias = numdias;
	}
	public Estadoalquiler getEstado() {
		return Estado;
	}
	public void setEstado(Estadoalquiler estado) {
		Estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(datosvehiculo, fechaentrega, fecharegistro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return Objects.equals(datosvehiculo.id, other.datosvehiculo.id) && Objects.equals(fechaentrega, other.fechaentrega)
				&& Objects.equals(fecharegistro, other.fecharegistro);
	}
	
	 double getimportegeneradporalquiler() {
		 return  0; 
	 }
}
	
