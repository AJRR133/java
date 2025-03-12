package ModeloBoletin3;

import java.util.Arrays;

public class PersonaRefactoriza {
	String nombre;
	Iaccione [] acciones ;
	
	public void identificarse() {
		System.out.println("Soy una persona y me llamo " + nombre);
	}

	public PersonaRefactoriza() {
		super();
		this.acciones = new Iaccione[10];
	}

	public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
		this.acciones = new Iaccione[10];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Iaccione[] getAcciones() {
		return acciones;
	}

	public void setAcciones(Iaccione[] acciones) {
		this.acciones = acciones;
	}

	@Override
	public String toString() {
		return "PersonaRefactoriza [nombre=" + nombre + ", acciones=" + Arrays.toString(acciones) + "]";
	}

	
}
