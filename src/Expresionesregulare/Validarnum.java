package Expresionesregulare;

public class Validarnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "12345678A";
		String caracter = "abc";
		
		//validadni
		System.out.println(num.matches("\\d{8}[a-zA-Z]{1}"));
		System.out.println(num.matches("[0-9]*"));

		System.out.println(caracter.matches("[a-zA-Z]{1}"));

		
	}

}
