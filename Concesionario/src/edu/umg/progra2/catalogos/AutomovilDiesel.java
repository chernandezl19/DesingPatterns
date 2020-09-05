package edu.umg.progra2.catalogos;

public class AutomovilDiesel extends Automovil {

	public AutomovilDiesel(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "AutomovilDiesel [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + ", espacio="
				+ espacio + "]";
	}

	
}