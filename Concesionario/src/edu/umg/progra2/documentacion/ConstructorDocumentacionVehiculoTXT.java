package edu.umg.progra2.documentacion;

public class ConstructorDocumentacionVehiculoTXT extends ConstructorDocumentacionVehiculo{
	
	public ConstructorDocumentacionVehiculoTXT() {
		documentacion = new DocumentacionTXT();
	}
	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "<TXT>Solicitud  de pedido de cliente +" + nombreCliente + "</TXT>";
		documentacion.agregarDocumento(documento);
		
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento = "<TXT>Solicitud  de matriculacion de solicitante +" + nombreSolicitante + "</TXT>";
		documentacion.agregarDocumento(documento);
		
	}

}
