package boletin4ejercicio1;

public class GestionaVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculos coche1 = new Automovil("Antonio", 5, 4, "A");
		Vehiculos camion1 = new Camion("Juan", 2, 10, 25000, 3, 5);

		boolean esvehiculo = coche1 instanceof Vehiculos;
		System.out.println("Es vehiculo?"+esvehiculo);
		
		boolean escoche = coche1 instanceof Automovil;
		System.out.println("Es automovil?"+escoche);
		
		boolean escamion = coche1 instanceof Camion;

		// System.out.println(camion1.toString());
		// System.out.println(coche1.toString());
	}

}
