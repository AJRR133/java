package Excepciones;

public class Miexcepcion extends Exception{

	public Miexcepcion(String mensaje) {
		super(mensaje);
	}

	@Override
	public String toString() {
		return "Miexcepcion []";
	}

	
	
}
