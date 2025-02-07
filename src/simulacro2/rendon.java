package simulacro2;

import java.util.Scanner;



public class rendon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1) imprimemenu
		 * 2) registrar libros,
		 * 		3) nombreautor
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
		rendon r = new rendon (); 
		  
		//int registro = r.registrarlibros(input) ;
        /*String respuestaUsuario = "";
        String nombreautor = "";
        String Sexo;
        String tituloLibro = "";
        double PrecioLibro = 0;
        int unidadesVendidas = 0;*/
        
        String opcion = r.menu(input);
        
        while (!opcion.equals("S")) {
        	 opcion = r.menu(input);
            System.out.println("Seleccione una de estas opciones: ");
            
            switch (opcion) {
            case "R":
            	r.registrarlibros(input);
                break;
            case "%":
                //porcentajesexo ();
                break;
            case "P":
                //baratoycaro ();
                break;
            case "V":
                //libroMasVendido ();
                break;
            case "S":
                System.out.println("El programa ha finalizado con exito.");
                break;
            default:
                System.out.println("La opcion que has seleccionado no es válida. Intentalo de nuevo.");
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

   int registrarlibros(Scanner input) {
    	
    	}
    
    int numerolibros(Scanner input) {
    	System.out.println("Dime el numero de libros");
    	int numlibros = input.nextInt();
    	return numlibros;
    }
    
   /* String[] nombreautor(Scanner input) {
    	System.out.println("Dime el nombrer del autor");
    	String nomautor = input.next();
    	String [] listanomautor = ;
    	listanomautor = listanomautor + nomautor;
    	
    	return listanomautor;
    }*/
    
    String sexoautor(Scanner input) {
    	System.out.println("Dime el sexo del autor(H/M)");
    	String sexo = input.next();
    	return sexo;
    }
    String titulolibro(Scanner input) {
    	System.out.println("Dime el titulo del libro");
    	String titulo = input.next();
    	return titulo;
    }
    double preciounitario(Scanner input) {
    	System.out.println("Dime el precio del libro");
    	double precio = input.nextDouble();
    	return precio;
    }
    int unidadesvendidas(Scanner input) {
    	System.out.println("Dime las unidades vendidas");
    	int unidades = input.nextInt();
    	return unidades;
    }
    
}