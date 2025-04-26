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
  public void testEsDeportivo() {
    Vehiculo v1 = new Vehiculo("Ferrari", "488", 300, true, 2);
    Vehiculo v2 = new Vehiculo("Toyota", "Corolla", 120, false, 5);

    assertTrue(v1.esDeportivo(), "Ferrari debe ser deportivo");
    assertFalse(v2.esDeportivo(), "Toyota no debe ser deportivo");
  }
}
