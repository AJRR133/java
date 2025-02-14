package Autosinteligentes;

import java.util.Objects;

public class Coche {
	private String marca;
	private String modelo;
	private String matricula;
	private Conductor dueno;
	private Estadocoche estado;
	private Sensor sensor;
	
	protected void arrancar () {	
	}
	
	protected void apagar() {	
	}
	
	protected void debeparar() {
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected Conductor getDueno() {
		return dueno;
	}

	protected void setDueno(Conductor dueno) {
		this.dueno = dueno;
	}

	protected Estadocoche getEstado() {
		return estado;
	}

	protected void setEstado(Estadocoche estado) {
		this.estado = estado;
	}

	protected Sensor getSensor() {
		return sensor;
	}

	protected void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dueno, estado, marca, matricula, modelo, sensor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(dueno, other.dueno) && estado == other.estado && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(sensor, other.sensor);
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", dueno=" + dueno
				+ ", estado=" + estado + ", sensor=" + sensor + "]";
	}

	public Coche(String marca, String modelo, String matricula, Conductor dueno, Estadocoche estado, Sensor sensor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.dueno = dueno;
		this.estado = estado;
		this.sensor = sensor;
	}
	
}
