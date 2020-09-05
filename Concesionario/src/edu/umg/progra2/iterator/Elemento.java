package edu.umg.progra2.iterator;

public abstract class Elemento
{
protected String descripcion;

public Elemento(String descripcion)
{
this.descripcion = descripcion;
}

public boolean palabraClaveValida(String palabraClave)
{
return descripcion.indexOf(palabraClave) != -1;
}
}

