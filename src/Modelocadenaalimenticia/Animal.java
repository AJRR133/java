package Modelocadenaalimenticia;

import java.util.Arrays;

public abstract class Animal {

	private String nombreespecie;
	private Familia tipofamilia;
	private String habitat;
	private String [] animalescome;
	private String [] animalesescomido;
	
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
	public String[] getAnimalescome() {
		return animalescome;
	}
	public void setAnimalescome(String[] animalescome) {
		this.animalescome = animalescome;
	}
	public String[] getAnimalesescomido() {
		return animalesescomido;
	}
	public void setAnimalesescomido(String[] animalesescomido) {
		this.animalesescomido = animalesescomido;
	}
	@Override
	public String toString() {
		return "Animal [nombreespecie=" + nombreespecie + ", tipofamilia=" + tipofamilia + ", habitat=" + habitat
				+ ", animalescome=" + Arrays.toString(animalescome) + ", animalesescomido="
				+ Arrays.toString(animalesescomido) + "]";
	}
	public Animal(String nombreespecie, Familia tipofamilia, String habitat, String[] animalescome,
			String[] animalesescomido) {
		super();
		this.nombreespecie = nombreespecie;
		this.tipofamilia = tipofamilia;
		this.habitat = habitat;
		this.animalescome = animalescome;
		this.animalesescomido = animalesescomido;
	}

	
}
