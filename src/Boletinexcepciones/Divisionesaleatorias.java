package Boletinexcepciones;

import java.util.Arrays;
import java.util.Random;

public class Divisionesaleatorias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		double [] resultado =  new double[20] ;
		
		for(int i = 0; i < resultado.length; i++) {
		try {	
			double num1 = random.nextDouble(11);
			double num2 = random.nextDouble(11);
			if( num2 ==0) {
				throw new ArithmeticException("No puede dividir por cero");
				
			}
			if(i>=20){
				throw new ArrayIndexOutOfBoundsException("intenta guardad en 20 o mas");

			}
			resultado[i] = num1/num2; 
		}
		catch(ArithmeticException E1) {
			System.out.println("ha salido 0 en el denominador");
		}
		catch(ArrayIndexOutOfBoundsException E2) {
			System.out.println(E2.getMessage());
		}
		finally {
			try {
			System.out.println(Arrays.toString(resultado));
			}
			catch(NullPointerException E3){
				System.out.println("Posicioes vacias");
				
			}
		}
			
			
			
		}
	}

}
