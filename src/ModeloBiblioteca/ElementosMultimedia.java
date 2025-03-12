package ModeloBiblioteca;

public abstract class ElementosMultimedia extends Recurso  {

	private String nombre;
	private String genero;
	private int diasprestamos;
	
	public int getDiasprestamos() {
		return diasprestamos;
	}
	public void setDiasprestamos(int diasprestamos) {
		this.diasprestamos = diasprestamos;
	}
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
		this.diasprestamos = 10;
	}
	
	@Override
	public int devuelvediasdeprestamos() {
		// TODO Auto-generated method stub
		return diasprestamos;
	}
	
	
	
}
