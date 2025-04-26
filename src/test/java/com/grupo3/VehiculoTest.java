import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiculoTest {
 
  @Test
    void testPararVehiculo() {
     Vehiculo v = new Vehiculo("Toyota", "Corolla", 120);
        v.acelerar(80); // Simula que va a 80
        v.parar(); // Llama al método a testear
        assertEquals(0, v.getVelocidadActual(), "La velocidad debe ser 0 después de parar");

  }

}
