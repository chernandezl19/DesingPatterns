package edu.umg.progra2.catalogos;

public class ScooterHidridos extends Scooter{
	
	public ScooterHidridos(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "ScooterHidridos [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
	}

}
