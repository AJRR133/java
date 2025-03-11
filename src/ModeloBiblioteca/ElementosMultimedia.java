package ModeloBiblioteca;

public class ElementosMultimedia extends Recursos implements Iprestable {

	private String nombre;
	private String genero;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ElementosMultimedia(int id, String ubicacion, String nombre, String genero) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
	}
	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int devuelvediasdeprestamos() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	
	
}
