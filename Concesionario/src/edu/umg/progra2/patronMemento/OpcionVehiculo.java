package edu.umg.progra2.patronMemento;
import java.util.*; 
public class OpcionVehiculo {
	protected String nombre;
	protected List<OpcionVehiculo> opcionesIncompatibles =
	new ArrayList<OpcionVehiculo>();

	public OpcionVehiculo(String nombre)
	{
	this.nombre = nombre;
	}

	public void agregaOpcionIncompatible(OpcionVehiculo
	opcionIncompatible)
	{
	if (!opcionesIncompatibles.contains(opcionIncompatible))
	{
	opcionesIncompatibles.add(opcionIncompatible);
	opcionIncompatible.agregaOpcionIncompatible(this);
	}
	}

	public List<OpcionVehiculo> getOpcionesIncompatibles()
	{
	return opcionesIncompatibles;
	}

	public void visualiza()
	{
	https://www.facebook.com/pages/Planeta-Java/445981695433321
	System.out.println("opcion: " + nombre);
	} 
}
