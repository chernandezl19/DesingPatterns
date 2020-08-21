package edu.umg.progra2.documentacion;

public class ConstructorDocumentacionVehiculoTXT extends ConstructorDocumentacionVehiculo{
	
	public ConstructorDocumentacionVehiculoTXT() {
		documentacion = new DocumentacionTXT();
	}
	
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "<TXT>Solicitud de pedido de cliente +" + nombreCliente + "</TXT>";
		documentacion.agregarDocumento(documento);
	}
	
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento = String.format("<TXT>Solicitud de matriculacion de solicitante +%s </TXT>", nombreSolicitante);
		documentacion.agregarDocumento(documento);
	}
}
