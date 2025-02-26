package conversormonedamodelo;

public class Conversor {
	static final double EURO = 0.95;
	final static double DOLAR= 1.05;

	public static double dolaresaeuros(double dolares) {
		double euros = 0;
		return  euros = dolares*EURO;
	}
	
	public static double eurosadolares(double euros) {
		double dolares = 0;
		return dolares = euros*DOLAR;
	}
	
}
