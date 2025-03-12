package ModeloBiblioteca;

public class Libro extends Recurso  {

	private String autor;
	private String editorial;
	private String genero;

	public Libro(int id, String ubicacion, String autor, String editorial, String genero) {
		super(id, ubicacion);
		this.autor = autor;
		this.editorial = editorial;
		this.genero = genero;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false ;
	}
	@Override
	public int devuelvediasdeprestamos() {
		// TODO Auto-generated method stub
		return 21;
	}

	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", editorial=" + editorial + ", genero=" + genero + "]";
	}
	
	
}
