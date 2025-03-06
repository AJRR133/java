package Modelocadenaalimenticia;

public class Roedor extends Animal {

	public Roedor(String nombreespecie, Familia tipofamilia, String habitat, String[] animalescome,
			String[] animalesescomido) {
		super(nombreespecie, tipofamilia, habitat, animalescome, animalesescomido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacar(Animal a) {
		return false;
	}

	@Override
	public boolean huir(Animal a) {
		boolean huir = true;
		if(a.getAnimalesescomido().equals(Familia.serpiente)) {
			huir = true;
		} else {
			huir = false;
		}
	return huir;
	}

}
