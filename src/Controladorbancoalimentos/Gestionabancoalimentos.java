package Controladorbancoalimentos;


import java.time.LocalDate;
import java.util.ArrayList;

import Modelobancoalimentos.*;
import Repositoriobancoalimentos.*;

public class Gestionabancoalimentos {

	public static void main(String[] args) {

        try {
            // Crear instancia del banco de alimentos
            Bancoalimentos banco = new Bancoalimentos(new ArrayList<>());

            // Crear un centro logístico
            Centrolo centro1 = new Centrolo(1, "Centro Norte", "Madrid", 5, new ArrayList<>());
            banco.agregarcentro(centro1);
            System.out.println("Centro agregado: " + centro1);

            // Crear trabajadores
            Trabajador trabajador1 = new Trabajador("Carlos Pérez", "12345678A", LocalDate.of(1990, 5, 15), Tipo.ASALARIADO, centro1);
            Trabajador trabajador2 = new Trabajador("Ana Ruiz", "87654321B", LocalDate.of(1985, 8, 20), Tipo.VOLUNTARIO, centro1);

            // Agregar trabajadores al centro
            centro1.agregartrabajador(trabajador1);
            centro1.agregartrabajador(trabajador2);
            System.out.println("Trabajadores agregados al centro."+ centro1);

            // Obtener y mostrar datos del centro por ID
            Centrolo datosCentro = banco.obtenerdatos(1);
            if (datosCentro != null) {
                System.out.println("Datos del centro obtenido:");
                System.out.println(datosCentro);
            }

            // Obtener y mostrar datos del trabajador por DNI
            Trabajador datosTrabajador = banco.obtenerdatostra("12345678A");
            if (datosTrabajador != null) {
                System.out.println("Datos del trabajador obtenido:");
                System.out.println(datosTrabajador);
                System.out.println(centro1.getTrabajadores());
            }

        } catch (BancoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
        
