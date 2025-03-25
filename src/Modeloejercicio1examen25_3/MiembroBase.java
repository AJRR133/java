package Modeloejercicio1examen25_3;

import java.util.Arrays;
import java.util.Objects;

public abstract class  MiembroBase {

	private int id;
	private String email;
	private String nombre;
	private int contadorAmigos;
	private static int contadoridentificador = 1;
	protected MiembroBase [] amigos;
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
	
	public MiembroBase[] getAmigos() {
		return amigos;
	}
	public void setAmigos(MiembroBase[] amigos) {
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
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(email, other.email) && id == other.id;
	}
	public MiembroBase( String email, String nombre, int contadorAmigos, MiembroBase[] amigos) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.contadorAmigos = contadorAmigos;
		this.amigos = amigos;
	}
	
	
	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + "]";
	}
	public void addamigos(MiembroBase m) throws GuzmanitosException {
		for(int i =0; i< amigos.length;i++) {
			if(m.equals(amigos[i])) {
				throw new GuzmanitosException("el miembro "+m.getEmail() +" ya esta en la lista de " + this.getEmail());
			} else if(amigos[i]!=null){ 
				
			} else {
				amigos[i] = m;
			}
		}
		
		
	}
	
	
	public boolean Isamigo(MiembroBase a) {
		boolean amigo = false;
		for(int i =0; i< amigos.length;i++) {
			if(a.equals(amigos[i])) {
				amigo = true;
			}
		}
		return amigo;
	}
	
	abstract String gettipousuario();
	
	
	
	
}
