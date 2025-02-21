package Rendonexamene1;

import java.time.LocalDate;

public class GestionaCatering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu menu1 = new Menu(1,"Veggies",900.0,9.0,5.0,Tipodieta.VEGANO,LocalDate.now(),"Si",2);
		Menu menu2 = new Menu(1,"Veggies",1100.0,15.0,5.0,Tipodieta.SIN_GLUTEN,LocalDate.now(),"Si",2);
		Menu menu3 = new Menu(1,"Veggies",1000.0,9.0,5.0,Tipodieta.VEGETARIANO,LocalDate.now(),"Si",2);

		System.out.println(menu1.toString());
		System.out.println(menu1.contienecarne());
		System.out.println(menu1.getConsumocalorias());
		System.out.println(menu2.toString());
		System.out.println(menu2.contienecarne());
		System.out.println(menu2.getConsumocalorias());	
		System.out.println(menu3.toString());
		System.out.println(menu3.contienecarne());
		System.out.println(menu3.getConsumocalorias());	
	
	}

}
