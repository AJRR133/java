package Explicacionlsiats;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Modeloejercicio1examen25_3.GuzmanitosException;

import java.util.List;

public  class Miembro {
	private int id;
	private String email;
	private String nombre;
	private int contadorAmigos;
	private static int contadoridentificador = 1;
	protected List <Miembro> amigos = new ArrayList <Miembro> ();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id+contadoridentificador;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getContadorAmigos() {
		return contadorAmigos;
	}
	public void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}
	
	public List<Miembro> getAmigos() {
		return amigos;
	}
	public void setAmigos(List<Miembro> amigos) {
		this.amigos = amigos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Miembro other = (Miembro) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}
	
	
	
	
	public Miembro(int id, String email, String nombre, int contadorAmigos, List<Miembro> amigos) {
		super();
		this.id = id;
		this.email = email;
		this.nombre = nombre;
		this.contadorAmigos = contadorAmigos;
		this.amigos = new ArrayList <Miembro> ();
	}
	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
	}
	/*public void addamigos(MiembroBase m) throws GuzmanitosException {
		for(int i =0; i< amigos.length;i++) {
			if(m.equals(amigos[i])) {
				throw new GuzmanitosException("el miembro "+m.getEmail() +" ya esta en la lista de " + this.getEmail());
			} else if(amigos[i]!=null){ 
				
			} else {
				amigos[i] = m;
			}
		}
		
		
	}*/
	public void addamigos(Miembro m) throws GuzmanitosException{
		int num = 0;
		if(Isamigo(m)) {
			throw new GuzmanitosException("el miembro "+m.getEmail() +" ya esta en la lista de " + this.getEmail());
		} else {
			amigos.add(m);
			
		}
	}
	
	public boolean Isamigo(Miembro a) {
		return amigos.contains(a);
	}
	
	
	
	
	
}


