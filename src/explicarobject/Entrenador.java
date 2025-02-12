package explicarobject;

import java.util.Objects;

public class Entrenador extends Persona {

	private String idfederacion;
	
	public Entrenador(String nombre, String apellidos, int edad, double salario, String email, String idfederacion) {
		super(nombre, apellidos, edad, salario, email);
		this.idfederacion = idfederacion;
	}
	

	public Entrenador(String nombre, String apellidos, int edad, double salario, String email) {
		super(nombre, apellidos, edad, salario, email);
		this.idfederacion = "ESP";
	}




	protected String getIdfederacion() {
		return idfederacion;
	}

	protected void setIdfederacion(String idfederacion) {
		this.idfederacion = idfederacion;
	}
	
	protected void dirigirpartido() {
		System.out.println("Dirigir partido");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idfederacion);
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
		Entrenador other = (Entrenador) obj;
		return Objects.equals(idfederacion, other.idfederacion);
	}


	@Override
	public String toString() {
		return "Entrenador [idfederacion=" + idfederacion + ", toString()=" + super.toString() + "]";
	}

	protected void concentrarse() {
		System.out.println("concentrarse entrenador");
		}
	
	protected void viajar (String lugar) {
		System.out.println("viajar entrenador");
	}

	
	
	
}
