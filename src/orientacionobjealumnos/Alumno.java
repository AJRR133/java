package orientacionobjealumnos;

public class Alumno {
	String nombre;
	String dni;
	double nota;
	
	String coviertecadena() {
		String cadena = ("alumno 1: "+nombre+" su dni es " +dni+ " y su nota es " +nota);
		return cadena;
	}
	
	

	Boolean aprobado() {
		boolean aprobado = true;
		if (nota > 5) {
			aprobado = true;	
		}
		else {
			aprobado = false;
		}
		
		
		return aprobado;
	}
}
