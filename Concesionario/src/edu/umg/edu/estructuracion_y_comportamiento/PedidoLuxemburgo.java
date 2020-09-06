package edu.umg.edu.estructuracion_y_comportamiento;

public class PedidoLuxemburgo extends Pedido
{
	protected void calculaIVA() 
	{
		importeIVA = importeSinIVA * 0.15;
		
	}
}
