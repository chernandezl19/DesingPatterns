package edu.umg.progra2.pedido;

public class ClientePagoCheque extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		// TODO Auto-generated method stub
		return new PedidoPagoCheque(importe);
	}

}
