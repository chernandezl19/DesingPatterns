package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaCirculacion extends Documento{
	
	public void imprime() {
		System.out.println("Imprime la solicitud de circulacion " + contenido);
	}
	
	public void visualiza() {
		System.out.println("Muestra la solicitud de circulacion " + contenido);
	}
}
