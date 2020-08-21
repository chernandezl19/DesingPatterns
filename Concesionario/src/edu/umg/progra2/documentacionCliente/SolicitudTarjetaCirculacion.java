package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaCirculacion extends Documento {

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("imprime la solicitud para Tarjeta de Circulacion "+contenido);

	}

	@Override
	public void visualiza() {
		// TODO Auto-generated method stub
		System.out.println("muestra la solicitud para Tarjeta de Circulacion "+contenido);
	}

}

