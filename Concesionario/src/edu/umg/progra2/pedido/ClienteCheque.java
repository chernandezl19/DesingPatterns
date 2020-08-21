package edu.umg.progra2.pedido;

public class ClienteCheque extends Cliente {
	@Override
	protected Pedido creaPedido(double importe) {
// TODO Auto-generated method stub
		return new PedidoCheque(importe);
	}
}
