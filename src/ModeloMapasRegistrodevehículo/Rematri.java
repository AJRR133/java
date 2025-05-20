package ModeloMapasRegistrodevehículo;

import java.time.LocalDate;
import java.util.Objects;

import ModeloMapasRegistrodevehículo.Vehiculo;
public class Rematri {

	private Vehiculo vehiculo;
	private String numbastidor;
	private LocalDate fechamat;
	private String matriculaini;
	private String matriculafin;
	
	protected Vehiculo getVehiculo() {
		return vehiculo;
	}
	protected void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	protected String getNumbastidor() {
		return numbastidor;
	}
	protected void setNumbastidor(String numbastidor) {
		this.numbastidor = vehiculo.getNumbastidor();
	}
	protected LocalDate getFechamat() {
		return fechamat;
	}
	protected void setFechamat(LocalDate fechamat) {
		this.fechamat = fechamat;
	}
	protected String getMatriculaini() {
		return matriculaini;
	}
	protected void setMatriculaini(String matriculaini) {
		this.matriculaini = matriculaini;
	}
	protected String getMatriculafin() {
		return matriculafin;
	}
	protected void setMatriculafin(String matriculafin) {
		this.matriculafin = matriculafin;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fechamat);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rematri other = (Rematri) obj;
		return Objects.equals(fechamat, other.fechamat);
	}
	public Rematri(Vehiculo vehiculo, String numbastidor, LocalDate fechamat, String matriculaini,
			String matriculafin) {
		super();
		this.vehiculo = vehiculo;
		this.numbastidor = numbastidor;
		this.fechamat = fechamat;
		this.matriculaini = matriculaini;
		this.matriculafin = matriculafin;
	}
	
	
	
	
}
