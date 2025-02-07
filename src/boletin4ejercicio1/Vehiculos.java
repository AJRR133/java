package boletin4ejercicio1;

public class Vehiculos {
	    private String dueno;
	    private int numpuertas;
	    private int numruedas;

	    public Vehiculos(String dueno, int numpuertas, int numruedas) {
	        this.dueno = dueno;
	        this.numpuertas = numpuertas;
	        this.numruedas = numruedas;
	    }

	    // Getters y Setters comunes
	    public String getDueno() {
	        return dueno;
	    }

	    public void setDueno(String dueno) {
	        this.dueno = dueno;
	    }

	    public int getNumpuertas() {
	        return numpuertas;
	    }

	    public void setNumpuertas(int numpuertas) {
	        this.numpuertas = numpuertas;
	    }

	    public int getNumruedas() {
	        return numruedas;
	    }

	    public void setNumruedas(int numruedas) {
	        this.numruedas = numruedas;
	    }

	    @Override
	    public String toString() {
	        return "Vehiculo [dueno=" + dueno + ", numpuertas=" + numpuertas + ", numruedas=" + numruedas + "]";
	    }
	}

}
