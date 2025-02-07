package boletin2ejercicio2;

public class Gato {

	String color;
	String raza;
	String sexo;
	int edad;
	double peso;
	
	public Gato(String color, String sexo, int edad, double peso) {
		super();
		this.color = color;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}
	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}


	void maulla() {
		System.out.println("miauuuu");
	}

	void ronronea() {
		System.out.println("rtrrrrrrr");
	}

	void comida(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Yummy Yummy");
		} else {
			System.out.println("buah mejor no");
		}
	}

	void luchar(Gato g2) {
		if (sexo.equals(g2.sexo)) {
			System.out.println("ven aquí que te vas a enterar");
		} else {
			System.out.println("la violencia nunca es la solución");
		}
	}
	
	String pasacadena() {
		String cadena = ("gato1 1: su color es "+color+" su raza es " +raza+ " su sexo es " +sexo+ " su edad es " +edad+ " y su edad es " +peso);
		return cadena;
	}
	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
}
