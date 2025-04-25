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

    public boolean esMarca(int marca) {
        // metodo para comparar si la marca del vehículo coincide con el valor introducido
    }
}


