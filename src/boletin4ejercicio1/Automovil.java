package boletin4ejercicio1;

public class Automovil {

	private String dueno;
	private int numpuertas;
	private int numruedas;
	private String calificacionEcologica;
	

	public Automovil(String dueno, int numpuertas, int numruedas) {
		super();
		this.dueno = dueno;
		this.numpuertas = numpuertas;
		this.numruedas = numruedas;
		//this.calificacionEcologica = calificacionEcologica;
	}


	@Override
	public String toString() {
		return "Automovil [dueno=" + dueno + ", numpuertas=" + numpuertas + ", numruedas=" + numruedas
				+ ", calificacionEcologica=" + calificacionEcologica + "]";
	}


	public String getDueno() {
		return dueno;
	}


	public void setDueno(String dueno) {
		this.dueno = dueno;
	}


	public int getNumpuertas() {
		return numpuertas;
	}

	public void setNumpuertas(int numpuertas) {
		this.numpuertas = numpuertas;
	}

	public int getNumruedas() {
		return numruedas;
	}


	public void setNumruedas(int numruedas) {
		this.numruedas = numruedas;
	}

	public String getCalificacionEcologica() {
		return calificacionEcologica;
	}

	public void setCalificacionEcologica(String calificacionEcologica) {
		this.calificacionEcologica = calificacionEcologica;
	}
	

}
