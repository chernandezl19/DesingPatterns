package edu.umg.progra2.iterator;

public class Vehiculo extends Elemento
{

public Vehiculo(String descripcion)
{
super(descripcion);
}

public void visualiza()
{
System.out.print("Descripcion del vehículo: " + descripcion);
}
}

