package Modelosimulacro24_3;

import java.util.Objects;
import java.util.Scanner;

public class Jefedepartamento extends Empleado {
	int antiguedad;

	@Override
	public int actualizarsueldo() {
		System.out.println("Debes decirme un num entero entre 0 y 20");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		sueldo = getSueldo()+(getSueldo()*num/100);
		return sueldo;
	}

	protected int getAntiguedad() {
		return antiguedad;
	}

	protected void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Jefedepartamento(String dni, String nombre, int sueldo, int antiguedad) {
		super(dni, nombre, sueldo);
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Jefedepartamento [antiguedad=" + antiguedad + ", dni=" + dni + ", nombre=" + nombre + ", sueldo="
				+ sueldo + "]";
	}

	
	
	
}
