package cadenas;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena1="Hola";
		String cadena2 = cadena1+" y adiós";
		String cadena3 = cadena1.concat(", buenos días");
		System.out.printf("cadena1: %s %n", cadena1);
		System.out.println("cadena1: " + cadena1);
		System.out.printf("cadena2: %s %n", cadena2);
		System.out.printf("cadena3: %s %n", cadena3);
		
		
		
		String cadena = "Hello planet earth, a great planet.";
		System.out.println(cadena.indexOf("planet"));
		System.out.println(cadena.lastIndexOf("planet"));
		System.out.println(cadena.indexOf("e", 5));
		System.out.println(cadena.lastIndexOf("e",5));

		
		
		String cadena11 = "Hello planet earth, a great planet.";
		String cadena22 = cadena11.replace("et", "ET");
		String cadena33 = cadena11.replaceAll ("et", "ET");
		System.out.println(cadena11);
		System.out.println(cadena22);
		System.out.println(cadena33);

	}

}
