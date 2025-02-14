package Autosinteligentes;

import java.util.Objects;

public class Sensor {
	private double distancia;
	private double velocidad;
	
	protected boolean avisarobstaculo() {
		
	
		return false;
	}
	protected boolean avisarvelocidad() {
		return false;
	}
	protected double getDistancia() {
		return distancia;
	}
	protected void setDistancia(double distancia) {
		if(distancia>0) {
			this.distancia = distancia;

		} else {
			this.distancia = 0;
	}
		this.distancia = distancia;
	}
	protected double getVelocidad() {
		return velocidad;
	}
	protected void setVelocidad(double velocidad) {
		if(velocidad>0) {
 
		} else {
			this.velocidad = 0;
	}
		this.velocidad = velocidad;;
	}
	@Override
	public int hashCode() {
		return Objects.hash(distancia, velocidad);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		return Double.doubleToLongBits(distancia) == Double.doubleToLongBits(other.distancia)
				&& Double.doubleToLongBits(velocidad) == Double.doubleToLongBits(other.velocidad);
	}
	@Override
	public String toString() {
		return "Sensor [distancia=" + distancia + ", velocidad=" + velocidad + "]";
	}
	public Sensor(double distancia, double velocidad) {
		super();
		this.distancia = distancia;
		this.velocidad = velocidad;
	}
	
}
