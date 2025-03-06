package Modelocadenaalimenticia;

public class Serpiente extends Animal {

	public Serpiente(String nombreespecie, Familia tipofamilia, String habitat, String[] animalescome,
			String[] animalesescomido) {
		super(nombreespecie, tipofamilia, habitat, animalescome, animalesescomido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean atacar(Animal a) {
		boolean ataca =  true;
		if (a.getTipofamilia().equals(Familia.roedor)) {
			ataca = true;
		} else {
			ataca = false;
		}
		return ataca;
	}

	@Override
	public boolean huir(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

}
