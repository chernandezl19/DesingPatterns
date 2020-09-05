package edu.umg.progra2.catalogos;

public class ScooterElectrico extends Scooter {

	public ScooterElectrico(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "ScooterElectrico [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
	}

	
}
