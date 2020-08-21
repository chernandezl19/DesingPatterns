package edu.umg.progra2.documentacion;

public abstract class ConstructorDocumentacionVehiculo {

	public Documentacion documentacion;
	
	public abstract void construyeSolicitudPedido(String nombreCliente);
	
	public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);
	
	public void construyeSolicitudTarjetaCirculacion(String nombreSolicitante) {
		// TODO Auto-generated method stub
		
	}
	
	public Documentacion resultado() {
		return documentacion;
	}

	
}
