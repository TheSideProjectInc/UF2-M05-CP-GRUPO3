package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;

    public Vehiculo(String marca, String modelo, int velocidad_maxima, int velocidad_actual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad_maxima = velocidad_maxima;
        this.velocidad_actual = velocidad_actual;
    }

    public void frenar(int decremento) {
        if (decremento < 0) {
            return;
        }else if(velocidad_actual - decremento < 0) {
            velocidad_actual = 0;
        } else {
            velocidad_actual -= decremento;
        }
    }

    public int getVelocidadActual() {
        return velocidad_actual;
    }
}
