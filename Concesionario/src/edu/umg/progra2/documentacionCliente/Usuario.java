package edu.umg.progra2.documentacionCliente;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
		documentacionEnBlanco.incluye(new OrdenDePedido());
		documentacionEnBlanco.incluye(new CertificacionCesion());
		documentacionEnBlanco.incluye(new SolicitudMatriculacion());
		//creacion documentacion para 2 nuevos clientes
		DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Juan Perez");
		DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Pedro Molina");
		documentacionCliente1.visualiza();
		documentacionCliente2.visualiza();
	}

}
