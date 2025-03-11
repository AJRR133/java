package ModeloBiblioteca;

public class Juegos extends ElementosMultimedia implements Iprestable {

	private int numfases;

	public int getNumfases() {
		return numfases;
	}

	public void setNumfases(int numfases) {
		this.numfases = numfases;
	}

	public Juegos(int id, String ubicacion, String nombre, String genero, int numfases) {
		super(id, ubicacion, nombre, genero);
		this.numfases = numfases;
	}

	@Override
	public String toString() {
		return "Juegos [numfases=" + numfases + ", getNombre()=" + getNombre() + ", getGenero()=" + getGenero()
				+ ", getId()=" + getId() + ", getUbicacion()=" + getUbicacion() + "]";
	}
	
	
	
}
