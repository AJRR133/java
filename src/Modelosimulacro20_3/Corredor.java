package Modelosimulacro20_3;

import java.time.LocalDate;

public class Corredor extends Deportista {

	public Corredor(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super(nombre, pais, edad, peso, altura, pruebas);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getTiempocalentamiento() {
		// TODO Auto-generated method stub
		return 0.5;
	}

	@Override
	double getCaloriasnecesariasdias() {
		// TODO Auto-generated method stub
		return 50*getPeso();
	}

	@Override
	int getHorasentrenamiento(LocalDate F) {
		// TODO Auto-generated method stub
		return 10*24;
	}
	
	
}
