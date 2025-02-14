package boletin4ejercicio1;

import boletin4ejercicio1.Automovil.Calieco;

public class GestionaVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculos coche1 = new Automovil("Antonio", 5, 4,Calieco.CERO);
		Vehiculos camion1 = new Camion("Juan", 2, 10, 25000, 3, 5);
		Vehiculos cocheelec = new CocheElectrico ("Antonio", 5, 4,"LFP");
		System.out.println(coche1);
		System.out.println(cocheelec);
		boolean esvehiculo = coche1 instanceof Vehiculos;
		System.out.println("Es vehiculo?"+esvehiculo);
		
		boolean escoche = coche1 instanceof Automovil;
		System.out.println("Es automovil?"+escoche);
		
		boolean escamion = coche1 instanceof Camion;

		// System.out.println(camion1.toString());
		// System.out.println(coche1.toString());
	}

}
