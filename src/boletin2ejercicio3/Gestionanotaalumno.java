package boletin2ejercicio3;

public class Gestionanotaalumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Notaasignatura notaproglucia = new Notaasignatura("prog", 5,7,7);
		Notaasignatura notabaselucia = new Notaasignatura("base", 6,6,7);
		Alumnos lucia = new Alumnos("Lucia", "lucia@gmail.com");
		lucia.notaprog = notaproglucia;
		lucia.notabase = notabaselucia;
		System.out.println(lucia);
		
		Notaasignatura notaprogandres = new Notaasignatura("prog", 4,4,6);
		Notaasignatura notabaseandres = new Notaasignatura("base", 9,8,8);
		Alumnos andres = new Alumnos("andres", "andres@gmail.com");
		andres.notaprog = notaprogandres;
		andres.notabase = notabaseandres;
		System.out.println(andres);
		
	}

}
