package com.grupo3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad_actual;
    private int velocidad_maxima;
    private boolean deportivo;
    private boolean pasajeros;


  public Vehiculo(String marca, String modelo, int velocidad_maxima, boolean deportivo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad_maxima = velocidad_maxima;
        this.velocidad_actual = 0;
        this.deportivo = deportivo;
    }


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
  public boolean esModelo(String modelo) {
        return this.modelo.equalsIgnoreCase(modelo);
    }

  public boolean esMarca(String marca) {
        marca = marca.toUpperCase(); //transforma el String de la marca a comprobar en mayusculas
        this.marca = this.marca.toUpperCase(); //transforma el String de la marca del objeto vehículo a mayusculas
        if (marca.equals(this.marca)) { //compara las dos cadenas de texto en mayusuculas de la marca del vehiculo y de la marca que queremos comprobar.
            return true;
        }else {
            return false;
        }
    }
    
  public boolean esIgual(Vehiculo otro) {
        if (otro == null) return false;
        return this.marca.equalsIgnoreCase(otro.marca) && this.modelo.equalsIgnoreCase(otro.modelo);
    }
    
  public void frenar(int decremento) {
        if (decremento < 0) {
            return; // Ignorar si decremento es negativo
        }else if(velocidad_actual - decremento < 0) {
            velocidad_actual = 0; // Ajustar velocidad a 0 si sería negativa
        } else {
            velocidad_actual -= decremento; // Resta normal en cualquier caso válido
        }
    }
  
  public void parar() {
         velocidad_actual = 0;
     }
  
  //se añade metodo para definir si un coche es deportivo 
  public boolean esDeportivo() {
        return deportivo;
    }
  
  public String getInfo() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Velocidad Actual: " + velocidad_actual +
                ", Velocidad Máxima: " + velocidad_maxima +
                ", Deportivo: " + deportivo +
                ", Pasajeros: " + pasajeros;
    }
}
