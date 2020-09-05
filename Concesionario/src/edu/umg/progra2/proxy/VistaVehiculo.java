package edu.umg.progra2.proxy;

import edu.umg.progra2.proxy.Animacion;

public class VistaVehiculo {
	public static void main(String[] args) {
		Animacion animacion = new AnimacionProxy();
		animacion.dibuja();
		animacion.clic();
		animacion.dibuja();
	}
}
