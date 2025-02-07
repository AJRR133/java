package boletin2ejercicio3;

public class Notaasignatura {

	String nombre;
	int nota1;
	int nota2;
	int nota3;
	
	
	

	public Notaasignatura(String nombre, int nota1, int nota2, int nota3) {
		super();
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public int notamedia() {
		int media = ((nota1+nota2+nota3)/3);
		return media;
	}
	
	int numtrimaprobado() {
		int numtri = 0;
		if (nota1 >= 5) {
			numtri =1;
		} else if (nota1 >= 5 && nota2 >=5) {
			numtri =2;
		} else if (nota1 >= 5 && nota2 >=5 && nota3 >=5) {
			numtri =3;
		} else {
			numtri = 0;
		}
		
		return numtri;
	}

	@Override
	public String toString() {
		return "Notaasignatura [nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + "]";
	}
	
	
}
