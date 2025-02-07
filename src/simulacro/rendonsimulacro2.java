package simulacro;

import java.util.Scanner;

public class rendonsimulacro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1º funcion, pedir num a redondear, return double
		 * 2º calcular numdecimale, return int
		 * 3º ca num, return numredondeado
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el num a redondear");
		String num = input.nextLine();
		rendonsimulacro2 r = new rendonsimulacro2();
		String resultado = r.redondear(num);
	}

	String pedirnum(Scanner input) {
		System.out.println("Dime el num a redondear");
		String num = input.nextLine();
			return num;
	}
	
	
	String redondear (String num) {
		int numerodecimales =  calcularnumdecimales(num);
		String resultado =num;
		if (numerodecimales >= 3) {
			 resultado = redondeo3omasdecimales(num);
			 System.out.println(resultado);
		}
		else if (numerodecimales < 2) {
			resultado=redondecon2omenosdecimales(num);
			System.out.println(resultado);
		}
		return resultado;
	}
	
	
	
	/*int calcularnumdecimales(String num) {
		String [] partes =num.split("/,");
		return partes [1].length();
		}*/
	
	 int calcularnumdecimales (String num) {
	        String [] partes = num.split(",");
	        int numDecimales;
	        if (partes.length == 2) {
	            numDecimales = partes[1].length();
	        }else {
	            numDecimales = 0;
	        }
	        return numDecimales;
	    }
	
	
	 String redondeo3omasdecimales(String num) {
	        String resultado = num;
	        int numDecimales = calcularnumdecimales(resultado);
	        
	        while (numDecimales > 2) {
	            int Despuespunto = resultado.indexOf(",");
	            resultado = resultado.substring(0, Despuespunto + 3); 
	            numDecimales = calcularnumdecimales(resultado);
	        }

	        return resultado;
	    }
	 
	String redondecon2omenosdecimales (String num) {
		String resultado = num;
		int numdecimales= calcularnumdecimales(resultado);
		while( numdecimales<2) {
			if(numdecimales == 0) {
				resultado=resultado+",0";
}
		else{
			resultado=resultado+"0";}

	}
		return resultado;
	
}
}
