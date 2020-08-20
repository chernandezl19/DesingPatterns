package edu.umg.progra2.pedido;

public class ClienteCheque extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoCheque(importe);
    }
}
