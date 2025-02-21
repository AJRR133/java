package rendonexamen2;

public class Telefono extends Dispositivo {
	
	private boolean tienetecladofisico;

	public Telefono(String marca, String modelo, double precio, boolean tienetecladofisico) {
		super(marca, modelo, precio);
		this.tienetecladofisico = tienetecladofisico;
	}

	protected boolean isTienetecladofisico() {
		return tienetecladofisico;
	}

	protected void setTienetecladofisico(boolean tienetecladofisico) {
		this.tienetecladofisico = tienetecladofisico;
	}

	
	
}
