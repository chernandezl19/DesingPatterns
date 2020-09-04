package com.umg.Flyweight;

public class OpcionVehiculo {
    	protected String nombre;
	protected String descripcion;
	protected int precioEstandar;

        	public OpcionVehiculo(String nombre)
	{
	this.nombre = nombre;
	this.descripcion = "Descripción de " + nombre;
	this.precioEstandar = 100;
	}

        	public void visualiza(int precioDeVenta)
	{
	System.out.println("Opción");
	System.out.println("Nombre: " + nombre);
	System.out.println(descripcion);
		System.out.println("Precio estándar: " + precioEstandar);
	System.out.println("Precio de venta: " + precioDeVenta);
	}

}
