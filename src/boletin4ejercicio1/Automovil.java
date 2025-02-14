package boletin4ejercicio1;

public class Automovil extends Vehiculos {

	private Calieco calificacionEcologica;
	
	protected enum Calieco{
		ECO, CERO , B , C;
	}

	
	public Automovil(String dueno, int numpuertas, int numruedas, Calieco calificacionEcologica) {
		super(dueno, numpuertas, numruedas);
		setCalificacionEcologica(calificacionEcologica);
	}

	protected Calieco getCalificacionEcologica() {
		return calificacionEcologica;
	}

	protected void setCalificacionEcologica(Calieco calificacionEcologica) {
		if(calificacionEcologica.equals(Calieco.ECO)||calificacionEcologica.equals(Calieco.CERO)||calificacionEcologica.equals(Calieco.C)||calificacionEcologica.equals(Calieco.B))
		this.calificacionEcologica = calificacionEcologica;
	}

	@Override
	public String toString() {
		return "Automovil [calificacionEcologica=" + calificacionEcologica + ", dueno=" + dueno + ", numpuertas="
				+ numpuertas + ", numruedas=" + numruedas + "]";
	}
	
}
