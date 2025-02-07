package orientacionproductos;

public class Producto {
	String nombre;
	int numunidades;
	double precioventa;
	
	boolean pedirstock() {
		boolean pedido =false;
		if( numunidades >1) {
			pedido = false;
		} else {
			pedido = true;
		}
		
		
		return pedido;
	}
	
	int aumentounidades(int aumento) {
		int unidaumentada = numunidades+aumento;
		
		return unidaumentada;
	}
	
	String coviertecadena() {
		String cadena = ("producto 1: "+nombre+" las unidades son " +numunidades+ " y su precio es " +precioventa);
		return cadena;
	}
	
	
}
