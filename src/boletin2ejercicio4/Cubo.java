 package boletin2ejercicio4;

public class Cubo {

	int lado;
	double litroscontiene;
	double capacidadmaxima;

	
	public Cubo(int lado, double litroscontiene) {
		super();
		this.lado = lado;
		this.litroscontiene = litroscontiene;
		this.capacidadmaxima = calcularvolumen();
	}


	double calculararea(){
		double area = 6*lado*lado;
		return area;
	}	
	
	
	double calcularvolumen() {
		double volumen = lado*lado*lado;
		return volumen;
	}
	
	boolean vaciar( double litroasacar) {
	boolean	esposiblevaciar = true;
		if (litroasacar >= litroscontiene) {
			esposiblevaciar = false;
		} else {
			litroscontiene = litroscontiene-litroasacar;

		}
		return esposiblevaciar;
	}
	
	boolean llenar( double litroameter) {
		boolean	esposiblellenar = true;
			if (litroameter+litroscontiene >= capacidadmaxima ) {
				esposiblellenar = false;
				
			}else {
				litroscontiene = litroscontiene+litroameter;

			}
			return esposiblellenar;
		}


	@Override
	public String toString() {
		return "Cubo [lado=" + lado + ", litroscontiene=" + litroscontiene + ", capacidadmaxima=" + capacidadmaxima
				+ "]";
	}

	
}














