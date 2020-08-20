package edu.umg.progra2.catalogos;

public class ScoterHibrido extends Scooter {

    public ScoterHibrido(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ScooterHibrido[modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + "]";
    }
}
