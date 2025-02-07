package orientacionobjetos;

public class Gestionapokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.nombre = "pikachu";
		pikachu.nivel = 12;
		pikachu.tipo = "Electrico";
		
		Pokemon mew2 = new Pokemon();
		mew2.nombre = "Mewtwo";
		mew2.nivel = 20;
		mew2.tipo = "psiquico";
		
	//llama	a la funcion para imprimir por pantalla toda la info	
		String cadenaPikachu = pikachu.coviertecadena();
		System.out.println(cadenaPikachu);
		
		String cadenamew2 = mew2.coviertecadena();
		System.out.println(cadenamew2);
		//llama a la funcion para que lucen
		boolean gana = pikachu.luchar(mew2);
		System.out.println("pikachu gana a mewtwo "+gana);
		//otra forma de imprimir los pokemos 
		System.out.println("pokemon 1: "+pikachu.nombre+" su nivel es " +pikachu.nivel+ " y su tipo es " + pikachu.tipo);
		pikachu.nivel = pikachu.nivel+2;
		System.out.println("pokemon 1: "+pikachu.nombre+" su nivel es " +pikachu.nivel+ " y su tipo es " + pikachu.tipo);

		
		//llama de nuevo a la funcion para ver si ha subido de nivel
		
		String cadenamew3 = mew2.coviertecadena();
		System.out.println(cadenamew3);

		
	}

}
