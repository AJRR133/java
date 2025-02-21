package rendonexamen2;

public class Laptop extends Computadora {
	 private double peso;

	public Laptop(String marca, String modelo, double precio, int capadidadram, double peso) {
		super(marca, modelo, precio, capadidadram);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	protected double calcularpreciodescuento() {
		double preciodescuento = 0.0;
		if(peso<2.0) {
			preciodescuento = getPrecio()-(getPrecio()*12)/100;
		} else if (peso>2.0) {
			preciodescuento= getPrecio()-((getPrecio()*12)/100+(getPrecio()*12/100));
		}
		return preciodescuento;
	}
}
