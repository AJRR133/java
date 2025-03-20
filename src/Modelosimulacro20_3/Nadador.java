package Modelosimulacro20_3;

import java.time.LocalDate;

public class Nadador extends Deportista{

	public Nadador(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super(nombre, pais, edad, peso, altura, pruebas);
	}

	@Override
	double getTiempocalentamiento() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	double getCaloriasnecesariasdias() {
		// TODO Auto-generated method stub
		return 100*getPeso();
	}

	@Override
	int getHorasentrenamiento(LocalDate F) {
		// TODO Auto-generated method stub
		return 2*24;
	}

	
	

	
	
}
