package EXAMEN;

import java.util.Random;
import java.util.Scanner;

public class rendonejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 int imprimemenu return respuestausuario
		 * 2)String [] capturarpokemon return pokemoncapturado
		 * 		3) String nombrepokemon return nombre
		 * 		4) int nivelinicial	return nivel
		 * 	5) String[]realizarbatalla return batalla
		 * 		6)int posicionpokemon return posicion
		 * 		7) int posicionrival return rival
		 * 		8) String resultadobatalla return resultado
		 * 9) String [] mostarpokedex return historial
		 * 10) String [] finalizar return fin
		 * 
		 */
		Scanner input = new Scanner(System.in);
		rendonejercicio1 r = new rendonejercicio1();
		String nom = r.nombrepokemon(input);
		int niv = r.nivelinicial(input);
		String [] capturar =r.capturarpokemon(nom, niv);
		int respuesta = r.imprimemenu(input);
		
		
		while(respuesta== 4) {
			
			switch(respuesta) {
			
			case 1:
				break;
			case 2: 
				break;
			case 3:
				break;
	
			}
		if( respuesta == 4) {
			String fin = r.finalizar;
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	int imprimemenu(Scanner input){
        System.out.println("1 - Capturar pokemon");
        System.out.println("2 - Realizar batalla");
        System.out.println("3 - mostrar pokedex");
        System.out.println("4 - finalizar");
  
        int respuestausuario = input.nextInt();
        return respuestausuario;
          
    }    
	
	String capturarpokemon(String nombre,int nivel) {
		int contadorpokemon = 0;
		int maximopokemon = 15;
		contadorpokemon = contadorpokemon+1;
		String  pokemoncapturado = {};
		for (int i = 0; i < maximopokemon; i++) {		
			
		pokemoncapturado= nombre+nivel;
		}
		return pokemoncapturado;
	}
	
	
	
	String nombrepokemon(Scanner input) {
		System.out.println("Dime el nombre del pokemon");
        String nombre = input.next();
		return nombre;
	}
	
	int nivelinicial(Scanner input) {
		System.out.println("¿Cual es el nivel del pokemon?");
        int nivel = input.nextInt();
        return nivel;
	}
	
	int posicionpokemon(Scanner input) {
		System.out.println("dime la posicion del pokemon que deseas usar");
        int posicion = input.nextInt();
        return posicion;
      }
	
	 int posicionrival(int posicion) {
		 Random aleatorio = new Random();
		 int numaleatorio = aleatorio.nextInt(18) + 1 ;
		 int rival = numaleatorio;
		 while(numaleatorio == posicion) {
			 numaleatorio = aleatorio.nextInt(18) + 1 ;
			  rival = numaleatorio;
		 }
		 return rival;
	 }
	 
	 String resultadobatalla (int posicion, int rival, String [] pokemoncapturado) {
		 String resultado = "";
		 if(posicion>rival) {
			 resultado= "has ganado"
					 ;
		 }
		 else if(posicion<rival) {
			 resultado = " has perdido";
		 }
		 else {
			 resultado =  "empate";
		 }
		 return resultado;

	 }
	 
	 String [] mostarpokedex(String pokemoncapturado) {
		 String [] historial = {};
		 for (int i = 0; i < 15; i++) {		
			historial[i]= (historial+pokemoncapturado);
	 }
		 return historial;
	 	}
	 
	 String [] finalizar( String pokemoncapturado) {
		 
		 
		 
		 return fin;
	 }
	 
}