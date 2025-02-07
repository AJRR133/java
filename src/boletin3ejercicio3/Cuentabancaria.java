package boletin3ejercicio3;

public class Cuentabancaria {

	private double saldo;
	private String numcuenta;
	private Persona titular;
	private Persona autorizado;
	
	
	public Cuentabancaria(double saldo, String numcuenta, Persona titular) {
		super();
		this.saldo = saldo;
		this.numcuenta = numcuenta;
		this.titular = titular;
	//	this.autorizado = autorizado;
	}


	public double getSaldo() {
		return saldo;
	}


	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNumcuenta() {
		return numcuenta;
	}


	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}


	public Persona getTitular() {
		return titular;
	}


	public void setTitular(Persona titular) {
		this.titular = titular;
	}


	public Persona getAutorizado() {
		return autorizado;
	}


	public void setAutorizado(Persona autorizado) {
		this.autorizado = autorizado;
	}
	
	
	private boolean validarimportepositivo(double importe) {
		return importe > 0;
	}
	
	private boolean validarautorizado(String dni) {
		return dni !=null && dni.equals(autorizado.getDni());
	}
	
	public void ingresar (Persona personagestion, double ingreso) {
		if (validarautorizado(personagestion.getDni())&& validarimportepositivo(ingreso)) {
			setSaldo(getSaldo()+ingreso);
		} else { 
			System.out.println("Error: no es autorizado o inreso incorrecto");
		}
		
	}
	
	public void retirar (Persona personagestion,double reintegro)
	{
		if (validarautorizado(personagestion.getDni())&& validarimportepositivo(reintegro)
				&& getSaldo() >= reintegro) {
			setSaldo(getSaldo()-reintegro);
		} else {
			System.out.println("Error: no es autorizado o inreso incorrecto o saldo insuficiente");
		}
	}
	
	public void eliminarautorizado(String dni) {
		if(validarautorizado(dni)) {
			autorizado = null;
		} else {
			System.out.println("Error: la persona no esta autorizada");
		}
	}
	
}
