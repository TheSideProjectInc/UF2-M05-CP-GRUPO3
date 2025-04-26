package com.grupo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {
    
  @Test
    public void testMarcaCoincide(){
        Vehiculo vehiculo = new Vehiculo("Chevrolet", "Camaro", 100);
        assertTrue(vehiculo.esMarca("chevrolet"));
    }
    
  @Test
    public void testAceleracionNormal() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 50, 120, false, 5);
        v.acelerar(30); // Acelerar de 50 a 80
        assertEquals(80, v.getVelocidadActual(), "La aceleración debe aumentar correctamente");
    }
    
  @Test
    public void testAceleracionExcedeMaximo() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 100, 120, false, 5);
        v.acelerar(30); // Intentar acelerar más allá del límite
        assertEquals(120, v.getVelocidadActual(), "La velocidad no debe superar el máximo permitido");
    }
    
  @Test
    public void testAceleracionNegativa() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 50, 120, false, 5);
        v.acelerar(-10); // Intentar acelerar con un valor negativo
        assertEquals(50, v.getVelocidadActual(), "La velocidad debe permanecer igual si el incremento es negativo");
    }
    
  @Test
    public void testFrenoNormal() {
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus", 100,80);
        vehiculo.frenar(10); // velocidad_actual = 70
        vehiculo.frenar(20); // velocidad_actual = 50
        assertEquals(50,vehiculo.getVelocidadActual());
    }
    
  @Test
    public void testFrenoNegativoIgnorado(){
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus", 100,80);
        vehiculo.frenar(-10);
        assertEquals(80,vehiculo.getVelocidadActual());
    }
 
  @Test
    public void testFrenoMaximo(){
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus", 100,80);
        vehiculo.frenar(20); //velocidad actual 60
        vehiculo.frenar(20); //velocidad actual 40
        vehiculo.frenar(10); //velocidad actual 30
        vehiculo.frenar(40); //velocidad actual 0
        assertEquals(0,vehiculo.getVelocidadActual());
    }
    
  @Test
    void testPararVehiculo() {
     Vehiculo v = new Vehiculo("Toyota", "Corolla", 120);
        v.acelerar(80); // Simula que va a 80
        v.parar(); // Llama al método a testear
        assertEquals(0, v.getVelocidadActual(), "La velocidad debe ser 0 después de parar");

  }
      
  @Test
    public void testGetInfo() {
        Vehiculo v = new Vehiculo("Tesla", "Model S", 250, true, 5);
        String info = v.getInfo();

        assertTrue(info.contains("Tesla"));
        assertTrue(info.contains("Model S"));
        assertTrue(info.contains("250"));
        assertTrue(info.contains("true"));
        assertTrue(info.contains("5"));
    }
 
  @Test
  public void testEsDeportivo() {
    Vehiculo v1 = new Vehiculo("Ferrari", "488", 300, true, 2);
    Vehiculo v2 = new Vehiculo("Toyota", "Corolla", 120, false, 5);

    assertTrue(v1.esDeportivo(), "Ferrari debe ser deportivo");
    assertFalse(v2.esDeportivo(), "Toyota no debe ser deportivo");
  }
}
