package edu.umg.edu.estructuracion_y_comportamiento;

public abstract class Pedido
{
	protected double importeSinIVA;
	protected double importeIVA;
	protected double importeConIVA;
	
	protected abstract void calculaIVA();
	
	public void calculaPrecioConIVA() {
		this.calculaIVA();
		importeConIVA = importeSinIVA + importeIVA;
	}
	
	public void setImporteSinIVA(double importeSinIVA)
	{
		this.importeSinIVA = importeSinIVA;
	}
	public void visualiza () 
	{
		System.out.println("pedido");
		System.out.println("importe Sin IVA" + importeSinIVA);
		System.out.println("importe Con IVA" + importeConIVA);
	}
}