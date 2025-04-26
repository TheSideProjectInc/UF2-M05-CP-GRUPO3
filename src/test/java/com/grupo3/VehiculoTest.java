import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

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
}

