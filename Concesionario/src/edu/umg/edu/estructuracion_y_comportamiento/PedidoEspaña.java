package edu.umg.edu.estructuracion_y_comportamiento;

public class PedidoEspaña extends Pedido {
	protected void calculaIVA() 
	{
		importeIVA = importeSinIVA * 0.21;
	}
}
