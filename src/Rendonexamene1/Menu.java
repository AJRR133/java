package Rendonexamene1;

import java.time.LocalDate;
import java.util.Objects;

public class Menu {
	private int id;
	private String nombre;
	private double consumocalorias;
	private double precioventamenu;
	private double preciocostemenu;
	private Tipodieta tipodedieta;
	private LocalDate diadistribucion;
	private String frutossecos;
	private int unidaddesrepartidas;
	
	
	public Menu(int id, String nombre, double consumocalorias, double precioventamenu, double preciocostemenu,
			Tipodieta tipodedieta, LocalDate diadistribucion, String frutossecos, int unidaddesrepartidas) {
		super();
		this.id = id;
		this.nombre = nombre;
		setConsumocalorias(consumocalorias);
		setPrecioventamenu(precioventamenu);
		setPreciocostemenu(preciocostemenu);
		this.tipodedieta = tipodedieta;
		this.diadistribucion = diadistribucion;
		getFrutossecos();
		this.unidaddesrepartidas = unidaddesrepartidas;
	}


	@Override
	public String toString() {
		return "Menu: Jueves febrero " + nombre+ " tipo: "+ tipodedieta +", precio venta "+precioventamenu+ " euros, fecha: " +diadistribucion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(consumocalorias, diadistribucion, frutossecos, id, nombre, preciocostemenu, precioventamenu,
				tipodedieta, unidaddesrepartidas);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Double.doubleToLongBits(consumocalorias) == Double.doubleToLongBits(other.consumocalorias)
				&& Objects.equals(diadistribucion, other.diadistribucion)
				&& Objects.equals(frutossecos, other.frutossecos) && id == other.id
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(preciocostemenu) == Double.doubleToLongBits(other.preciocostemenu)
				&& Double.doubleToLongBits(precioventamenu) == Double.doubleToLongBits(other.precioventamenu)
				&& tipodedieta == other.tipodedieta && unidaddesrepartidas == other.unidaddesrepartidas;
	}


	protected int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected double getConsumocalorias() {
		return consumocalorias;
	}


	protected void setConsumocalorias(double consumocalorias) {
		if(consumocalorias<1000) {
			System.out.println("es bajo en calorias");
			this.consumocalorias = consumocalorias;
		} else {
			this.consumocalorias = consumocalorias;
		}
	}


	protected double getPrecioventamenu() {
		return precioventamenu;
	}


	protected void setPrecioventamenu(double precioventamenu) {
		if (precioventamenu>= getPreciocostemenu()+(getPreciocostemenu()%30)&&precioventamenu>0) {
		this.precioventamenu = precioventamenu;
		} else {
			System.out.println("el precio de venta tiene que ser un 30% superior al de coste");
		}
	}


	protected double getPreciocostemenu() {
		return preciocostemenu;
	}


	protected void setPreciocostemenu(double preciocostemenu) {
		if(preciocostemenu>0) {
		this.preciocostemenu = preciocostemenu;
		} else {
			System.out.println("el precio de coste debe ser positivo");
		}
	}


	protected Tipodieta getTipodedieta() {
		return tipodedieta;
	}


	protected void setTipodedieta(Tipodieta tipodedieta) {
		this.tipodedieta = tipodedieta;
	}


	protected LocalDate getDiadistribucion() {
		return diadistribucion;
	}


	protected void setDiadistribucion(LocalDate diadistribucion) {
		this.diadistribucion = diadistribucion;
	}


	protected String getFrutossecos() {
		return frutossecos;
	}


	protected void setFrutossecos(String frutossecos) {
		if(frutossecos=="si") {
			System.out.println("contiene frutos secos");
		} else if (frutossecos=="si") {
			System.out.println(" no contiene frutos secos");
		}else {
			System.out.println("valor no valido");
		}
		this.frutossecos = frutossecos;
	}


	protected int getUnidaddesrepartidas() {
		return unidaddesrepartidas;
	}


	protected void setUnidaddesrepartidas(int unidaddesrepartidas) {
		this.unidaddesrepartidas = unidaddesrepartidas;
	}
	
/*	protected boolean esbajaencalorias() {
		boolean bajocalorias = false;
		if(consumocalorias<1000) {
			bajocalorias= true;
		} else {
			bajocalorias = false;
		}
		return bajocalorias;
	}*/
	
	protected boolean contienecarne() {
		boolean tienecarne = true;
		if(tipodedieta==Tipodieta.VEGANO||tipodedieta==Tipodieta.VEGETARIANO) {
			tienecarne=false;
		} else {
			tienecarne = true;
		}
		return tienecarne;
	}
}
