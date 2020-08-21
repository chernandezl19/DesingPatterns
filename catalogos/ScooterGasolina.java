package edu.umg.progra2.catalogos;

public class ScooterGasolina extends Scooter {

	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "ScooterGasolina [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
	}

	
}
