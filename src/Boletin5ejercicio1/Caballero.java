package Boletin5ejercicio1;

public class Caballero extends Personaje{

	public Caballero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp, "Espada");
		// TODO Auto-generated constructor stub
	}
	
	/*protected boolean esatacado(Personaje p) {
		boolean atacado = false;
		if (p instanceof Mago) {
			atacado = true;
			} else if (p instanceof Arquero) {
			atacado = true;
			
			}else {
				atacado = false;
			}
		return atacado;
	}*/
	protected boolean esatacado(Personaje p) {
		return p instanceof Mago || p instanceof Arquero;
	}
	protected boolean esatacado(Personaje p, int distancia) {
		return  p instanceof Mago || (p instanceof Arquero && distancia <100);
	}
}
