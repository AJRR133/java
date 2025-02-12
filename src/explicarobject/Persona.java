package explicarobject;

import java.util.Objects;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private double salario;
	private String email;
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellidos() {
		return apellidos;
	}
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	protected double getSalario() {
		System.out.println("getSalario de persona");
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	public Persona(String nombre, String apellidos, int edad, double salario, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
		this.email = email;
	}
	
	protected void concentrarse() {
		System.out.println("concentrarse padre");
		}
	
	protected void viajar (String lugar) {
		System.out.println("viajar padre");
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, email, nombre, salario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", salario=" + salario
				+ ", email=" + email + "]";
	}
	
	
	
	
}
