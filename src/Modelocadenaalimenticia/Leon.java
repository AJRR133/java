package Modelocadenaalimenticia;

public class Leon extends Animal {

	public Leon(String nombreespecie, Familia tipofamilia, String habitat, Animal[] animalescome,
			Animal[] animalesescomido) {
		super(nombreespecie, tipofamilia, habitat, animalescome, animalesescomido);
		// TODO Auto-generated constructor stub
	}
	
	
	public Leon() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean atacar(Animal a) {
		return true;
	}

	@Override
	public boolean huir(Animal a) {
		return false;
	}

}
