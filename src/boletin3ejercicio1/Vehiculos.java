package boletin3ejercicio1;

public class Vehiculos {
	
	String marca;
	String modelo;
	int anyo;
	String tipocombustible;
	double capacidadtotal;
	double cantidadactual;
	double consumomedio;
	
	
	

	public Vehiculos(String marca, String modelo, int anyo, String tipocombustible, double capacidadtotal,
			double cantidadactual, double consumomedio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
		this.tipocombustible = tipocombustible;
		this.capacidadtotal = capacidadtotal;
		this.cantidadactual = cantidadactual;
		this.consumomedio = consumomedio;
	}


	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", anyo=" + anyo + ", tipocombustible="
				+ tipocombustible + ", capacidadtotal=" + capacidadtotal + ", cantidadactual=" + cantidadactual + "]";
	}
	
	
	double calcularconsumo(double kmrecorridos){
		double consumo = 0.0;
		consumo = (kmrecorridos*consumomedio)/100;
		return consumo;
		
	}
	
	boolean esnecesariorepostar () {
		boolean repostaje = false;
		if (cantidadactual >= (capacidadtotal*0.2)) {
			repostaje = false;
		} else {
			repostaje = true;
		}
		return repostaje;
	}

}
