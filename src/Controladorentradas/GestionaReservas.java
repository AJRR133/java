package Controladorentradas;

import modeloentradas.*;
import java.time.LocalDate;
import java.util.TreeSet;

import Repositorioentradas.*;

public class GestionaReservas {
    
    public static void main(String[] args) {
        try {
            // Crear el repositorio de eventos
            TreeSet<Eventos> listaeventos = new TreeSet <Eventos>();
            TreeSet<Reserva> listareservas = new TreeSet<Reserva>();
            Repoeventos repositorio = new Repoeventos(listaeventos);
            // Crear usuarios
            Usuario usuario1 = new Usuario("Juan Pérez", "juan@example.com");
            Usuario usuario2 = new Usuario("Ana Gómez", "ana@example.com");
            Usuario usuario3 = new Usuario("Carlos Rodríguez", "carlos@example.com");
            Usuario usuario4 = new Usuario("Maria García", "maria@example.com");
            
            // Crear eventos
            Eventos evento1 = new Eventos("Concierto de Rock", LocalDate.of(2025, 6, 15), "Estadio Nacional", listareservas);
            Eventos evento2 = new Eventos("Teatro Musical", LocalDate.of(2025, 6, 20), "Teatro Principal", listareservas);
            
            // Agregar eventos al repositorio
            try {
            	repositorio.agregarEvento(evento1);
            	repositorio.agregarEvento(evento2);
                System.out.println("Eventos agregados correctamente.");
            } catch (ReservaException e) {
                System.out.println("Error al agregar evento: " + e.getMessage());
            }
            
            // Crear reservas de usuarios
            Reserva reserva1 = new Reserva(0, LocalDate.of(2025, 6, 15), null, usuario1);
            Reserva reserva2 = new Reserva(0, LocalDate.of(2025, 6, 20), null, usuario2);
            evento1.agregarReserva(reserva1);
            evento2.agregarReserva(reserva2);
            
            // Intentar agregar un evento con el mismo nombre y fecha
            try {
                Eventos eventoDuplicado = new Eventos("Concierto de Rock", LocalDate.of(2025, 6, 15), "Estadio Nacional", listareservas);
                repositorio.agregarEvento(eventoDuplicado);
            } catch (ReservaException e) {
                System.out.println("Error al agregar evento duplicado: " + e.getMessage());
            }
            
            // Intentar modificar una reserva
            try {
                Usuario nuevoUsuario = new Usuario("Laura Díaz", "laura@example.com");
                repositorio.modificarreserva(reserva1.getId(), "Concierto de Rock", LocalDate.of(2025, 6, 15), nuevoUsuario);
                System.out.println("Reserva modificada correctamente.");
            } catch (ReservaException e) {
                System.out.println("Error al modificar reserva: " + e.getMessage());
            }
            
            // Intentar modificar una reserva con ID no válido
            try {
                Usuario usuarioInvalido = new Usuario("Raul Fernández", "raul@example.com");
                repositorio.modificarreserva(9999, "Concierto de Rock", LocalDate.of(2025, 6, 15), usuarioInvalido); // ID no existe
            } catch (ReservaException e) {
                System.out.println("Error al modificar reserva con ID no válido: " + e.getMessage());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
