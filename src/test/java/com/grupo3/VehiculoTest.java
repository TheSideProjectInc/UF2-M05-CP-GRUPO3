import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

@Test
public void testEsDeportivo() {
    Vehiculo v1 = new Vehiculo("Ferrari", "488", 300, true, 2);
    Vehiculo v2 = new Vehiculo("Toyota", "Corolla", 120, false, 5);

    assertTrue(v1.esDeportivo(), "Ferrari debe ser deportivo");
    assertFalse(v2.esDeportivo(), "Toyota no debe ser deportivo");
  }

}
