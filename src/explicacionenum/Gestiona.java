package explicacionenum;

public class Gestiona {

	public static void main(String[] args) {

		Diadelasemana dia = Diadelasemana.LUNES;
		System.out.println(dia);
		
		Diadelasemana diadereserva = Diadelasemana.LUNES;
		
		//para recorrer todos los valores dentro del enum
		for(Diadelasemana dia2 : Diadelasemana.values()) {
			if(dia2 == Diadelasemana.MARTES) {
				System.out.println("Hoy es martes");
			}
			
		}
		
	}

}
