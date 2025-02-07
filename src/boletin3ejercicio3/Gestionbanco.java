package boletin3ejercicio3;

import java.time.LocalDate;

public class Gestionbanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Persona titular = new Persona("12345678A", "Jose", "Garcia", LocalDate.of(2004, 10, 12));
	Persona autorizado = new Persona("12345678A", "Jose", "Garcia", LocalDate.of(2004, 10, 12));
	Cuentabancaria cuenta = new Cuentabancaria(0.0, "ES1234", titular);
	
	cuenta.setAutorizado(autorizado);
	//cuenta.setSaldo(15);
	//System.out.println(cuenta.getSaldo());
	
	cuenta.ingresar(autorizado, 100);
	System.out.println(cuenta.getSaldo());
	
	}

}
