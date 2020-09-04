package edu.umg.progra2.catalogos;

public class AutomovilHibrido extends Automovil{

	public AutomovilHibrido(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}
	
	public void mostrarCaracteristicas() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return String.format("AutomovilHibrido [modelo=%s, color=%s, potencia=%s, espacio=%]", modelo, color, potencia, espacio);
	}
}
