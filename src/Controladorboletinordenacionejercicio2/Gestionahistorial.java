package Controladorboletinordenacionejercicio2;

import Repositorioboletinordenacionejercicio2.*;

import java.time.LocalDate;
import java.util.Scanner;

import Modeloboletinordenacionejercicio2.*;

public class Gestionahistorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Historial h1 = new Historial();
		boolean salir = false;
		
		Paginaweb p1 = new Paginaweb("www.pokemon.com", LocalDate.now().minusDays(5));
		Paginaweb p2 = new Paginaweb("www.sony.com", LocalDate.now().minusDays(8));
		Paginaweb p3 = new Paginaweb("www.microsoft.com", LocalDate.now().minusDays(50));
		Paginaweb p4 = new Paginaweb("www.gmail.com", LocalDate.now().plusDays(2));
		
		while (!salir) {
            // 
            System.out.println("Menú:");
            System.out.println("1 Agregar página al historial");
            System.out.println("2 Consultar historial completo");
            System.out.println("3 Consultar historial de un dia");
            System.out.println("4 Consultar registros de una URL");
            System.out.println("5 Borrar visitas a una pagina");
            System.out.println("6 Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = input.nextInt();
            input.nextLine();  

            switch (opcion) {
                case 1:  
                	// como puedo pedir directamente un objeto tipo paginaweb
                    System.out.print("Dime la pagina para añadir");
                    String url = input.nextLine();
                    System.out.print("Dime la fecha para añadir");
                    String fecha = input.nextLine();
                    Paginaweb  pw = new Paginaweb (url, validarfecha(fecha));
                    		
                    try {
                        h1.añadirpagina(pw);
               
                    } catch (Historialexception e) {
                        System.out.println( e.getMessage());
                    }
                    break;

                case 2:  
                    System.out.println("Historial completo:");
                    System.out.println(h1.hiscompleto());
                    break;

                case 3:  
                	// y para pedir una fecha por scanner?
                    System.out.print("Fecha de historial ");
                    String fechaInput = input.nextLine();

                    System.out.println(h1.hisdia(validarfecha(fechaInput)));
                    break;

                case 4: 
                    System.out.print("URL historial");
                    String urlaver = input.nextLine();

                    System.out.println(h1.hisurl(urlaver));
                   break;
                    

                case 5: 
                    System.out.print("URL a borrar");
                    String urlBorrar = input.nextLine();
                    h1.borrar(urlBorrar);
                    System.out.println(h1.hiscompleto());
                    break;

                case 6:  
                    System.out.println("Nos vemos con nemo");
                    salir = true;
                    break;

                default:
                    System.out.println("Ingresa un num del 1 al 6");
                    break;
            }
        }
	}
	
	public static LocalDate validarfecha(String fecha) {
		
		LocalDate fechafinal = LocalDate.parse(fecha);
		
	return fechafinal;
			}
}
