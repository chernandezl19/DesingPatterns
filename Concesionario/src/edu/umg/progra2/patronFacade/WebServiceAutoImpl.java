package edu.umg.progra2.patronFacade;

import java.util.List;

public class WebServiceAutoImpl implements WebServiceAuto {
	protected Catalogo catalogo = new ComponeneteCatalogo();
	protected GestionDocumento gestionDocumento = new ComponentesGestionDocumento();

	public String documento(int indice) {
		return gestionDocumento.documento(indice);
	}

	public List<String> buscaVehiculos(int precioMedio, int desviacionMax) {
		return catalogo.buscaVehiculos(precioMedio - desviacionMax, precioMedio + desviacionMax);
	}
}
