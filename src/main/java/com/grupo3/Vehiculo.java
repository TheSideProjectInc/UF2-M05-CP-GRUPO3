package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;

    public String getInfo() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Velocidad Actual: " + velocidad_actual +
                ", Velocidad Máxima: " + velocidad_maxima +
                ", Deportivo: " + deportivo +
                ", Pasajeros: " + pasajeros;
    }
  
}
