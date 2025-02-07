 package boletin3ejercicio2;

import java.util.Arrays;

public class Partida {
	
	private String nombrejuego;
	private Participante [] participantes;
	private Participante ganador;
	

	public Partida(String nombrejuego, Participante[] participantes) {
		super();
		this.nombrejuego = nombrejuego;
		this.participantes = participantes;
	}



	@Override
	public String toString() {
		return "Partida [nombrejuego=" + nombrejuego + ", participantes=" + Arrays.toString(participantes)
				+ ", ganador=" + ganador + "]";
	}

	

	public String getNombrejuego() {
		return nombrejuego;
	}



	public void setNombrejuego(String nombrejuego) {
		this.nombrejuego = nombrejuego;
	}



	public Participante[] getParticipantes() {
		return participantes;
	}



	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}



	public Participante getGanador() {
		return ganador;
	}



	public void setGanador(Participante ganador) {
		this.ganador = ganador;
	}



	private Participante jugadormayorpuntuacion() {
		Participante [] tablaParticipante = this.participantes;
		for (int i = 0; i< tablaParticipante.length;i++) {
			Participante p = tablaParticipante[i];
			if (p.getPuntuacion()[1]>p.getPuntuacion()[i+1]) {
				
			}
		}
		return jugador;
	}
	
		void imprimejugador() {
			
			
		}
	
}
