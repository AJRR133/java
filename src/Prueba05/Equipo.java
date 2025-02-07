package Prueba05;

import java.util.Arrays;

public class Equipo {

	String nombreequipo;
	int[] puntuaciones;
	Persona[] participantes;
	public Equipo(String nombreequipo, int[] puntuaciones, Persona[] participantes) {
		super();
		this.nombreequipo = nombreequipo;
		this.puntuaciones = puntuaciones;
		this.participantes = participantes;
	}
	@Override
	public String toString() {
		return "Equipo [nombreequipo=" + nombreequipo + ", puntuaciones=" + Arrays.toString(puntuaciones)
				+ ", participantes=" + Arrays.toString(participantes) + "]";
	}
	
	
	double calculamediaedad() {
		double mediaedad = 0;
		double edades = 0;
		Persona [] tablaPersona = this.participantes;
		for (Persona p : tablaPersona) {
			
			 edades = edades + p.edad;
			 //System.out.println(edades);
		}
		mediaedad = edades/participantes.length;
		return mediaedad;
		
	}
	
	
	
	
	
	
}
