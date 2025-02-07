package Prueba05;

public class Gestionaequipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona ("Andrea", "Gonzalez", "12345678s",23);
		Persona p2 = new Persona ("Juan", "Martin", "12344328s",20);
		Persona p3 = new Persona ("Ruben", "Arbol", "12345678s",19);
		Persona p4 = new Persona ("Maria", "Perez", "12345678s",17);
	
		
		Persona [] personas1 = {p1,p2};
		Persona [] personas2 = {p3,p4};
		
		int[] puntuaciones1 = {7,14,44};
		int[] puntuaciones2 = {27,44,2};
		
		Equipo equipo1 = new Equipo("equipo1", puntuaciones1, personas1);
		Equipo equipo2 = new Equipo("equipo2", puntuaciones2, personas2);
		
		System.out.println(equipo1);
		System.out.println(equipo2);
		
		Persona [] tablaPersonas = equipo1.participantes;
		for(int i = 0; i< tablaPersonas.length;i++) {
			Persona p = tablaPersonas[i];
			System.out.println(p.dni);
			
			
		}
		
		System.out.println(equipo1.calculamediaedad());
	}

}
