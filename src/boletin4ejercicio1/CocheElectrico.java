package boletin4ejercicio1;

public class CocheElectrico extends Vehiculos {

	private String tipobateria;
	
	
	
	public CocheElectrico(String dueno, int numpuertas, int numruedas, String tipobateria) {
		super(dueno, numpuertas, numruedas);
		this.tipobateria = tipobateria;
	}



	public String getTipobateria() {
		return tipobateria;
	}

	public void setTipobateria(String tipobateria) {
		if (tipobateria.equals("LFP") || tipobateria.equals("NCM")) {
		this.tipobateria = tipobateria;}
	}



	@Override
	public String toString() {
		return "CocheElectrico [tipobateria=" + tipobateria + "]";
	}

}


