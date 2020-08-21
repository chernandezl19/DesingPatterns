package edu.umg.progra2.catalogos;

public class ScooterHibrido extends Scooter {
	public ScooterHibrido(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
// TODO Auto-generated method stub
	}

	public String toString() {
		return "ScooterHibrido [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
	}
}