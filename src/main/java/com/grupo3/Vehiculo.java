package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;

    public Vehiculo(String marca, String modelo, int velocidad_maxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad_maxima = velocidad_maxima;
        this.velocidad_actual = 0;
    }

    public void acelerar(int incremento) {
        if (incremento < 0) {
            // Ignorar aceleración negativa
            return;
        }

        velocidad_actual += incremento;

        if (velocidad_actual > velocidad_maxima) {
            velocidad_actual = velocidad_maxima;
        }
    }

    public int getVelocidadActual() {
        return velocidad_actual;
    }

    public void parar() {
        velocidad_actual = 0;
    }


}


