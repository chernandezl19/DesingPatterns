package edu.umg.progra2.documentacion;

public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoHTML() {
		documentacion = new DocumentacionHTML();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "<HTML>Solicitud  de pedido de cliente +" + nombreCliente + "</HTML>";
		documentacion.agregarDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento = "<HTML>Solicitud  de matriculacion de solicitante +" + nombreSolicitante + "</HTML>";
		documentacion.agregarDocumento(documento);

	}

}
