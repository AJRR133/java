package RepositorioGuarderia;


import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import ModeloGuarderia.*;

public class RepositorioActividades {
	private HashSet<Actividad> activididades;

	public RepositorioActividades() {
		super();
		this.activididades = new HashSet<Actividad>();
		//Uso un hashset porque no repetidos y no me dicen que guarde ordenado
	}

	public Collection<Actividad> getActivididades() {
		return activididades;
	}

	public void setActivididades(HashSet<Actividad> activididades) {
		this.activididades = activididades;
	}
	
	public boolean isAlumnoApuntado(String nombreActividad, LocalDate fechaActividad, Alumno a) throws GuarderiaException {
		boolean esta = false;
		// TODO

		return esta;
	}

	public void agregarAlumnoActividad(String nombreActividad, LocalDate fechaActividad, Alumno a)
			throws GuarderiaException {
		// TODO

	}

	public List<Alumno> getAlumnadoConAlergias(String nombreActividad, LocalDate fechaActividad) {
		List<Alumno> alergias = null;

		// TODO
		return alergias;
	}



	public List<Actividad> getListaActividades() {
		List<Actividad> actividades = null;

		// TODO
		return actividades;
	}

}
