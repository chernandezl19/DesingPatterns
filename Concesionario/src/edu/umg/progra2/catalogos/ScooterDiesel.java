package edu.umg.progra2.catalogos;

public class ScooterDiesel extends Scooter {

	public ScooterDiesel(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
	public String toString() {
		return "ScooterDiesel [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
	}
}
