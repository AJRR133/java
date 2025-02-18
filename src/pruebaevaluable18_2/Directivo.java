package pruebaevaluable18_2;

import java.util.Objects;

public class Directivo extends Empleados{

	private int porcentajeproductividad ;

	protected int getPorcentajeproductividad() {
		return porcentajeproductividad;
	}

	protected void setPorcentajeproductividad(int porcentajeproductividad) {
		this.porcentajeproductividad = porcentajeproductividad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(porcentajeproductividad);
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
		Directivo other = (Directivo) obj;
		return porcentajeproductividad == other.porcentajeproductividad;
	}

	public Directivo(String dni, String nombre, double salariobase, int porcentajeproductividad) {
		super(dni, nombre, salariobase);
		this.porcentajeproductividad = porcentajeproductividad;
	}

	@Override
	public String toString() {
		return "DNI:"+getDni()+"-Nombre:"+getNombre()+"-Salario:"+Calcularsalario();
	}
	
	
	protected double Calcularsalario() {
		double salariototal = getSalariobase()+(getSalariobase()*getPorcentajeproductividad()/100);
		return salariototal;
	}
	
}
