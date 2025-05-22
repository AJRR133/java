package RepositorioGuarderia;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import ModeloGuarderia.*;

public class RepositorioActividades {
	private HashSet<Actividad> actividades;

	public RepositorioActividades() {
		super();
		this.actividades = new HashSet<Actividad>();
		//Uso un hashset porque no repetidos y no me dicen que guarde ordenado
	}

	public Collection<Actividad> getActivididades() {
		return actividades;
	}

	public void setActivididades(HashSet<Actividad> activididades) {
		this.actividades = activididades;
	}
	
	public boolean isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) throws GuarderiaException {
		boolean esta = false;
		for(Actividad b : actividades) {
			if(b.getNombre().equals(nombreActividad) && b.getFecha().equals(fechaActividad)) {
				if(b.getAlumnos().contains(a)) {
					esta = true;
				}	
			} else {
				throw new GuarderiaException("No eexiste dicha actividad");
			}
		}
		return esta;
	}

	public void agregarAlumnoActividad(String nombreActividad, LocalDate fechaActividad, Alumno a)
			throws GuarderiaException {
		for(Actividad b : actividades) {
			if(actividades.size() <= b.getMaxAlumnos() && a.getEdad()> b.getEdadRecomendada()) {
				if(b.getNombre().equals(nombreActividad)&& b.getFecha().isEqual(fechaActividad)) {
					b.agregarAlumno(a);
				}
			
			} else {
				throw new GuarderiaException ("no se pudo añadir");
			}
		}

	}

	public List<Alumno> getAlumnadoConAlergias(String nombreActividad, LocalDate fechaActividad) throws GuarderiaException {
		List<Alumno> alergias = null;
		for(Actividad act : actividades) {
			if(act.getNombre().equals(nombreActividad) && act.getFecha().equals(fechaActividad)) {
				for(Alumno alum: act.getAlumnos()) {
					if(alum.getAlergias() != null) {
						alergias.add(alum);
					}
				}
			} else {
				throw new GuarderiaException("No existe dicha actividad");
			}
		}
		
		return alergias;
	}



	public List<Actividad> getListaActividades() {
		List<Actividad> actividades = null;
		    if (actividades == null) {
		    	actividades = new ArrayList<>(); // Devuelve lista vacía si no hay actividades
		    }

		    // Ordena por fecha de ejecución (ascendente)
		    actividades.sort(Comparator.comparing(Actividad::getFecha));

		    return actividades;
		}

		

}
