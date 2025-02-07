package orientacionproductos;

public class GestionProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto lapiz = new Producto();
		lapiz.nombre = "lapiz";
		lapiz.numunidades = 0;
		lapiz.precioventa = 0.3;

		boolean stock = lapiz.pedirstock();
		System.out.println(stock);

		int aumento = lapiz.aumentounidades(5);
		System.out.println(aumento);

		String cadenalapiz = lapiz.coviertecadena();
		System.out.println(cadenalapiz);

	}

}
