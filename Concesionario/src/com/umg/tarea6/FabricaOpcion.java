package com.umg.tarea6;
import java.util.*;
public class FabricaOpcion {
    protected Map<String, OpcionVehiculo> opciones = new TreeMap<String, OpcionVehiculo>();
	public OpcionVehiculo getOption(String nombre)
	{
	OpcionVehiculo resultado;
	if (opciones.containsKey(nombre))
	{
	return opciones.get(nombre);
	}
	else
	{
	resultado = new OpcionVehiculo(nombre);
	opciones.put(nombre, resultado);
	}
	return resultado;
	}

}
