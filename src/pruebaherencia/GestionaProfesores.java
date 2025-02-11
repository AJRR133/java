package pruebaherencia;

import java.time.LocalDate;

public class GestionaProfesores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesorinterino interino1 = new Profesorinterino("pepe", "ingles", LocalDate.now().plusMonths(6));
		Profesor interino2 = new Profesorinterino("pepa", "historia", LocalDate.now().plusMonths(4));

		System.out.println(interino1.getFechafincontrato());
		Profesorinterino p2 = (Profesorinterino)interino2; //Down casting
		System.out.println(p2.getFechafincontrato());

		
		Profesortitular titular1 = new Profesortitular("Juan", "Filosofia", LocalDate.now().minusYears(6));
		Profesor titular2 = new Profesortitular("Manue", "Lengua", LocalDate.now().minusYears(4));
		
		System.out.println(titular1.getFechaadjudicacionplaza());
		Profesortitular p4 = (Profesortitular)titular2; //down castng
		System.out.println(p4.getFechaadjudicacionplaza());
	
		
		
		
		Profesor p1 = (Profesor)interino1;//Up casting de hijo a padre 
		
	}

}
