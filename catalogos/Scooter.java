package edu.umg.progra2.catalogos;

public abstract class Scooter {

	protected String modelo;
	protected String color;
	protected int potencia;
	public Scooter(String modelo, String color, int potencia) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
	}
	
	public abstract void mostrarCaracteristicas();

	public void mostrarCaracteristicas1() {
		// TODO Auto-generated method stub
		
	}
}
