package edu.umg.progra2.patronIterador;
import java.util.List;
public abstract class Iterador
	<TElemento> extends Elemento{

	public Iterador(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}

	protected String palabraClaveConsulta;
	protected int indice;
	protected List<TElemento> contenido;
	
	public void setPalabraClaveConsulta(String palabraClaveConsulta, List<TElemento> contenido)

	{
	this.palabraClaveConsulta = palabraClaveConsulta;
	this.contenido = contenido;
	}
	public void inicio()
	{
		indice = 0;
		int tamaño = contenido.size();
		while ((indice < tamaño) && (!((Elemento) contenido.get(indice)).palabraClaveValida (palabraClaveConsulta)))
			indice++;
	}
	
	public void siguiente()
	{
		int tamaño = contenido.size();
		indice++;
		while ((indice < tamaño) && (!((Elemento) contenido.get(indice)).palabraClaveValida (palabraClaveConsulta)))
			indice++;
		}
	
	public TElemento item()
	{
		if (indice < contenido.size())
			return contenido.get (indice);
		else
			return null;
	}
	}

