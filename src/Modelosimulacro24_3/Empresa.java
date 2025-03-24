package Modelosimulacro24_3;

public class Empresa {

	Empleado [] empleados;
	Departamento [] departamentos;
	
	
	protected Departamento[] getDepartamentos() {
		return departamentos;
	}

	protected void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}

	protected Empleado[] getEmpleados() {
		return empleados;
	}

	protected void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}

	public Empresa(Empleado[] empleados, Departamento[] departamentos) {
		super();
		this.empleados = new Empleado[100];
		this.departamentos = departamentos;
	}

	
	
	
	
}
