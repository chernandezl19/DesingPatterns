package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaCirculacion extends Documento{

	@Override
	public void imprime() {
		System.out.println("imprime la solicitud de tarjeta de circulacion "+contenido);

	}

	@Override
	public void visualiza() {
		System.out.println("muestra la solicitud de tarjeta de circulacion "+contenido);
		
	}

}
