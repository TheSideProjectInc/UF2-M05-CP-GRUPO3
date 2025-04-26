package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;

    public int getVelocidadActual() {
        return velocidad_actual;
    }
    
    public void setVelocidadActual(int velocidad_actual) {
        if (velocidad_actual >= 0 && velocidad_actual <= this.velocidad_maxima) {
            this.velocidad_actual = velocidad_actual;
    }
        
    }
}
