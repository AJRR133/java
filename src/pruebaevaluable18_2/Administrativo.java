package pruebaevaluable18_2;

import java.util.Objects;

public class Administrativo extends Empleados{

	private double Extraproductividad;

	protected double getExtraproductividad() {
		return Extraproductividad;
	}

	protected void setExtraproductividad(double extraproductividad) {
		Extraproductividad = extraproductividad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Extraproductividad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrativo other = (Administrativo) obj;
		return Double.doubleToLongBits(Extraproductividad) == Double.doubleToLongBits(other.Extraproductividad);
	}

	public Administrativo(String dni, String nombre, double salariobase, double extraproductividad) {
		super(dni, nombre, salariobase);
		this.Extraproductividad = extraproductividad;
	}

	
	protected double Calcularsalario() {
		double salariototal = (getSalariobase()+getExtraproductividad());
		return salariototal;
	}

	@Override
	public String toString() {
		return "DNI:"+getDni()+"-Nombre:"+getNombre()+"-Salario:"+Calcularsalario();
	}
	
	
	

	
	
	
	
}
