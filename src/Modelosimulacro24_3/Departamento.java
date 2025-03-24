package Modelosimulacro24_3;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
	String nombre;
	Empleado [] empleadosdepartamento;
	Jefedepartamento [] jefe;
	
	public Departamento(String nombre, Empleado[] empleadosdepartamento, Jefedepartamento[] jefe) {
		super();
		this.nombre = nombre;
		this.empleadosdepartamento = new Empleado[100];
		this.jefe = new Jefedepartamento[1];
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado[] getEmpleadosdepartamento() {
		return empleadosdepartamento;
	}

	protected void setEmpleadosdepartamento(Empleado[] empleadosdepartamento) {
		this.empleadosdepartamento = empleadosdepartamento;
	}

	protected Jefedepartamento[] getJefe() {
		return jefe;
	}

	protected void setJefe(Jefedepartamento[] jefe) {
		this.jefe = jefe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(empleadosdepartamento);
		result = prime * result + Arrays.hashCode(jefe);
		result = prime * result + Objects.hash(nombre);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Arrays.equals(empleadosdepartamento, other.empleadosdepartamento) && Arrays.equals(jefe, other.jefe)
				&& Objects.equals(nombre, other.nombre);
	}
	
	public boolean addempleado(Empleado e) {
		boolean posibleañadir = false;
		
		for(int i = 0; i<empleadosdepartamento.length;i++) {
			if(e!=(empleadosdepartamento[i])&& posibleañadir == false) {
				empleadosdepartamento[i] = e;
				posibleañadir = true;
				
			} else{
				posibleañadir = false;
			}
			}
			return posibleañadir;
		}
	}

