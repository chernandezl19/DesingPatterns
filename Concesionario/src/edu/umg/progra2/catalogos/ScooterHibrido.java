package edu.umg.progra2.catalogos;

public class ScooterHibrido extends Scooter {

	public ScooterHibrido(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());


	}
	public String toString() {
		return "ScooterHibrido [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
	}
}
