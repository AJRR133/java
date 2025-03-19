package Modelosimulacro19_3;

import java.util.Objects;

public abstract class   VehiculoCombustible extends Vehiculo {
	String matricula;
	boolean esdiesel;
	String marca;
	String modelo;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isEsdiesel() {
		return esdiesel;
	}
	public void setEsdiesel(boolean esdiesel) {
		this.esdiesel = esdiesel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiculoCombustible other = (VehiculoCombustible) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	

}
