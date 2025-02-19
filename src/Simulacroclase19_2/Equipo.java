package Simulacroclase19_2;

import java.util.Objects;

public class Equipo {
	
	private String nombre;
	private String mac;
	private String so;
	private int Numincidente;
	private Usuario usuario;
	
	

	public Equipo(String nombre, String mac, String so, int numincidente, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.mac = mac;
		this.so = so;
		Numincidente = numincidente;
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return  nombre + " - " + mac + " - " + Numincidente+"nombreusuario"+usuario.getNombre() ;
	}
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getMac() {
		return mac;
	}
	protected void setMac(String mac) {
		this.mac = mac;
	}
	protected String getSo() {
		return so;
	}
	protected void setSo(String so) {
		this.so = so;
	}
	protected int getNumincidente() {
		return Numincidente;
	}
	protected void setNumincidente(int numincidente) {
		Numincidente = numincidente;
	}


	protected Usuario getUsuario() {
		return usuario;
	}
	protected void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Numincidente, mac, nombre, so, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return  Objects.equals(mac, other.mac);
				
	}
	
	
	
	
}
