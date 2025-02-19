package Simulacroclase19_2;

import java.time.LocalDate;

public class GestionaIncidentesequipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario juan = new Usuario("Juan","12345678a","A");
		Usuario manolo = new Usuario("manolo","12345678a","A");
		Usuario alberto = new Usuario("alberto","12345678a","A");
		Usuario paquito = new Usuario("Juan","12345678a","A");
	
		Equipo equipo1 = new Equipo("PCjuan","3C:D9:2B:88:99:AA : 2","Linux",0,juan);
		Equipo equipo2 = new Equipo("PCManolo","3C:D9:2B:88:99:bb : 2","Linux",2,manolo);
		Equipo equipo3 = new Equipo("PCalberto","3C:D9:2B:88:99:cc : 2","Linux",1,alberto);
		Equipo equipo4 = new Equipo("PCpaquito","3C:D9:2B:88:99:dd : 2","Linux",1,paquito);

		Incidencia in1 = new Incidencia(123,"fallo1","brevedesc",LocalDate.of(2024, 2, 15),LocalDate.of(2025, 2, 15),Estado.CERRADA,Criticidad.MEDIA,equipo2);
		Incidencia in2 = new Incidencia(123,"fallo1","brevedesc",LocalDate.of(2024, 2, 15),LocalDate.of(2025, 2, 15),Estado.CERRADA,Criticidad.URGENTE,equipo2);
		Incidencia in3 = new Incidencia(123,"fallo1","brevedesc",LocalDate.of(2024, 2, 15),LocalDate.of(2025, 2, 15),Estado.CERRADA,Criticidad.MEDIA,equipo3);
		Incidencia in4 = new Incidencia(123,"fallo1","brevedesc",LocalDate.of(2024, 2, 15),LocalDate.of(2025, 2, 15),Estado.CERRADA,Criticidad.MEDIA,equipo4);
		Incidencia in5 = new Incidencia(123,"fallo1","brevedesc",LocalDate.of(2024, 2, 15),LocalDate.of(2025, 2, 15),Estado.CERRADA,Criticidad.MEDIA,equipo1);
		Incidencia in6 = new Incidencia(123,"fallo1","brevedesc",LocalDate.of(2024, 2, 15),LocalDate.of(2025, 2, 15),Estado.CERRADA,Criticidad.MEDIA,equipo1);

		Incidencia [] listaincidencia = {in1,in2,in3,in4,in5,in6};
	}
	
	//public void imprimeurgente(Incidencia in) {
	//	if(in.getCriticidad()= Criticidad.)
	//}
}
