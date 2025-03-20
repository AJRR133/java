package Modelosimulacro20_3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public abstract class Deportista implements ICompeticion {
	String nombre;
	String pais;
	int edad;
	double peso;
	double altura;
	Prueba [] pruebas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Prueba[] getPruebas() {
		return pruebas;
	}
	public void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(pruebas);
		result = prime * result + Objects.hash(altura, edad, nombre, pais, peso);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura) && edad == other.edad
				&& Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Arrays.equals(pruebas, other.pruebas);
	}
	public Deportista(String nombre, String pais, int edad, double peso, double altura, Prueba[] pruebas) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas = new Prueba[50];
	}
	@Override
	public String toString() {
		return "Deportistas [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + ", pruebas=" + Arrays.toString(pruebas) + "]";
	}
	
	double getTiempocalentamiento() {
		return 0;
	}
	
	double getCaloriasnecesariasdias() {
		return 0;
	}
	int getHorasentrenamiento(LocalDate F) {
		return 0;
	}
	@Override
	public String competir() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getTiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	void añadirprueba(Prueba p) throws CompeticionException {
		for(int i = 0; i<pruebas.length;i++) {
			if(p == null || p.equals(pruebas[i])) {
				throw new CompeticionException("No puedes añadir una prueba repetida");
			} else {
				pruebas[i] = p;
			}
		}
			
		
	}
}
