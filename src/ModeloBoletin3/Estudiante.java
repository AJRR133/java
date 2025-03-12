package ModeloBoletin3;

class Estudiante extends PersonaRefactoriza implements Iaccione{
	@Override
	public String ejecutaraccion() {
		return "estudia";
	}

	@Override
	public String toString() {
		return "Estudiante " + ejecutaraccion() + "]";
	}


}