package edu.umg.progra2.documentacion;

public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoPDF() {
		documentacion = new DocumentacionPDF();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento = "<PDF>Solicitud  de pedido de cliente +" + nombreCliente + "</PDF>";
		documentacion.agregarDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento = "<PDF>Solicitud  de matriculacion de solicitante +" + nombreSolicitante + "</PDF>";
		documentacion.agregarDocumento(documento);

	}

}
