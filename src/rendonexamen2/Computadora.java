package rendonexamen2;

public class Computadora extends Dispositivo{
	private int capadidadram;

	public Computadora(String marca, String modelo, double precio, int capadidadram) {
		super(marca, modelo, precio);
		this.capadidadram = capadidadram;
	}

	protected int getCapadidadram() {
		return capadidadram;
	}

	protected void setCapadidadram(int capadidadram) {
		this.capadidadram = capadidadram;
	}
	

}
