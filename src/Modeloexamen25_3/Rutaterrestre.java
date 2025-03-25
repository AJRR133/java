package Modeloexamen25_3;

public class Rutaterrestre extends RutaBase{
	boolean siescarretera;
	static final double coste100km =0.65;
	
	public boolean isSiescarretera() {
		return siescarretera;
	}

	public void setSiescarretera(boolean siescarretera) {
		this.siescarretera = siescarretera;
	}
	

	public Rutaterrestre(int id, Ciudad ciudadorigen, Ciudad ciudaddestino, double distanciakm, boolean siescarretera) {
		super(id, ciudadorigen, ciudaddestino, distanciakm);
		this.siescarretera = siescarretera;
	}

	

	@Override
	public String toString() {
		return "Rutaterrestre [siescarretera=" + siescarretera + ", id=" + id + ", ciudadorigen=" + ciudadorigen
				+ ", ciudaddestino=" + ciudaddestino + ", distanciakm=" + distanciakm + "]";
	}

	@Override
	public double getcoste() {
		double coste;
		coste = getDistanciakm()*coste100km;
		return coste;
	}

	@Override
	public String gettiporuta() {
		String ruta;
		if(isSiescarretera()==true) {
			ruta = this.getClass()+ "-carretera";}
		else {
			ruta = this.getClass()+ "-tren";
		}
		return ruta;
	}

}
