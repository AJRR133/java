package entorno;

import java.util.Scanner;

public class Ordeninverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	      Ordeninverso r = new Ordeninverso();
	        int[] numeros = r.guardarnum(input);
	      r.invertir(numeros);
	    
	    
	}
	
	int [] guardarnum(Scanner input) {
		int[] listanumvacia= new int[10];

      System.out.println("Introduce 10 números:");
      for (int i = 0; i < 10; i++) {
    	  listanumvacia[i] = input.nextInt();
      }
      return listanumvacia;
      }
      
      int [] invertir ( int[] listanum) {
    	  System.out.println("Los números en orden inverso son:");
          for (int i = 9; i >= 0; i--) {
              System.out.println(listanum[i]);
          }
          return listanum; 
      }
}
