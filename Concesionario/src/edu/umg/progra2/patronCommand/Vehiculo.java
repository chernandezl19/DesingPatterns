package edu.umg.progra2.patronCommand;

public class Vehiculo {
	
	protected String nombre;
	protected long fechaEntradaStock;
	protected double precioVenta;
	
	public Vehiculo (String nombre, long fechaEntradaStock, 
			double precioVenta) {
		this.nombre=nombre;
		this.fechaEntradaStock=fechaEntradaStock;
		this.precioVenta=precioVenta;
	}
	public long getTiempoEnStock(long hoy) {
		return hoy - fechaEntradaStock;
	}
		
	public void modificaPrecio(double coeficiente) {
		this.precioVenta=0.01 * Math.round(coeficiente * 
				this.precioVenta*100);
	}
	
	public void visualiza() {
		System.out.println(nombre + "precio: " +precioVenta + 
				" fecha entrada stock " + fechaEntradaStock);	
	}
}
