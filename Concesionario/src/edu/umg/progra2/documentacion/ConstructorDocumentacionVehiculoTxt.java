package edu.umg.progra2.documentacion;

public class ConstructorDocumentacionVehiculoTxt extends ConstructorDocumentacionVehiculo{

	public ConstructorDocumentacionVehiculoTxt() {
		documentacion = new DocumentacionTxt();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "<txt>Solicitud  de pedido de cliente +" + nombreCliente + "<txt>";
		documentacion.agregarDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento = "<txt>Solicitud  de matriculacion de solicitante +" + nombreSolicitante + "<txt>";
		documentacion.agregarDocumento(documento);

	}
	
	
	
	
	
	
	
}
