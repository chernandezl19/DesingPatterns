package edu.umg.edu.estructuracion_y_comportamiento;

public class PedidoEspa�a extends Pedido {
	protected void calculaIVA() 
	{
		importeIVA = importeSinIVA * 0.21;
	}
}
