package Controladortenis;

import java.time.LocalDate;
import java.util.ArrayList;

import Modelotenis.*;
import Repositoriotenis.*;

public class GestionaTorneo {

    public static void main(String[] args) {
        // Instancia torneo
        Torneo torneo = new Torneo(null, null);

        // Crear jugadores
        Jugador j1 = new Jugador("Rafael", "Nadal", "España", 1, new ArrayList<>());
        Jugador j2 = new Jugador("Novak", "Djokovic", "Serbia", 2, new ArrayList<>());
        Jugador j3 = new Jugador("Roger", "Federer", "Suiza", 3, new ArrayList<>());
        Jugador j4 = new Jugador("Andy", "Murray", "Reino Unido", 4, new ArrayList<>());

        // Agregar jugadores (capturar excepción si repite)
        try {
            torneo.agregarjugador(j1);
            torneo.agregarjugador(j2);
            torneo.agregarjugador(j3);
            torneo.agregarjugador(j4);
            // Intento agregar jugador repetido
            torneo.agregarjugador(j1); 
        } catch (TorneoException e) {
            System.out.println("Error al agregar jugador: " + e.getMessage());
        }

        // Crear partidos
        // Partido 1: Nadal vs Djokovic
        Partido p1 = new Partido(j1, j2, Estado.FINALIZADO, LocalDate.of(2025, 5, 20), new ArrayList<>(), new ArrayList<>());
        p1.getPuntj1().add(6); p1.getPuntj1().add(4); p1.getPuntj1().add(7);
        p1.getPuntj2().add(4); p1.getPuntj2().add(6); p1.getPuntj2().add(5);

        // Partido 2: Federer vs Murray
        Partido p2 = new Partido(j3, j4, Estado.EN_CURSO, LocalDate.of(2025, 5, 21), new ArrayList<>(), new ArrayList<>());
        p2.getPuntj1().add(3); p2.getPuntj1().add(5);
        p2.getPuntj2().add(6); p2.getPuntj2().add(7);

        // Partido 3: Nadal vs Djokovic (repetido)
        Partido p3 = new Partido(j1, j2, Estado.PLANIFICADO, LocalDate.of(2025, 6, 1), new ArrayList<>(), new ArrayList<>());

        // Registrar partidos
        torneo.registrarpartido(p1);
        torneo.registrarpartido(p2);
        torneo.registrarpartido(p3);

        // Mostrar jugadores
       System.out.println("Jugadores en el torneo:");
        for (Jugador j : torneo.mostrarjugadores()) {
            System.out.println(j);
        }

        // Mostrar partidos de Nadal
        System.out.println("\nPartidos de " + j1.getNombre() + " " + j1.getApellido() + ":");
        ArrayList<Partido> partidosDeNadal = torneo.mostrarPartidos(j1);
        for (Partido p : partidosDeNadal) {
            System.out.println(p);
        }

        // Obtener ganador partido p1
        try {
            Jugador ganador = getJugadorGanador(p1);
            System.out.println("\nGanador del partido 1: " + ganador.getNombre() + " " + ganador.getApellido());
        } catch (TorneoException e) {
            System.out.println("No se puede obtener ganador: " + e.getMessage());
        }

        // Intentar obtener ganador partido p3 (PLANIFICADO) -> debe lanzar excepción
        try {
            Jugador ganador = getJugadorGanador(p3);
            System.out.println("Ganador del partido 3: " + ganador.getNombre() + " " + ganador.getApellido());
        } catch (TorneoException e) {
            System.out.println("No se puede obtener ganador del partido 3: " + e.getMessage());
        }
    }

    // Método para obtener ganador de un partido
    public static Jugador getJugadorGanador(Partido p) throws TorneoException {
        if (p.getEstado() == Estado.PLANIFICADO) {
            throw new TorneoException("El partido está en estado PLANIFICADO, no se puede determinar ganador");
        }
        int setsGanadosJ1 = 0;
        int setsGanadosJ2 = 0;
        ArrayList<Integer> puntJ1 = p.getPuntj1();
        ArrayList<Integer> puntJ2 = p.getPuntj2();
        int sets = Math.min(puntJ1.size(), puntJ2.size());

        for (int i = 0; i < sets; i++) {
            if (puntJ1.get(i) > puntJ2.get(i)) {
                setsGanadosJ1++;
            } else if (puntJ2.get(i) > puntJ1.get(i)) {
                setsGanadosJ2++;
            }
            // En caso de empate en set no se suma a ninguno
        }
        if (setsGanadosJ1 > setsGanadosJ2) return p.getJ1();
        else if (setsGanadosJ2 > setsGanadosJ1) return p.getJ2();
        else return null; // Empate o no decidido
    }
}
