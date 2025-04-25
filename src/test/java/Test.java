import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    public void testAcelerarIncrementaVelocidad() {
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 180);
        v.acelerar(20);
        assertEquals(20, v.getVelocidadActual());
    }
}

