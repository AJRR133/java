package ModeloBoletin3;

public class Gestionapersonarefactoriza {

	public static void main(String[] args) {
	PersonaRefactoriza carlos = new PersonaRefactoriza("Carlos");
	Iaccione [] acciones  = carlos.getAcciones();
	acciones [0] = new Estudiante();
	System.out.println(carlos);
	acciones [1] = new Empleado();
	System.out.println(carlos);
	acciones [2] = new Cliente();
	System.out.println(carlos);
	}
}
