package edu.umg.progra2.catalogos;

public class FabricaVehiculoDisel implements FabricaVehiculo {
    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilDisel(modelo,color,potencia,espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterDisel(modelo,color,potencia);
    }
}
