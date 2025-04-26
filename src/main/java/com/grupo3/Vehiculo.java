package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;


    public boolean esIgual(Vehiculo otro) {
        if (otro == null) return false;
        return this.marca.equalsIgnoreCase(otro.marca) && this.modelo.equalsIgnoreCase(otro.modelo);
    }
}
