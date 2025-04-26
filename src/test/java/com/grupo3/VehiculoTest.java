import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

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
}

