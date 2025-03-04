package modeloFiguras;

public class Triangulo extends Figura {
	
	public Triangulo(String color,double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;
		// TODO Auto-generated constructor stub
	}

	private double base;
	private double altura;

	   public double calcularArea()
	   {
	       return (base*altura)/2;
	   }

}

