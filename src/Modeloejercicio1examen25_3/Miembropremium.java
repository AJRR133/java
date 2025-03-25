package Modeloejercicio1examen25_3;

import java.util.Arrays;

public class Miembropremium extends MiembroBase {

	int maximoamigos;
	Tipopremium tipo;
	
	
	
	
	public Tipopremium getTipo() {
		return tipo;
	}

	public void setTipo(Tipopremium tipo) {
		this.tipo = tipo;
	}

	public int getMaximoamigos() {
		return maximoamigos;
	}

	public void setMaximoamigos(int maximoamigos) {
		this.maximoamigos = maximoamigos;
	}

	

	public Miembropremium(String email, String nombre, int contadorAmigos, MiembroBase[] amigos,Tipopremium tipo) {
		super(email, nombre, contadorAmigos, amigos);
		this.amigos = new MiembroBase[3];
		this.maximoamigos = 50;
		this.tipo = tipo;
	}

	

	

	@Override
	public String toString() {
		return "Miembrospremium [gettipousuario()=" + gettipousuario() + ", toString()=" + super.toString() + "]";
	}

	@Override
	String gettipousuario() {
		String tipovip = null;
		if(getTipo().equals(Tipopremium.PREMIUM)) {
			tipovip = "Premium"+Tipopremium.PREMIUM;
		} else if(getTipo().equals(Tipopremium.PREMIUM_VIP)) {
			tipovip = "Premium"+Tipopremium.PREMIUM_VIP;
			}
		return tipovip;
	}

	
	
	
}
