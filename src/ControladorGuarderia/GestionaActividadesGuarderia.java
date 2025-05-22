package ControladorGuarderia;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ModeloGuarderia.*;
import RepositorioGuarderia.*;

public class GestionaActividadesGuarderia {

	public static void main(String[] args) throws GuarderiaException {
		GestionaActividadesGuarderia g = new GestionaActividadesGuarderia();
		RepositorioActividades actividades = new RepositorioActividades();

		Maestro maestro1 = new Maestro("Lucía", "Gómez", "12345678A", "Grupo 3A");
		Maestro maestro2 = new Maestro("Carlos", "Pérez", "87654321B", "Grupo 2B");
		
		Alumno alumno1 = new Alumno("Sofía", "Martínez", 4, "612345678", Arrays.asList("Gluten"), true, maestro1);
		Alumno alumno2 = new Alumno("Lucas", "Fernández", 3, "622223334",new ArrayList<String>(), false, maestro1);
		Alumno alumno3 = new Alumno("Emma", "López", 3, "633334445", Arrays.asList("Lácteos", "Frutos secos"), true, maestro2);
		Alumno alumno4 = new Alumno("Mateo", "García", 5, "644445556", Arrays.asList("Polen"), true, maestro2);
		Alumno alumno5 = new Alumno("María", "García", 5, "644445556", Arrays.asList("Polen"), true, maestro2);
		Alumno[] alumnos = {alumno1, alumno2, alumno3, alumno4};


		Actividad actividad1 = new Actividad("Pintura con dedos", Lugar.AULA, 3, 4, maestro1, LocalDate.now().plusDays(10));

		Actividad actividad2 = new Actividad("Juegos en el patio", Lugar.PATIO, 4, 2, maestro2, LocalDate.now().plusDays(15));

		Actividad actividad3 = new Actividad("Cuenta cuentos", Lugar.SUM, 3, 12, maestro1, LocalDate.now().plusDays(20));

		Actividad actividad4 = new Actividad("Yoga infantil", Lugar.GIMNASIO, 5, 8, maestro2, LocalDate.now());

		actividades.getActivididades().add(actividad4);
		actividades.getActivididades().add(actividad1);
		actividades.getActivididades().add(actividad2);
		actividades.getActivididades().add(actividad3);
		
		for(Alumno a: alumnos)
		{
			actividad4.agregarAlumno(a);
			System.out.println(actividad4);
		}
		
		for(Alumno a: alumnos)
		{
			actividad2.agregarAlumno(a);
		}
		try {
		    System.out.println(actividades.isAlumnoApuntado("Pintura con dedos", LocalDate.now().plusDays(10), alumno4));
		} catch (GuarderiaException e) {
		    System.out.println("Error: " + e.getMessage());
		}

		try {
		    System.out.println(actividades.isAlumnoApuntado("Pintuas", LocalDate.now().plusDays(10), alumno4));
		} catch (GuarderiaException e) {
		    System.out.println("Error: " + e.getMessage());
		}

		try {
		    System.out.println(actividades.isAlumnoApuntado("Pintura con dedos", LocalDate.now().plusDays(10), alumno4));
		} catch (GuarderiaException e) {
		    System.out.println("Error: " + e.getMessage());
		}

		try {
		    System.out.println(actividades.isAlumnoApuntado("Pintuas", LocalDate.now().plusDays(10), alumno4));
		} catch (GuarderiaException e) {
		    System.out.println("Error: " + e.getMessage());
		}

		try {
		    System.out.println(actividades.isAlumnoApuntado("Pintura con dedos", LocalDate.now().plusDays(10), alumno5));
		} catch (GuarderiaException e) {
		    System.out.println("Error: " + e.getMessage());
		}

		try {
		    System.out.println(actividades.isAlumnoApuntado("Pintuas", LocalDate.now().plusDays(10), alumno5));
		} catch (GuarderiaException e) {
		    System.out.println("Error: " + e.getMessage());
		}

		try {
		    List<Alumno> alumnos1 = actividades.getAlumnadoConAlergias("Pintura con dedos", LocalDate.now());
		    if (alumnos1 != null) {
		        for (Alumno a : alumnos1) {
		            System.out.println(a);
		        }
		    }
		} catch (GuarderiaException e) {
		    System.out.println("Error al obtener alumnos con alergias: " + e.getMessage());
		}

		try {
		    List<Alumno> alumnos1 = actividades.getAlumnadoConAlergias("Pintura ", LocalDate.now());
		    if (alumnos1 != null) {
		        for (Alumno a : alumnos1) {
		            System.out.println(a);
		        }
		    }
		} catch (GuarderiaException e) {
		    System.out.println("Error al obtener alumnos con alergias: " + e.getMessage());
		}

		List<Actividad> actividadesOrd = actividades.getListaActividades();
		if (actividadesOrd != null) {
		    for (Actividad a : actividadesOrd) {
		        System.out.println(a);
		    }
		}

		///////////////////////////////////////////////////////////////////
		/*
		 * Utiliza este espacio si necesitas hacer pruebas propias
		 */
		//////////////////////////////////////////////////////////////////////
		
		

	}

	
	
	/*boolean agregaAlumno(Alumno a, Actividad actividad)
	{
		boolean agregado = false;
		//TODO
		return agregado;
	}
	
	boolean  isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) 
	{
		boolean esta = false;
		//TODO
		return esta;
	}*/
}
