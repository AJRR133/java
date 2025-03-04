package controladorFiguras;
import modeloFiguras.*;
public class GestionaFiguras {
	public static void main(String[] args) {
		
	Circunferencia c1 = new Circunferencia("rojo",2.5);
	Triangulo t1 = new Triangulo("verde",5.0,2.0);
	
	System.out.println(c1.calcularArea());
	System.out.println(t1.calcularArea());
	}
}
