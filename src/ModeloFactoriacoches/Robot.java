package ModeloFactoriacoches;

import java.util.Objects;

public abstract class Robot {
	private String modelo;
	private int bateria;
	private Estado estado;
	private static int contador=1;
	private int id;

	public Robot(String modelo, int bateria, Estado estado) {
		super();
		this.modelo = modelo;
		this.bateria = bateria;
		this.estado = estado;
		this.id= contador;
		contador= contador+1;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Robot.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		Robot other = (Robot) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Robot [modelo=" + modelo + ", bateria=" + bateria + ", estado=" + estado + ", id=" + id + "]";
	} 
	
	public boolean bateriasuficiente() {
		boolean sufi = true;
		if(bateria>10) {
			 sufi = true;
		} else {
			sufi = false;}
		return sufi;
	}
	
	public abstract String ejecutartarea();
	public abstract boolean recargar();

}
