package boletin4ejercicio1;

public class Automovil extends Vehiculos {

	private String calificacionEcologica;

	public Automovil(String dueno, int numpuertas, int numruedas, String calificacionEcologica) {
		super(dueno, numpuertas, numruedas);
		 this.calificacionEcologica = calificacionEcologica;
	}

	public String getCalificacionEcologica() {
		return calificacionEcologica;
	}

	@Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + ", dueno=" + dueno + ", numpuertas="
				+ numpuertas + ", numruedas=" + numruedas + "]";
	}

	public void setCalificacionEcologica(String calificacionEcologica) {
		this.calificacionEcologica = calificacionEcologica;
	}

}
