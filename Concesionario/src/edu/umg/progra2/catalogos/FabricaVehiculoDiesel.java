package edu.umg.progra2.catalogos;

public class FabricaVehiculoDiesel implements FabricaVehiculo {
	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilDiesel(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		return new ScooterDiesel(modelo, color, potencia);
	}
}
