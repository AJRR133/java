package boletin4ejercicio1;

public class Camion extends Vehiculos  {

	private int tonelajekilos;
	private int numpasajero;
	private int numejes;
	
	
	public Camion(String dueno, int numpuertas, int numruedas, int tonelajekilos, int numpasajero, int numejes) {
		super(dueno, numpuertas, numruedas);
		
		this.tonelajekilos = tonelajekilos;
		this.numpasajero = numpasajero;
		this.numejes = numejes;
	}
	



	@Override
	public String toString() {
		return "Camion [tonelajekilos=" + tonelajekilos + ", numpasajero=" + numpasajero + ", numejes=" + numejes + "]";
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
