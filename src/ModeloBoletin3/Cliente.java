package ModeloBoletin3;

class Cliente extends PersonaRefactoriza implements Iaccione{

	@Override
	public String ejecutaraccion() {
		return "compra";
	}

	@Override
	public String toString() {
		return "Cliente [ " + ejecutaraccion() + "]";
	}
	
	
}
