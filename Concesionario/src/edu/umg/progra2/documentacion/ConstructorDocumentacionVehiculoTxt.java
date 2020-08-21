package edu.umg.progra2.documentacion;

public class ConstructorDocumentacionVehiculoTxt extends ConstructorDocumentacionVehiculo {
	public ConstructorDocumentacionVehiculoTxt() {
		documentacion = new DocumentacionTxt();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
// TODO Auto-generated method stub
		String documento = "<Txt>Solicitud de pedido de cliente +" + nombreCliente + "</Txt>";
		documentacion.agregarDocumento(documento);
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
// TODO Auto-generated method stub
		String documento = "<Txt>Solicitud de matriculacion de solicitante +" + nombreSolicitante + "</Txt>";
		documentacion.agregarDocumento(documento);
	}
}