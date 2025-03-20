package Modelosimulacro19_3;

import java.time.LocalDate;

public class ConcesionarioAlquiler {

	Vehiculo [] vehiculos;
	String nombre;
	String direccion;
	
	public ConcesionarioAlquiler(Vehiculo[] vehiculos, String nombre, String direccion) {
		super();
		this.vehiculos = new Vehiculo[100];
		this.nombre = nombre;
		this.direccion = direccion;
	}
    void agregarVehiculo(Vehiculo v) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].equals(v)) {
                System.out.println("No es posible añadir un vehículo ya registrado.");
            } else {
            	vehiculos[i] = v; 
                System.out.println("Vehículo añadido correctamente.");
            }
        }    } 
    
    
    void realizaralquiler(Alquiler a) {
    	
    	for (int i = 0; i < vehiculos.length; i++) {
    		if(vehiculos[i] != null && vehiculos[i].alquileres[i].getFecharegistro().isBefore(LocalDate.now())) {
    			System.out.println("Vehiculo alquilado, gracias");
    		} else {
    			System.out.println("el vehiculo no esta disponible");
    		}
    	}
    	
    	double gananciatotal(Vehiculo[].getImporetotalgenerado()) {
    		
    	}
    }
}
