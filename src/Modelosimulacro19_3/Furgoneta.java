package Modelosimulacro19_3;

public class Furgoneta extends VehiculoCombustible {

	int numplazas;
	double pma;
	
	protected int getNumplazas() {
		return numplazas;
	}
	protected void setNumplazas(int numplazas) {
		this.numplazas = numplazas;
	}
	protected double getPma() {
		return pma;
	}
	protected void setPma(double pma) {
		this.pma = pma;
	}
	
	public Furgoneta(int numplazas, double pma) {
		super();
		this.numplazas = numplazas;
		this.pma = pma;
	}
	
	@Override
	public double getPreciopordia() {
		double preciodiario =  45+(0.5*pma);;
		return  preciodiario;
		
	}
	
	
	
}
