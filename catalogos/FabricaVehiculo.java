package edu.umg.progra2.catalogos;

/**
 * <p>La interfaz FabricaVehiculo tendra una implementacion por cada familia
 * (electrico / gasolina) y cada una sera la encargada de instanciar la clase
 * concreta que le corresponde</p>
 * @author charly
 *
 */
public interface FabricaVehiculo {

	Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
	
	public Scooter creaScooter(String modelo, String color, int potencia);
}
