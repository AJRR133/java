package Correoelectronicomodelo;

public class Correo {
	private String nombre;
	private String dominio;
	
	public static boolean validacorreo(String correo) {
		boolean valida = true;
		correo.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
		return valida;
	}

	public Correo(String correocompleto) {
		super();
		String [] partes = correocompleto.split("@");
		this.nombre=
	}
	
}
