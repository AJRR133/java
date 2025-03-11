package Modelocadenaalimenticia;

import java.util.Arrays;

public abstract class Animal {

	private String nombreespecie;
	private Familia tipofamilia;
	private String habitat;
	private Animal [] animalescome;
	private Animal [] animalesescomido;
	
	public abstract boolean atacar(Animal a);
	public abstract boolean huir(Animal a);
	public String getNombreespecie() {
		return nombreespecie;
	}
	public void setNombreespecie(String nombreespecie) {
		this.nombreespecie = nombreespecie;
	}
	public Familia getTipofamilia() {
		return tipofamilia;
	}
	public void setTipofamilia(Familia tipofamilia) {
		this.tipofamilia = tipofamilia;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public Animal[] getAnimalescome() {
		return animalescome;
	}
	public void setAnimalescome(Animal[] animalescome) {
		this.animalescome = animalescome;
	}
	public Animal[] getAnimalesescomido() {
		return animalesescomido;
	}
	public void setAnimalesescomido(Animal[] animalesescomido) {
		this.animalesescomido = animalesescomido;
	}
	@Override
	public String toString() {
		return "Animal [nombreespecie=" + nombreespecie + ", tipofamilia=" + tipofamilia + ", habitat=" + habitat
				+ ", animalescome=" + Arrays.toString(animalescome) + ", animalesescomido="
				+ Arrays.toString(animalesescomido) + "]";
	}
	public Animal(String nombreespecie, Familia tipofamilia, String habitat, Animal[] animalescome,
			Animal[] animalesescomido) {
		super();
		this.nombreespecie = nombreespecie;
		this.tipofamilia = tipofamilia;
		this.habitat = habitat;
		this.animalescome = animalescome;
		this.animalesescomido = animalesescomido;
	}
	public Animal() {
		super();
		this.setAnimalescome(new Animal [10]);
		this.setAnimalesescomido(new Animal [10]);
		// TODO Auto-generated constructor stub
	}

	
}
