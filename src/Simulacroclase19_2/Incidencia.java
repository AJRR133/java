package Simulacroclase19_2;

import java.time.LocalDate;
import java.util.Objects;

public class Incidencia {
	
	private int Id;
	private String nombre;
	private String descripcion;
	private LocalDate fecharegistro;
	private LocalDate fechafin;
	private Estado Estado;
	private Criticidad criticidad;
	private Equipo equipo;
	
	public Incidencia(int id, String nombre, String descripcion, LocalDate fecharegistro, LocalDate fechafin,
			Simulacroclase19_2.Estado estado, Simulacroclase19_2.Criticidad criticidad, Equipo equipo) {
		super();
		Id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecharegistro = fecharegistro;
		setFechafin(fechafin);
		setEstado(estado);
		this.criticidad = criticidad;
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return  nombre + " - " + Estado + ":" + criticidad+"-"+
				fecharegistro + " - " +equipo.getNombre();  }
	
	protected int getId() {
		return Id;
	}
	protected void setId(int id) {
		Id = id;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getDescripcion() {
		return descripcion;
	}
	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	protected LocalDate getFecharegistro() {
		return fecharegistro;
	}
	protected void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	protected LocalDate getFechafin() {
		return fechafin;
	}
	protected void setFechafin(LocalDate fechafin) {
		if(Estado != Estado.CERRADA) {
			this.fechafin = null;
		} else
		this.fechafin = fechafin;
	}
	protected Estado getEstado() {
		return Estado;
	}
	protected void setEstado(Estado estado) {
		if(estado== Estado.CERRADA) {
			fechafin = LocalDate.now();
		}else {
			Estado = estado;

		}
	}
	protected Criticidad getCriticidad() {
		return criticidad;
	}
	protected void setCriticidad(Criticidad criticidad) {
		criticidad = criticidad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(criticidad, Estado, Id, descripcion, fechafin, fecharegistro, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidencia other = (Incidencia) obj;
		return criticidad == other.criticidad && Estado == other.Estado && Id == other.Id
				&& Objects.equals(descripcion, other.descripcion) && Objects.equals(fechafin, other.fechafin)
				&& Objects.equals(fecharegistro, other.fecharegistro) && Objects.equals(nombre, other.nombre);
	}
	
	
	protected Criticidad esurgente () {
		Criticidad urgente = Criticidad.MEDIA;
		if(criticidad == Criticidad.CRITICA) {
			urgente = Criticidad.URGENTE;
		} else if (criticidad == Criticidad.GRAVE && fecharegistro.isBefore(LocalDate.now().minusDays(7))) {
			urgente = Criticidad.URGENTE; 
		} else if (criticidad == Criticidad.MEDIA && fecharegistro.isBefore(LocalDate.now().minusDays(30)) ) {
			urgente = Criticidad.URGENTE; 
		}
		return urgente;
	}
	
}
