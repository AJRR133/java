  package boletin_tablasç;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[]diassemanas = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		//por valor
		for (String dia : diassemanas)
		{
			System.out.println(dia);
		}
		//por posicion
		for(int pos = 0;pos <diassemanas.length;pos++)
		{
			if (pos<5) {
				System.out.println("laborable"+diassemanas[pos]);
			} else {
				System.out.println("festivo"+diassemanas[pos]);
			}
		}
		int pos = 0;
		while ( pos < diassemanas.length ) {
		
			if (pos<5) {
				System.out.println("laborable"+diassemanas[pos]);
			} else {
				System.out.println("festivo"+diassemanas[pos]);
			}
			pos = pos+ 1;
		}
		
		pos=0;
		while(!diassemanas[pos].equals("miercoles")) {
			System.out.println(diassemanas[pos]);
			pos++;
		}
	}
}


