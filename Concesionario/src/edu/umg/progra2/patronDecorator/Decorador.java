package edu.umg.progra2.patronDecorator;

public abstract class Decorador implements ComponenteGraficoVehiculo {
	protected ComponenteGraficoVehiculo componente;
	
	public Decorador(ComponenteGraficoVehiculo componente)
	{
		this.componente = componente;
	}
	
	public void visualiza()
	{
		componente.visualiza();
	}
}
