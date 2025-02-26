package Correoelectronicocontro;

import Correoelectronicomodelo.Correo;

public class Gestionacorreo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sigo = true;
		while(sigo) {
			//pido correo
			int contadorcorreosvalidos = 0;
			Correo [] correos = new Correo[5];
			if(Correo.validacorreo(correo)) 
			{
				Correo c = new Correo();
				correos[contadorcorreosvalidos] = c;
				contadorcorreosvalidos = contadorcorreosvalidos +1;
				
			}
			sigo = (contadorcorreosvalidos != 5);
		}
	}

}
