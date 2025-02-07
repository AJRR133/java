package simulacro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import boletin8.Ejercicio2;

public class rendonsimulacro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String [] historico = new String[200];
		/*
		 * 1)la primera funcion sera int lanzar dados donde se devolvera un numero 2)la
		 * segunda funcion debera pedir el int valorapuesta y devolvera el num de la
		 * apuesta 3) la tercera funcion pedira el dinero apostar
		 *  4) la 4 funcion calcularemos si gana la apuesta y devolvera un booleano, 
		 *  true si gana y false si pierde
		 *  5) calculamos el importe que gana o pierde
		 */
		simulacro r = new simulacro(); 
		int opcion= r.imprimemenu(input);
		int numdados,numapuesta,dineroapuesta,dineroganancias;
		boolean resultado;
		String historicos;
		 
		while(opcion <3 ) {
        	switch(opcion) {
        	case 1:{
        		numapuesta= r.valorapuesta(input);
        		dineroapuesta = r.importeapostar(input);
        		numdados= r.lanzardados();
        		resultado=r.resultadoapuesta(numdados,numapuesta);
        		dineroganancias= r.calcularimportefinal(dineroapuesta,resultado);
        		historicos=r.historial(numdados,numapuesta,dineroganancias,resultado);
        		opcion= r.imprimemenu(input);
        		break;

        	}
        	case 2:{
        		//r.mostrarhistorial(historico);
        		break;
        	}
        	}
        }
		
	}
		
	int imprimemenu(Scanner input) {
		 

		
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar historial de jugadas");
        System.out.println("3. Retirarse");
        System.out.print("Elija una opción: ");
        int opcion = input.nextInt();
	
      
        return opcion;
	}
		
	
	
	int lanzardados() {
		Random aleatorio = new Random();
		int dado1 = aleatorio.nextInt(6) + 1;
		int dado2 = aleatorio.nextInt(6) + 1;
		int dados = (dado1 + dado2);
		return dados;

	}

	int valorapuesta(Scanner input) {
		System.out.println("Dime el valor al que desea apostar (entre 2 y 12).");
		int valorapostado = input.nextInt();
		if (valorapostado < 2 && valorapostado > 12) {
			System.out.println("El valor es incorrecto, repitalo (entre 2 y 12).");
			int valor = input.nextInt();
			valorapostado = valor;
		}
		return valorapostado;
	}

	int importeapostar(Scanner input) {
		System.out.println("Dime el dinero que desea apostar");
		int importeapostado = input.nextInt();
		return importeapostado;

	}

	boolean resultadoapuesta(int dados, int valorapostado) {
		boolean resultado = false;
		if (dados == valorapostado) {
			resultado = true;
		}
		else{
			resultado = false;
		}
		return resultado;
	}
	
	int calcularimportefinal (int importeapostado, boolean resultado) {
		int importefinal =0;
		if (resultado = true) {
		importefinal = (importeapostado * 2);
		}
		else {
			importefinal = (-importeapostado);
		}
		return importefinal;
	}
	
	String historial(int dados, int valorapostado, int importefinal, boolean resultado) {
		String historico = new String();
		String gop= ""; {
		int jugada = 0;
			if(resultado = false) {
				 gop= " perdido ";}
			
			else {
			gop = " ganado ";}
			jugada = jugada+1;
			historico = "En la jugada "+jugada+" aposto al valor "+valorapostado+" y sumó " + dados + gop + importefinal; 	
	}
		System.out.println(historico);
		return historico;

		
		
			
		}
	void mostrarhistorial (String[] historico) {
		System.out.println(Arrays.toString(historico));
	}
		
		
}


