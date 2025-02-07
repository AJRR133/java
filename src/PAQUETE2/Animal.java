package PAQUETE2;

 public class Animal {
	
	String tipo;
	public String nombre;
	private int edad;
	
	public boolean caminar() {
	return true;	
	}
	
	private void comer() {
		System.out.println("esta comiendo");
	}
	
	public void dardecomer() {
		if (tipo.equals("perro")) {
		comer();
		}
		else {
			System.out.println(" Que me quedo sin comeeee");
		}
}
	
	boolean sonmismotipo (Animal a1) {
		boolean son = false;
			son = tipo.equals(a1.tipo);		
		return son;
	}
	

 }
