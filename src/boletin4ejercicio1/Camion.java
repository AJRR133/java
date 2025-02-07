package boletin4ejercicio1;

public class Camion {

	private String dueno;
	private int numpuertas;
	private int numruedas;
	private int tonelajekilos;
	private int numpasajero;
	private int numejes;
	
	
	public Camion(String dueno, int numpuertas, int numruedas, int tonelajekilos, int numpasajero, int numejes) {
		super();
		this.dueno = dueno;
		this.numpuertas = numpuertas;
		this.numruedas = numruedas;
		this.tonelajekilos = tonelajekilos;
		this.numpasajero = numpasajero;
		this.numejes = numejes;
	}


	@Override
	public String toString() {
		return "Camion [dueno=" + dueno + ", numpuertas=" + numpuertas + ", numruedas=" + numruedas + ", tonelajekilos="
				+ tonelajekilos + ", numpasajero=" + numpasajero + ", numejes=" + numejes + "]";
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


	public int getTonelajekilos() {
		return tonelajekilos;
	}


	public void setTonelajekilos(int tonelajekilos) {
		this.tonelajekilos = tonelajekilos;
	}


	public int getNumpasajero() {
		return numpasajero;
	}


	public void setNumpasajero(int numpasajero) {
		this.numpasajero = numpasajero;
	}


	public int getNumejes() {
		return numejes;
	}


	public void setNumejes(int numejes) {
		this.numejes = numejes;
	}
	
	
}
