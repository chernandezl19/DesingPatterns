package edu.umg.progra2.documentacion;

public class Vendedor {
	
	protected ConstructorDocumentacionVehiculo constructor;

	public Vendedor(ConstructorDocumentacionVehiculo constructor) {
		this.constructor = constructor;
	}
	
	public Documentacion construye(String nombreCliente) {
		constructor.construyeSolicitudPedido(nombreCliente);
		constructor.construyeSolicitudMatriculacion(nombreCliente);
		return constructor.resultado();
	}

}
