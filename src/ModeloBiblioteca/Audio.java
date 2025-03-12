package ModeloBiblioteca;

public class Audio extends ElementosMultimedia {
	
	private int duracionminutos;
	
	public Audio(int id, String ubicacion, String nombre, String genero, int duracionminutos) {
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
		return "Audio [duracionminutos=" + duracionminutos + ", getNombre()=" + getNombre() + ", getGenero()="
				+ getGenero() + ", getId()=" + getId() + ", getUbicacion()=" + getUbicacion() + "]";
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	
}


