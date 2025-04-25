package com.grupo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    public void testAceleracionNormal() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 120);
        v.acelerar(30); // velocidad_actual = 30
        v.acelerar(20); // velocidad_actual = 50
        v.acelerar(30); // velocidad_actual = 80
        assertEquals(80, v.getVelocidadActual());
    }

    @Test
    public void testAceleracionExcedeVelocidadMaxima() {
        Vehiculo v = new Vehiculo("Honda", "Civic", 120);
        v.acelerar(100); // velocidad_actual = 100
        v.acelerar(30);  // debería limitarse a 120
        assertEquals(120, v.getVelocidadActual());
    }

    @Test
    public void testAceleracionNegativaIgnorada() {
        Vehiculo v = new Vehiculo("Ford", "Focus", 120);
        v.acelerar(50);   // velocidad_actual = 50
        v.acelerar(-10);  // debe ser ignorado
        assertEquals(50, v.getVelocidadActual());
    }

    @Test
    void testPararVehiculo() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 120);
        v.acelerar(80); // Simula que va a 80
        v.parar(); // Llama al método a testear
        assertEquals(0, v.getVelocidadActual(), "La velocidad debe ser 0 después de parar");
    }

}
