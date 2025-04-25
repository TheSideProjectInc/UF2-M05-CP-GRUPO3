import com.grupo3.Vehiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    public void testConstructor() {
        // Verificar que el constructor inicializa correctamente
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        Assertions.assertEquals("Toyota", vehiculo.getMarca());
        Assertions.assertEquals("Corolla", vehiculo.getModelo());
    }

    @Test
    public void testSettersAndGetters() {
        // Verificar los setters y getters
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        vehiculo.setMarca("Honda");
        vehiculo.setModelo("Civic");
        Assertions.assertEquals("Honda", vehiculo.getMarca());
        Assertions.assertEquals("Civic", vehiculo.getModelo());
    }

    @Test
    public void testMostrarDetalles() {
        // Este test podría verificar la salida de mostrarDetalles
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        vehiculo.mostrarDetalles();
    }

    @Test
    public void testEsDeportivo() {
        Vehiculo v1 = new Vehiculo("Ferrari", "488", 300, true, 2);
        Vehiculo v2 = new Vehiculo("Toyota", "Corolla", 120, false, 5);

        assertTrue(v1.esDeportivo(), "Ferrari debe ser deportivo");
        assertFalse(v2.esDeportivo(), "Toyota no debe ser deportivo")
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
}
