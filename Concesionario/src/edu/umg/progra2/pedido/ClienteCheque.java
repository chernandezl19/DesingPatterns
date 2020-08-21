package edu.umg.progra2.pedido;

public class ClienteCheque extends Cliente{
	
	public Pedido creaPedido( double importe) {
		return new PedidoCheque(importe);
	}
}
