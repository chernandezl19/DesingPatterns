package edu.umg.progra2.catalogos;

public class FabricaVehiculosDiesel implements FabricaVehiculo{

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		// TODO Auto-generated method stub
		return new AutomovilDiesel(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		// TODO Auto-generated method stub
		return new ScooterDiesel(modelo, color, potencia);
	}
	
	

}
