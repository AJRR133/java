package Repositoriotenis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

import Modelotenis.*;

public class Torneo {
	private HashSet<Jugador> jugadores;
	private ArrayList<Partido> partidos;
	public HashSet<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(HashSet<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(jugadores, partidos);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torneo other = (Torneo) obj;
		return Objects.equals(jugadores, other.jugadores) && Objects.equals(partidos, other.partidos);
	}
	@Override
	public String toString() {
		return "Torneo [jugadores=" + jugadores + ", partidos=" + partidos + "]";
	}
	public Torneo(HashSet<Jugador> jugadores, ArrayList<Partido> partidos) {
		super();
		this.jugadores = new HashSet<Jugador>();
		this.partidos = new ArrayList<Partido>();
	}
	
	public void agregarjugador(Jugador j1) throws TorneoException {
		if(jugadores.size()>0) {
		for(Jugador ju : jugadores) {
			if(ju.equals(j1)) {
				throw new TorneoException("El jugador ya esta registrado");
			}
		}jugadores.add(j1);
		} else {
			jugadores.add(j1);
		}
	}
	
	public void registrarpartido (Partido p1) {
			partidos.add(p1);
	}
	
	public HashSet<Jugador> mostrarjugadores() {
		return jugadores;
	}
	
	public ArrayList mostrarPartidos (Jugador j1) {
		ArrayList partidosjugados = new ArrayList<Partido>();
		for(Partido p : partidos) {
			if(p.getJ1().equals(j1) || p.getJ2().equals(j1) ) {
				partidosjugados.add(p);
			}
		}
		return partidosjugados;
		
	}
}
