package pruebaherencia;

import java.time.LocalDate;

public class Profesorinterino extends Profesor {

	private LocalDate fechafincontrato;

	public Profesorinterino(String nombre, String departamento, LocalDate fechafincontrato) {
		super(nombre, departamento);
		this.fechafincontrato = fechafincontrato;
	}

	protected LocalDate getFechafincontrato() {
		return fechafincontrato;
	}

	protected void setFechafincontrato(LocalDate fechafincontrato) {
		this.fechafincontrato = fechafincontrato;
	}

	@Override
	public String toString() {
		return "Profesorinterino [fechafincontrato=" + fechafincontrato + ", getDepartamento()=" + getDepartamento()
				+ ", getNombre()=" + getNombre() + "]";
	}
	
	
	
	
	
}
