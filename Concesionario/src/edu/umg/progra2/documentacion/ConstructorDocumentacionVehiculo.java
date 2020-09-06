package edu.umg.progra2.documentacion;

public abstract class ConstructorDocumentacionVehiculo {

	public Documentacion documentacion;
	
	public abstract void construyeSolicitudPedido(String nombreCliente);
	
	public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);
	
	public Documentacion resultado() {
		return documentacion;
	}
}
