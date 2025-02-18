package pruebaevaluable18_2;

import java.util.Objects;

public class Empleados {
	
	private String Dni;
	private String Nombre;
	private double salariobase;
	protected  String getDni() {
		return Dni;
	}
	protected void setDni(String dni) {
		Dni = dni;
	}
	protected String getNombre() {
		return Nombre;
	}
	protected void setNombre(String nombre) {
		Nombre = nombre;
	}
	protected double getSalariobase() {
		return salariobase;
	}
	protected void setSalariobase(double salariobase) {
		if (salariobase>0){
		this.salariobase = salariobase;
		} else {
			System.out.println("El selario introducido tiene un valor negativo");
			this.salariobase = 1134;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(Dni, Nombre, salariobase);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return Objects.equals(Dni, other.Dni) && Objects.equals(Nombre, other.Nombre)
				&& Double.doubleToLongBits(salariobase) == Double.doubleToLongBits(other.salariobase);
	}
	public Empleados(String dni, String nombre, double salariobase) {
		super();
		this.Dni = dni;
		this.Nombre = nombre;
		this.salariobase = salariobase;
	}
	@Override
	public String toString() {
		return "DNI:"+getDni()+"-Nombre:"+getNombre()+"-Salario:"+getSalariobase();
	}
	
	/*protected double Calcularsalario(Empleados p) {
		if( p instanceof Administrativo) {
		double salariototal = (getSalariobase()+getExtraproductividad()); 
		return salariototal;
		} else if (p instanceof Directivos) {
			
		}
	}*/

	private boolean validardniempleados(Empleados p1, Empleados p2) {
		return Dni !=null && p1.Dni.equals(p2.getDni());
	}
}
