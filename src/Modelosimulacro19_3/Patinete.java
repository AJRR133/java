package Modelosimulacro19_3;

import ModeloFactoriacoches.Estado;

public class Patinete extends Vehiculo {
	
	int id;
	double tiempoautonomia;
	String marca;
	String modelo;
	double fianza;
	boolean abonada;

	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getTiempoautonomia() {
		return tiempoautonomia;
	}


	public void setTiempoautonomia(double tiempoautonomia) {
		this.tiempoautonomia = tiempoautonomia;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getFianza() {
		return fianza;
	}


	public void setFianza(double fianza) {
		this.fianza = fianza;
	}


	public boolean isAbonada() {
		return abonada;
	}


	public void setAbonada(boolean abonada) {
		this.abonada = abonada;
	}


	public Patinete(int id, double tiempoautonomia, String marca, String modelo, double fianza, boolean abonada) {
		super();
		this.id = id;
		this.tiempoautonomia = tiempoautonomia;
		this.marca = marca;
		this.modelo = modelo;
		this.fianza = fianza;
		this.abonada = abonada;
	}


	
	


	@Override
	public double getPreciopordia() {
		 double preciopordia = 50;
	
		return preciopordia;
	}

}
