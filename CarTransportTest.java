import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;

public class CarTransportTest {
    @Test
    public void testload() {
        CarTransport carTransport = new CarTransport();
        Car car = new Volvo240();
            
        carTransport.loadCar(car);
        assertEquals(car, carTransport.getLoadedCars);
        
}

    @Test
    public void testUnload() {
        CarTransport carTransport = new CarTransport();
        Car car = new Volvo240();
            
        carTransport.loadCar(car);
        carTransport.unloadCar();
        assertEquals(car, carTransport.getLoadedCars);

}
}
