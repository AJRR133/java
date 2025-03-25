package Modeloejercicio1examen25_3;

import java.util.Arrays;

public class Miembroestandar extends MiembroBase {

	int maximoamigos;

	@Override
	String gettipousuario() {
		String tipousuario;
		return tipousuario="Estandar";
	}

	public Miembroestandar(String email, String nombre, int contadorAmigos, MiembroBase[] amigos) {
		super(email, nombre, contadorAmigos, amigos);
		this.amigos = new MiembroBase[2];
		this.maximoamigos =50;
	}

	@Override
	public String toString() {
		return "Miembroestandar [gettipousuario()=" + gettipousuario() + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
}
