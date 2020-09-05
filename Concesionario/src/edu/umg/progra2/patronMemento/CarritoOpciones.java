package edu.umg.progra2.patronMemento;
import java.util.*; 
public class CarritoOpciones {
	protected List<OpcionVehiculo> opciones =
			new ArrayList<OpcionVehiculo>();

			public Memento agregaOpcion(OpcionVehiculo opcionVehiculo)
			{
			MementoImpl resultado = new MementoImpl();
			resultado.setEstado(opciones);
			opciones.removeAll(opcionVehiculo.getOpcionesIncompatibles());

			opciones.add(opcionVehiculo);
			return resultado;
			}

			public void anula(Memento memento)
			{
			MementoImpl mementoImplInstance;
			try
			{
			mementoImplInstance = (MementoImpl)memento;
			}
			catch (ClassCastException e)
			{
			return;
			}
			opciones = mementoImplInstance.getEstado();
			}

			public void visualiza()
			{
			System.out.println("Contenido del carrito de opciones");
			for (OpcionVehiculo opcion: opciones)
			opcion.visualiza();
			System.out.println();
			} 
}
