package edu.umg.progra2.documentacionCliente;

public class SolicitudMatriculacion extends Documento {

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("imprime la solicitud de matriculacion "+contenido);

	}

	@Override
	public void visualiza() {
		// TODO Auto-generated method stub
		System.out.println("muestra la solicitud de matriculacion "+contenido);
	}

}
