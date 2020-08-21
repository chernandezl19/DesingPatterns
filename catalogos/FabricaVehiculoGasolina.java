package edu.umg.progra2.catalogos;
/**
 * <p> esta implementacion es la encargada de crear cada una de las instancias
 * de vehiculos de la familia de los gasolina</p>
 * @author charly
 *
 */
public class FabricaVehiculoGasolina implements FabricaVehiculo {

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		
		return new AutomovilGasolina(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		
		return new ScooterGasolina(modelo, color, potencia);
	}

}
