package edu.umg.progra2.pedido;

public class Usuario {

	public static void main(String[] args) {
		Cliente cliente;
		cliente = new ClienteContado();
		cliente.nuevoPedido(2000);
		cliente.nuevoPedido(10000);
		Cliente cliente2 = new ClienteCredito();
		cliente2.nuevoPedido(2000);
		cliente2.nuevoPedido(10000);
		Cliente cliente3 = new ClienteCheque();
		cliente3.nuevoPedido(1500);
		cliente3.nuevoPedido(1500);

	}

}
