package orientacionobjealumnos;


public class gestionaalumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1 = new Alumno();
		alumno1.nombre = "Juan";
		alumno1.dni= "12345678A";
		alumno1.nota = 2.2;
		
		Alumno alumno2 = new Alumno();
		alumno2.nombre = "Manolo";
		alumno2.dni= "12345678A";
		alumno2.nota = 5.2;
		
		String cadenaalumno1 = alumno1.coviertecadena();
		System.out.println(cadenaalumno1);
		
		boolean resultado1 = alumno1.aprobado();
		System.out.println(resultado1);
		
		String cadenaalumno2 = alumno2.coviertecadena();
		System.out.println(cadenaalumno2);
		
		boolean resultado2 = alumno2.aprobado();
		System.out.println(resultado2);
		
		
		
	}

}
