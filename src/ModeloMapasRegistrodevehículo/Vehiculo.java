package ModeloMapasRegistrodevehículo;

import java.time.LocalDate;
import java.util.Objects;

public class Vehiculo {

	private String numbastidor;
	private String matricula;
	private String marca;
	private String modelo;
	private LocalDate anyofab;
	private String propi;
	protected String getNumbastidor() {
		return numbastidor;
	}
	protected void setNumbastidor(String numbastidor) {
		this.numbastidor = numbastidor;
	}
	protected String getMatricula() {
		return matricula;
	}
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected LocalDate getAnyofab() {
		return anyofab;
	}
	protected void setAnyofab(LocalDate anyofab) {
		this.anyofab = anyofab;
	}
	protected String getPropi() {
		return propi;
	}
	protected void setPropi(String propi) {
		this.propi = propi;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numbastidor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(numbastidor, other.numbastidor);
	}
	@Override
	public String toString() {
		return "Vehiculo [numbastidor=" + numbastidor + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + ", anyofab=" + anyofab + ", propi=" + propi + "]";
	}
	public Vehiculo(String numbastidor, String matricula, String marca, String modelo, LocalDate anyofab,
			String propi) {
		super();
		this.numbastidor = numbastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anyofab = anyofab;
		this.propi = propi;
	}
	
	
	
}
