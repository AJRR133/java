package boletin3ejercicio1;

public class GestionaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculos coche = new Vehiculos("BMW","320",2015,"diesel",56.0,30.5,5.6);
		Vehiculos peugonetadeJC = new Vehiculos("Peugeot","207",2008,"diesel",45.0,5.5,4.6);
		
		
		System.out.println(peugonetadeJC);
		double consumodeljc = peugonetadeJC.calcularconsumo(50);
		System.out.println(consumodeljc);
		boolean jcechalegasofatieso = peugonetadeJC.esnecesariorepostar();
		System.out.println(jcechalegasofatieso);
		
		System.out.println(coche);
		double consumocoche = coche.calcularconsumo(25);
		System.out.println(consumocoche);
		boolean echarcombustible = coche.esnecesariorepostar();
		System.out.println(echarcombustible);
		
	}

}
