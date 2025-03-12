package ModeloBoletin3;

class Empleado extends PersonaRefactoriza implements Iaccione{

	@Override
	public String ejecutaraccion() {
		return "trabaja";
	}

	@Override
	public String toString() {
		return "Empleado" + ejecutaraccion() + "]";
	}
	
	
}
