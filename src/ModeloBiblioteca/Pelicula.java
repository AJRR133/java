package ModeloBiblioteca;

public class Pelicula extends ElementosMultimedia {

	private int duracionminutos;
	
	
	public Pelicula(int id, String ubicacion, String nombre, String genero, int duracionminutos) {
		super(id, ubicacion, nombre, genero);
		this.duracionminutos = duracionminutos;
	}

	public int getDuracionminutos() {
		return duracionminutos;
	}

	public void setDuracionminutos(int duracionminutos) {
		this.duracionminutos = duracionminutos;
	}

	@Override
	public String toString() {
		return "Peliculas [duracionminutos=" + duracionminutos + ", getNombre()=" + getNombre() + ", getGenero()="
				+ getGenero() + ", getId()=" + getId() + ", getUbicacion()=" + getUbicacion() + "]";
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	 

	

	
	
}
