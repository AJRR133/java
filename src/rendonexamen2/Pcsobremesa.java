package rendonexamen2;

public class Pcsobremesa extends Computadora {

	private boolean tienegpudedicada;

	public Pcsobremesa(String marca, String modelo, double precio, int capadidadram, boolean tienegpudedicada) {
		super(marca, modelo, precio, capadidadram);
		this.tienegpudedicada = tienegpudedicada;
	}

	protected boolean isTienegpudedicada() {
		return tienegpudedicada;
	}

	protected void setTienegpudedicada(boolean tienegpudedicada) {
		this.tienegpudedicada = tienegpudedicada;
	}
	
	
}
