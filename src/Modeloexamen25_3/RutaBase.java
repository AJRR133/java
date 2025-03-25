package Modeloexamen25_3;

import java.util.Objects;

public  abstract class RutaBase  implements IRuta{
	int id;
	Ciudad ciudadorigen;
	Ciudad ciudaddestino;
	double distanciakm;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ciudad getCiudadorigen() {
		return ciudadorigen;
	}
	public void setCiudadorigen(Ciudad ciudadorigen) {
		this.ciudadorigen = ciudadorigen;
	}
	public Ciudad getCiudaddestino() {
		return ciudaddestino;
	}
	public void setCiudaddestino(Ciudad ciudaddestino) {
		this.ciudaddestino = ciudaddestino;
	}
	public double getDistanciakm() {
		return distanciakm;
	}
	public void setDistanciakm(double distanciakm) {
		this.distanciakm = distanciakm;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RutaBase other = (RutaBase) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "RutaBase [id=" + id + ", ciudadorigen=" + ciudadorigen + ", ciudaddestino=" + ciudaddestino
				+ ", distanciakm=" + distanciakm + "]";
	}
	public RutaBase(int id, Ciudad ciudadorigen, Ciudad ciudaddestino, double distanciakm) {
		super();
		this.id = id;
		this.ciudadorigen = ciudadorigen;
		this.ciudaddestino = ciudaddestino;
		this.distanciakm = distanciakm;
	}
	
	
	
}
