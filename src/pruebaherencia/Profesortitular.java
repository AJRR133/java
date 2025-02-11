package pruebaherencia;

import java.time.LocalDate;

public class Profesortitular extends Profesor {

	private LocalDate fechaadjudicacionplaza;

	public Profesortitular(String nombre, String departamento, LocalDate fechaadjudicacionplaza) {
		super(nombre, departamento);
		this.fechaadjudicacionplaza = fechaadjudicacionplaza;
	}

	protected LocalDate getFechaadjudicacionplaza() {
		return fechaadjudicacionplaza;
	}

	protected void setFechaadjudicacionplaza(LocalDate fechaadjudicacionplaza) {
		this.fechaadjudicacionplaza = fechaadjudicacionplaza;
	}

	@Override
	public String toString() {
		return "Profesortitular [fechaadjudicacionplaza=" + fechaadjudicacionplaza + ", getDepartamento()="
				+ getDepartamento() + ", getNombre()=" + getNombre() + "]";
	}

	
}
