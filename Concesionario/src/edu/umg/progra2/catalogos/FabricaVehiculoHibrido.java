package edu.umg.progra2.catalogos;

public class FabricaVehiculoHibrido implements FabricaVehiculo {

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		// TODO Auto-generated method stub
		return new AutomovilHibrido(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		// TODO Auto-generated method stub
		return new ScooterHibrido(modelo, color, potencia);
	}

}
