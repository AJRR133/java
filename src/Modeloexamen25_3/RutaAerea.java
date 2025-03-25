package Modeloexamen25_3;

public class RutaAerea extends RutaBase{

	TipoVuelo tipodevuelo;
	
	public TipoVuelo getTipodevuelo() {
		return tipodevuelo;
	}

	public void setTipodevuelo(TipoVuelo tipodevuelo) {
		this.tipodevuelo = tipodevuelo;
	}

	

	@Override
	public String toString() {
		return "RutaAerea [tipodevuelo=" + tipodevuelo + ", id=" + id + ", ciudadorigen=" + ciudadorigen
				+ ", ciudaddestino=" + ciudaddestino + ", distanciakm=" + distanciakm + "]";
	}

	public RutaAerea(int id, Ciudad ciudadorigen, Ciudad ciudaddestino, double distanciakm, TipoVuelo tipodevuelo) {
		super(id, ciudadorigen, ciudaddestino, distanciakm);
		this.tipodevuelo = tipodevuelo;
	}

	@Override
	public double getcoste() {
		double coste = 0;
		if(getTipodevuelo().equals(TipoVuelo.LOW_COST)) {
			coste = getDistanciakm()*0.75;
		}else if(getTipodevuelo().equals(TipoVuelo.NORMAL)) {
			coste = getDistanciakm()*1.1;
		}else if(getTipodevuelo().equals(TipoVuelo.EXPRESS)) {
			coste = getDistanciakm()*1.5;
		}
		return coste;
	}

	@Override
	public String gettiporuta() {
		String ruta;
		ruta = this.getClass() +""+ getTipodevuelo();
		return ruta;
	}

}
