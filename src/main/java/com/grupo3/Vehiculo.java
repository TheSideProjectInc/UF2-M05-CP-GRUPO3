package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;


public void acelerar(int incremento) {
    // Validar que el incremento no sea negativo
    if (incremento < 0) {
        System.out.println("Error: No se puede acelerar con un valor negativo.");
        return;
    }

    // Se aumenta la velocidad sin superar el límite máximo
    velocidad_actual += incremento;

    // Se ajusta si supera la velocidad máxima permitida
    if (velocidad_actual > velocidad_maxima) {
        velocidad_actual = velocidad_maxima;
 }
}
