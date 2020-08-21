package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaDeCirculacion extends Documento {

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("imprime la solicitud de tarjeta de circulación "+contenido);

	}

	@Override
	public void visualiza() {
		// TODO Auto-generated method stub
		System.out.println("muestra la solicitud de tarjeta de circulación "+contenido);
	}

}
