package Boletin5ejercicio1;

public class Arquero extends Personaje{

	public Arquero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp, "Flechas");
		// TODO Auto-generated constructor stub
	}

	/*protected boolean esatacado(Personaje p) {
		boolean atacado = false;
		if (p instanceof Mago) {
			atacado = true;
			} else {
				atacado = false;
			}
		return atacado;
	}*/
	
	protected boolean esatacado(Personaje p) {
		return p instanceof Mago ;
	}
	
	protected boolean esatacado(Personaje p, int distancia) {
		return  p instanceof Mago || (p instanceof Caballero && distancia <50);
	}
}
