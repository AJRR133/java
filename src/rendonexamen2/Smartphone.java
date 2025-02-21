package rendonexamen2;

public class Smartphone extends Telefono {
	
	private int cantidadcamaras;

	public Smartphone(String marca, String modelo, double precio, boolean tienetecladofisico, int cantidadcamaras) {
		super(marca, modelo, precio, tienetecladofisico);
		this.cantidadcamaras = cantidadcamaras;
	}

	protected int getCantidadcamaras() {
		return cantidadcamaras;
	}

	protected void setCantidadcamaras(int cantidadcamaras) {
		this.cantidadcamaras = cantidadcamaras;
	}
	
	protected double calcularpreciodescuento() {
		double preciodescuento = 0.0;
		preciodescuento = getPrecio()-(getPrecio()*15)/100;
		return preciodescuento;
	}
}
