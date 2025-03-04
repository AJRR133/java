package modeloFiguras;

public class Circunferencia extends Figura
{	 
	private double radio;
	public Circunferencia(String color,double radio) {
		super(color);
		this.radio = radio;
		// TODO Auto-generated constructor stub
	}

	

	   public double calcularArea()
	   {
	       return radio*(3.14*2);
	   }

}
