package edu.umg.progra2.documentacionCliente;

public class OrdenDePedido extends Documento {

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("imprime la orden de pedido: "+contenido);
	}

	@Override
	public void visualiza() {
		System.out.println("muestra la orden de pedido: "+contenido);
	}

}
