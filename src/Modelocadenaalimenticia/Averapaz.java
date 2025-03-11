package Modelocadenaalimenticia;

public class Averapaz extends Animal {

	public Averapaz(String nombreespecie, Familia tipofamilia, String habitat, Animal[] animalescome,
			Animal[] animalesescomido) {
		super(nombreespecie, tipofamilia, habitat, animalescome, animalesescomido);
		// TODO Auto-generated constructor stub
	}


	public Averapaz() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean atacar(Animal a) {
		boolean ataca =  true;
		if (a.getTipofamilia().equals(Familia.roedor)||a.getTipofamilia().equals(Familia.serpiente)) {
			ataca = true;
		} else {
			ataca = false;
		}
		return ataca;
	}

	@Override
	public boolean huir(Animal a) {
		boolean huir = false;
		if (a.getTipofamilia().equals(Familia.león)) {
			huir = true;
	} else {
		huir = false;
	}
		return huir;
	}

}
