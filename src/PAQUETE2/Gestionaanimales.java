package PAQUETE2;

public class Gestionaanimales {

	public static void main(String[] args) {
		Animal perro = new Animal();
		//perro.edad; no visible por ser private
		perro.nombre= "lulu"; //funciona
		perro.tipo = "perro";
		Animal gato = new Animal();
		//gato.edad; no visible por ser private
		gato.nombre= "aa"; //funciona
		gato.tipo = "gato";
		
		
		boolean anda = perro.caminar();
		System.out.println(anda);
		perro.dardecomer();
		boolean mismotipo = perro.sonmismotipo(gato);
		System.out.println(mismotipo);
	}

}
