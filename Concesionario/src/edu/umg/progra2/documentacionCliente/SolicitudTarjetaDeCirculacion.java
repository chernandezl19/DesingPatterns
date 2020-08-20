package edu.umg.progra2.documentacionCliente;

public class SolicitudTarjetaDeCirculacion extends Documento{

    @Override
    public void imprime() {
        System.out.println("Imprime la solicitud de tarejeta de circulacion " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Visualiza la solicitud de tarjeta de circulacion " + contenido);
    }
}
