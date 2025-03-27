package Modelobolentinlistasejercicio3;

import java.util.Objects;

public class Libro {
	
	String titulo;
	String autor;
	String genero;
	int año;
	Estadolibro estado;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public Estadolibro getEstado() {
		return estado;
	}
	public void setEstado(Estadolibro estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor, año, estado, genero, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && año == other.año && estado == other.estado
				&& Objects.equals(genero, other.genero) && Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", año=" + año + ", estado="
				+ estado + "]";
	}
	public Libro(String titulo, String autor, String genero, int año, Estadolibro estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.año = año;
		this.estado = estado;
	}
	
	
	
}
