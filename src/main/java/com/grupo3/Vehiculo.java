package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;

    public int getVelocidadMaxima() {
        return velocidad_maxima;
    }

    public void setVelocidadMaxima(int velocidad_maxima) {
        if (velocidad_maxima > 0) {
            this.velocidad_maxima = velocidad_maxima;
        }
    }
}
