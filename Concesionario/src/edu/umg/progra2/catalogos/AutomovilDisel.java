package edu.umg.progra2.catalogos;

public class AutomovilDisel extends Automovil{
    public AutomovilDisel(String modelo, String color, int potencia, double espacio){
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "AutomovilDisel [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + ", espacio="
                + espacio + "]";
    }

    }

