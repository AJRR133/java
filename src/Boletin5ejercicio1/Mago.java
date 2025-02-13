package Boletin5ejercicio1;

public class Mago extends Personaje {

	public Mago(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp,"Hechizo");
		// TODO Auto-generated constructor stub
	}
	
	protected boolean esatacado(Personaje p) {
		return false;
	}
	
	protected boolean esatacado(Personaje p, int distancia) {
		return false;
	}
	
	
	
}
