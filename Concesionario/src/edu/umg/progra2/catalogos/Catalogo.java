package edu.umg.progra2.catalogos;

import java.util.Scanner;

/**
 * Supongamos que la clase catalogo es un modulo externo, ya sea un sitio web o un web service
 * para el mismo sera transparente la instanciacion de cada uno de los objetos, sean estos
 * electricos o de gasolina
 * @author charly
 *
 */
public class Catalogo {

	public static int nAutos = 4;
	public static int nScooters = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaVehiculo fabrica;
		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooters];
		Scanner reader = new Scanner(System.in);
		System.out.println("1. Vehiculos Electricos");
		System.out.println("2. Vehiculos de Gasolina");
		System.out.println("3. Vehiculos de Diesel");
		System.out.println("4. Vehiculos Hibridos");
		
		int opcion = reader.nextInt();
		//instanciamos la fabrica segun la opcion seleccionada
		if (opcion==1) {
			fabrica = new FabricaVehiculoElectricidad();
		}else {
			fabrica = new FabricaVehiculoGasolina();
		}
		if (opcion==2) {
			fabrica = new FabricaVehiculoGasolina();
		}else {
			fabrica = new FabricaVehiculoDiesel();
		}
		if (opcion==3) {
			fabrica = new FabricaVehiculoDiesel();
		}else {
			fabrica = new FabricaVehiculoHibrido();
		}
		if (opcion==4) {
			fabrica = new FabricaVehiculoHibrido();
		}else {
			fabrica = new FabricaVehiculoDiesel();
		}
		
		
		for (int i= 0;i<nAutos;i++) {
			autos[i] = fabrica.creaAutomovil("modelo_a"+i, "amarillo", 2000, 3.2);
		}
		for (int i= 0; i<nScooters;i++) {
			scooters[i] = fabrica.creaScooter("modelo_s"+i, "azul", 125);
		}
		
		for (Automovil auto : autos) {
			auto.mostrarCaracteristicas();
		}
		for (Scooter scooter : scooters) {
			scooter.mostrarCaracteristicas();
		}

	}

}
