package edu.umg.progra2.catalogos;

public class AutomovilDiesel extends Automovil{
	
	public AutomovilDiesel(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}
	
	public void mostrarCaracteristicas() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return String.format("AutomovilDiesel [modelo=%s, color=%s, potencia=%s, espacio=%s]", modelo, color, potencia, espacio);
	}
}
