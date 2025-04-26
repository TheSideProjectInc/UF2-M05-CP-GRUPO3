package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;

    public void parar() {
         velocidad_actual = 0;
     }

}
