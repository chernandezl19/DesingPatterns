package edu.umg.progra2.patronMemento;

import java.util.ArrayList;
import java.util.List; 

public class MementoImpl implements Memento {
	
	protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();

			public void setEstado(List<OpcionVehiculo> opciones)
			{
			this.opciones.clear();
			this.opciones.addAll(opciones);
			}
			public List<OpcionVehiculo> getEstado()
			{
			return opciones;
			}

}
