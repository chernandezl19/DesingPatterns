package edu.umg.progra2.catalogos;

public class ScooterDisel extends Scooter {

    public ScooterDisel(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ScooterDisel[modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
    }
}
