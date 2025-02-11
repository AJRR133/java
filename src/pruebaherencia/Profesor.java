package pruebaherencia;

public class Profesor extends Persona {

	private String departamento;

	
	
	public Profesor(String nombre, String departamento) {
		super(nombre);
		this.departamento = departamento;
	}

	protected String getDepartamento() {
		return departamento;
	}

	protected void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", getNombre()=" + super.getNombre() + "]";
	}
	
	
	
}
