package Rendonexamene1;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private Tipodieta dietaasignada;
	private LocalDate fechainscripcion;
	private boolean vip;
	
	
	public Cliente(String dni, String nombre, String apellido, int edad, Tipodieta dietaasignada,
			LocalDate fechainscripcion, boolean vip) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
		this.dietaasignada = dietaasignada;
		this.fechainscripcion = fechainscripcion;
		this.vip = vip;
	}


	@Override
	public String toString() {
		return "Cliente:" + dni + hayquehacerpromocion() + "tiene promocion";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellido, dietaasignada, dni, edad, fechainscripcion, nombre, vip);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}


	protected String getDni() {
		return dni;
	}


	protected void setDni(String dni) {
		this.dni = dni;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected String getApellido() {
		return apellido;
	}


	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}


	protected int getEdad() {
		return edad;
	}


	protected void setEdad(int edad) {
		if (edad > 0) {
		this.edad = edad;
		} else {
			System.out.println("la edad no puede ser inferior a 0");
		}
	}


	protected Tipodieta getDietaasignada() {
		return dietaasignada;
	}


	protected void setDietaasignada(Tipodieta dietaasignada) {
		this.dietaasignada = dietaasignada;
	}


	protected LocalDate getFechainscripcion() {
		return fechainscripcion;
	}


	protected void setFechainscripcion(LocalDate fechainscripcion) {
		this.fechainscripcion = fechainscripcion;
	}


	protected boolean getVip() {
		return vip;
	}


	protected void setVip(boolean vip) {
		this.vip = vip;
	}
	
	protected void hayquehacerpromocion() {
		
		if(vip=true||edad>65) {
			System.out.println("SI");	
		} else {
			System.out.println("NO");;
		}
		
	}
	
	protected  double calculeprecionconpromocion() {
		if(hayquehacerpromocion()==true) {
			if(precioventamenu>10) {
			}
		}
	}
	
}
