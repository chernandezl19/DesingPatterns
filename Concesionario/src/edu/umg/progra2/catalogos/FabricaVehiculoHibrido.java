package edu.umg.progra2.catalogos;

public class FabricaVehiculoHibrido implements FabricaVehiculo {
	
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilHibrido(modelo, color, potencia, espacio);
	}
	
	public Scooter creaScooter(String modelo, String color, int potencia) {
		return new ScooterHibrido(modelo, color, potencia);
	}

}
