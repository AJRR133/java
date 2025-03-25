package Controladorexamen25_3;
import Modeloexamen25_3.*;

public class Gestionarutas {
	public static void main(String[] args) {
	Ciudad c1 = new Ciudad("Sevilla", 700000);
	Ciudad c2 = new Ciudad("cadiz", 200000);
	Ciudad c3 = new Ciudad("cordoba", 300000);
	Ciudad c4 = new Ciudad("Malaga", 400000);
	Ciudad c5 = new Ciudad("Almeria", 250000);
	Ciudad c6 = new Ciudad("Granada", 150000);
	RutaBase r1 = new Rutaterrestre(1, c1, c2, 150, false);
	RutaBase r2 = new RutaAerea(2, c1, c4, 200, TipoVuelo.LOW_COST);
	RutaBase r3 = new RutaAerea(3, c2, c4, 300, TipoVuelo.NORMAL);
	RutaBase r4 = new RutaAerea(4, c5, c1, 150, TipoVuelo.EXPRESS);
	
	System.out.println(r1.getcoste());
	System.out.println(r2.getcoste());
	System.out.println(r3.getcoste());
	System.out.println(r4.getcoste());
	System.out.println(r1.gettiporuta());
	System.out.println(r2.gettiporuta());
	System.out.println(r3.gettiporuta());
	System.out.println(r4.gettiporuta());
	
	RutaBase [] rutas = new RutaBase[50];
	rutas[0] = r1;
	rutas[1] = r2;
	rutas[2] = r3;
	rutas[3] = r4;
	
	for(int i =0; i < rutas.length; i++) {
		if(rutas!= null) {
			System.out.println(rutas[i]);
		}
	}
}
	boolean Estanconectadas(RutaBase r, Ciudad origen, Ciudad destino) {
		boolean com =false;
		if(r.getCiudadorigen().equals(origen)&&r.getCiudadorigen().equals(destino)) {
			com =true;
		}
		return com;
	}
	

}