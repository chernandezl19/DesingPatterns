package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaCirculacion extends Documento {
	
	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("imprime la solicitud de la tarjeta de circulaci�n "+contenido);

	}

	@Override
	public void visualiza() {
		// TODO Auto-generated method stub
		System.out.println("muestra la solicitud de la tarjeta de circulaci�n "+contenido);
	}

}
