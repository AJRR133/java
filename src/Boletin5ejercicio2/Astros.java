package Boletin5ejercicio2;

import java.util.Objects;

public class Astros {

	private String nombre;
	private double masacuerpo;
	private double diametromedio;
	private double periodorota;
	private double periodotras;
	private double distanciamedia;
	
	public Astros(String nombre, double masacuerpo, double diametromedio, double periodorota, double periodotras,
			double distanciamedia) {
		super();
		this.nombre = nombre;
		this.masacuerpo = masacuerpo;
		this.diametromedio = diametromedio;
		this.periodorota = periodorota;
		this.periodotras = periodotras;
		this.distanciamedia = distanciamedia;
	}

	@Override
	public String toString() {
		return "Astros [nombre=" + nombre + ", masacuerpo=" + masacuerpo + ", diametromedio=" + diametromedio
				+ ", periodorota=" + periodorota + ", periodotras=" + periodotras + ", distanciamedia=" + distanciamedia
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diametromedio, distanciamedia, masacuerpo, nombre, periodorota, periodotras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Astros other = (Astros) obj;
		return Double.doubleToLongBits(diametromedio) == Double.doubleToLongBits(other.diametromedio)
				&& Double.doubleToLongBits(distanciamedia) == Double.doubleToLongBits(other.distanciamedia)
				&& Double.doubleToLongBits(masacuerpo) == Double.doubleToLongBits(other.masacuerpo)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(periodorota) == Double.doubleToLongBits(other.periodorota)
				&& Double.doubleToLongBits(periodotras) == Double.doubleToLongBits(other.periodotras);
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected double getMasacuerpo() {
		return masacuerpo;
	}

	protected void setMasacuerpo(double masacuerpo) {
		this.masacuerpo = masacuerpo;
	}

	protected double getDiametromedio() {
		return diametromedio;
	}

	protected void setDiametromedio(double diametromedio) {
		this.diametromedio = diametromedio;
	}

	protected double getPeriodorota() {
		return periodorota;
	}

	protected void setPeriodorota(double periodorota) {
		this.periodorota = periodorota;
	}

	protected double getPeriodotras() {
		return periodotras;
	}

	protected void setPeriodotras(double periodotras) {
		this.periodotras = periodotras;
	}

	protected double getDistanciamedia() {
		return distanciamedia;
	}

	protected void setDistanciamedia(double distanciamedia) {
		this.distanciamedia = distanciamedia;
	}
	
	

	
	
}
