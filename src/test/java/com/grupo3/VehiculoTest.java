package com.grupo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {
    @Test
    public void testMarcaCoincide(){
        Vehiculo vehiculo = new Vehiculo("Chevrolet", "Camaro", 100);
        assertTrue(vehiculo.esMarca("chevrolet"));
    }
}
