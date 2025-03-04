package ejemploanimalesmodelo;

public abstract class Animal {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getSonidoqueemite();

	public abstract String getAlimento();

}
