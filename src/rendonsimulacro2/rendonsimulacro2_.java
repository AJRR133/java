package rendonsimulacro2;

import java.util.Scanner;

public class rendonsimulacro2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1) imprimemenu
		 * 2) registrar libros,
		 * 		3) numlibros
		 * 		4) sexoautor
		 * 		5) titulolibro
		 * 		6) preciounitario
		 * 		7)Unidadesvendidas
		 * 8) porcentajelibrossexo
		 * 9)libromasbarato
		 * 10)libromascaro
		 * 11)libromasvendido
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		rendonsimulacro2_ r = new rendonsimulacro2_ (); 
		  
	        String respuestaUsuario = "";
	        String nombreAutor = "";
	        char Sexo;
	        String tituloLibro = "";
	        double PrecioLibro = 0;
	        int unidadesVendidas = 0;

	        while (!respuestaUsuario.equals("S"))

	        {
	            

	            switch (respuestaUsuario) {

	            case "R":
	                System.out.println("Se va a registrar un libro: ");

	                System.out.println("Dime el numero de libros que quieres introducir: ");
	                int numeroLibros = input.nextInt();
	                int[] listanumeroLibros = new int[numeroLibros];

	                for (int i = 0; i < listanumeroLibros.length; i++) {

	                    System.out.println("Nombre del autor: ");
	                    //String[] listaNombreAutor = new String[nombreAutor];

	                }

	                break;

	            case "%":
	                System.out.println("Se mostrará el % de libro por sexo del autor ");
	                break;

	            case "P":
	                System.out.println("Se mostrará del libro mas barato al mas caro: ");
	                break;

	            case "V":
	                System.out.println("Se va a mostar el libro más vendido: ");
	                break;

	            case "S":
	                System.out.println("Se ha salido del programa correctamente: ");
	                break;
	            }

	        }

	    }
	    
	String menu(Scanner input){
	        System.out.println("R - Registrar Libros");
	        System.out.println("% - Mostrar % libros por sexo del autor");
	        System.out.println("P - Mostrar libro más barato y más caro");
	        System.out.println("V - Mostrar libro más vendido");
	        System.out.println("S - Salir.");

	        String respuestaUsuario = input.next();
	        respuestaUsuario = respuestaUsuario.toUpperCase();
	        return respuestaUsuario;
	        
	        
	        
	    }    
	}