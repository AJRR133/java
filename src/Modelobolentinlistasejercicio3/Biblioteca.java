package Modelobolentinlistasejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {

	List <Libro> libros ;

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Biblioteca(List<Libro> libros) {
		super();
		this.libros = new ArrayList <Libro> ();
	}


	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros + "]";
	}
	
	public void addlibro(Libro l) {
		libros.add(l);
	}
	
}
