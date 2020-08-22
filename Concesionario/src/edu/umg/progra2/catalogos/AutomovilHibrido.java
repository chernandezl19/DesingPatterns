package edu.umg.progra2.catalogos;

public class AutomovilHibrido extends Automovil{

	public AutomovilHibrido(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
	public String toString() {
		return "AutomovilHibrido [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + ", espacio="
				+ espacio + "]";
	}
}
