package Boletinlistasejercicio2;

public class Gestionaequipos {

	public static void main(String[] args) throws DeportivosException {
		// TODO Auto-generated method stub
		 Alumno alumno1 = new Alumno("paquito", "12345678A");
         Alumno alumno2 = new Alumno("Manue", "23456789B");
         Alumno alumno3 = new Alumno("Perro Sanchez", "34567890C");
         Alumno alumno4 = new Alumno("Cabesa", "45678901D");
         
         
         Equipo equipo1 = new Equipo("Equipo 1");
         Equipo equipo2 = new Equipo("Equipo 2");
         
         equipo1.addalumno(alumno1);
         equipo1.addalumno(alumno2);
         equipo2.addalumno(alumno3);
         equipo2.addalumno(alumno4); 
         
         //equipo1.addalumno(alumno2);
         
       /*  equipo1.listadoalumno();
         equipo2.listadoalumno();
         
         equipo1.deletealumno(alumno1);
         equipo1.listadoalumno();*/
         
         System.out.println(equipo2.pertenecealumno(alumno4));
         System.out.println(equipo2.pertenecealumno(alumno2));
         
         System.out.println(equipo1.unionequipos(equipo2));
         System.out.println(equipo1.interseccionequipos(equipo2));
	}

}
