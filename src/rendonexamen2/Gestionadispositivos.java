package rendonexamen2;


public class Gestionadispositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone smartphone1 = new Smartphone ("samsung", "galaxy 21",900.00, false,2);
		System.out.println(smartphone1);
		Laptop laptop1 = new Laptop ("samsung", "abc",1110.00,3,3.0);
		System.out.println(laptop1);
		Pcsobremesa pcsobremesa1 = new Pcsobremesa ("lenovo", "abc",1400.00,3,false);
		System.out.println(pcsobremesa1);
		
		Dispositivo smartphone2 = new Smartphone ("samsung", "galaxy 21",900.00, false,2);
		System.out.println(smartphone2);
		Dispositivo laptop2 = new Laptop ("samsung", "abc",1110.00,3,3.0);
		System.out.println(laptop2);
		Dispositivo pcsobremesa2 = new Pcsobremesa ("lenovo", "abc",1400.00,3,false);
		System.out.println(pcsobremesa2);
		Dispositivo dispositivo1 = new Dispositivo ("lenovo", "abc",1400.00);
		
		
		System.out.println(laptop1.equals(laptop2));
		System.out.println(laptop1.equals(pcsobremesa2));
		
		
		System.out.println(laptop2 instanceof Laptop);
		System.out.println(pcsobremesa2 instanceof Pcsobremesa);
		System.out.println(smartphone2 instanceof Smartphone);

		
		Laptop	dispositivotolaptop = (Laptop) dispositivo1;
		Smartphone	dispositivotosmartphone = (Smartphone) dispositivo1;
		Pcsobremesa	dispositivotospc = (Pcsobremesa) dispositivo1;
		
		System.out.println(dispositivotolaptop.getPeso());
		System.out.println(dispositivotosmartphone.getCantidadcamaras());
		System.out.println(dispositivotospc.isTienegpudedicada());
		

	}


}
