package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaCirculacion extends Documento {
	@Override
	public void imprime() {
		System.out.println("imprime la Tarjeta de Circulaci�n " + contenido);
	}

	@Override
	public void visualiza() {
// TODO Auto-generated method stub
		System.out.println("muestra la Tarjeta de Circulaci�n " + contenido);
	}
}