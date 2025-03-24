package Modelosimulacro24_3;

public class EmpleadoBase extends Empleado {

	Tipoempleado tipo;

	protected Tipoempleado getTipo() {
		return tipo;
	}

	protected void setTipo(Tipoempleado tipo) {
		this.tipo = tipo;
	}

	public EmpleadoBase(String dni, String nombre, int sueldo, Tipoempleado tipo) {
		super(dni, nombre, sueldo);
		this.tipo = tipo;
	}

	public int sueldoinicial() {
		int sueldo = 0;
		if(tipo.equals(Tipoempleado.ADMINISTRATIVO)) {
			sueldo = 1150;;
		} else if (tipo.equals(Tipoempleado.CONTABLE)) {
			sueldo = 1350;
		} else if (tipo.equals(Tipoempleado.OPERARIO)) {
			sueldo = 1100;
		}
		return sueldo;
	}

	@Override
	public int actualizarsueldo() {
			sueldo = sueldoinicial()+(sueldoinicial()*25/100);
		return sueldo ;
	}

	@Override
	public String toString() {
		return "EmpleadoBase [tipo=" + tipo + ", dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	
	
}
