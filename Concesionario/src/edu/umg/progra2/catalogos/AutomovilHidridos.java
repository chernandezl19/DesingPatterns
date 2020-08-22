package edu.umg.progra2.catalogos;

public class AutomovilHidridos extends Automovil {

	public AutomovilHidridos(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "AutomovilHidridos [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
		
	}

}
