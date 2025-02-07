package boletin2ejercicio3;

public class Alumnos {
	
	String nombreA;
	String apellidos;
	String email;
	Notaasignatura notaprog;
	Notaasignatura notabase;
	public Alumnos(String nombreA, String email) {
		super();
		this.nombreA = nombreA;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombreA + ", apellidos=" + apellidos + ", email=" + email + ", notaprog=" + notaprog
				+ ", notabase=" + notabase + "]";
	}
	
	
	void imprimesihaaprobado(String nombre) {
		Notaasignatura notas;
		if (nombre.equals("prog")) {
			notas = this.notaprog;
			
		} else {
			notas = this.notabase;
		} if (notas.notamedia()>= 5) {
			System.out.println("El alumno"+ nombreA + "ha aprobado" + notas);
		} else {
			System.out.println("El alumno"+ nombreA + "ha aprobado" + notas);

		}
		
	}
	

	/*lucia.notaprog.primt
	 * lucia.notaprog.nombre
	 * vicente.notabd.calculamedia()
	 */
}
