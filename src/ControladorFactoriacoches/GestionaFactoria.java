package ControladorFactoriacoches;

import java.util.Arrays;

import ModeloFactoriacoches.*;

public class GestionaFactoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		Robot [] inventarioRobot  = new Robot [20];
		Robot s1 = new Soldador(null, 0, null, 0, null);
		Robot p1 = new Pintor(null, 0, null);
		Robot e1 = new Ensamblador(null, 0, null);
		inventarioRobot[contador] = s1;
		contador = contador+1;
		inventarioRobot[contador] = p1;
		contador = contador+1;
		inventarioRobot[contador] = e1;
		contador = contador+1;
		System.out.println(Arrays.toString(inventarioRobot));
		
		
		int contadorwi = 0;
		Dispositivo [] inventariodispositivo  = new Dispositivo [20];
		Dispositivo ss = new Sensor(1, null, null, null);
		Dispositivo c1 = new Camara(2, null, null, null);
		Dispositivo pp = new Puerta(3, null, null, null);
		inventariodispositivo[contadorwi] = ss;
		contadorwi = contadorwi+1;
		inventariodispositivo[contadorwi] = c1;
		contadorwi = contadorwi+1;
		inventariodispositivo[contadorwi] = pp;
		contadorwi = contadorwi+1;
		System.out.println(Arrays.toString(inventariodispositivo));
	}

}
