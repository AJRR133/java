package Boletin5ejercicio1;

public class Personaje {

	private String nombre;
	private int nivel;
	private int hp;
	private String arma;
	
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getNivel() {
		return nivel;
	}
	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}
	protected int getHp() {
		return hp;
	}
	protected void setHp(int hp) {
		this.hp = hp;
	}
	protected String getArma() {
		return arma;
	}
	protected void setArma(String arma) {
		this.arma = arma;
	}
	public Personaje(String nombre, int nivel, int hp, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.hp = hp;
		this.arma = arma;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", hp=" + hp + ", arma=" + arma + "]";
	}
	
	

}
