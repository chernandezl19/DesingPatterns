package edu.umg.progra2.patronIterador;

public class Vehiculo extends Elemento {

	public Vehiculo(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}
	public void visualiza()
	{
		System.out.println("Descripcion del vehiculo: "+ descripcion);
	}

}
