package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaCirculacion extends Documento{

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("Imprime la solicitud de Tarjeta de Circulacion "+contenido);
	}

	@Override
	public void visualiza() {
		// TODO Auto-generated method stub
		System.out.println("Muestre la solicitud de Tarjeta de Circulacion "+contenido);
	}

}
