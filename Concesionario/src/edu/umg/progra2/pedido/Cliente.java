package edu.umg.progra2.pedido;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

	protected List<Pedido> pedidos = new ArrayList<Pedido>();
	
	protected abstract Pedido creaPedido(double importe);
	
	public void nuevoPedido(double importe) {
		Pedido pedido = this.creaPedido(importe);
		if (pedido.valida()) {
			pedido.paga();
			pedidos.add(pedido);
		}
	}
}
