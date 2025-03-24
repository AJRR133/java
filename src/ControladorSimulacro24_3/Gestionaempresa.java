package ControladorSimulacro24_3;

import Modelosimulacro24_3.*;
public class Gestionaempresa {
	public static void main(String[] args) {
	EmpleadoBase e1 = new EmpleadoBase(null, null,1, Tipoempleado.ADMINISTRATIVO);
	EmpleadoBase e2 = new EmpleadoBase(null, null,1, Tipoempleado.CONTABLE);
	Jefedepartamento j1 = new Jefedepartamento(null, null, 1300, 0);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(j1);

	System.out.println(e1.actualizarsueldo());
	System.out.println(e2.actualizarsueldo());
	System.out.println(j1.actualizarsueldo());

	Departamento d1 = new Departamento(null, null, null);
	System.out.println(d1.addempleado(e1));
	System.out.println(d1.addempleado(e1));
}
}