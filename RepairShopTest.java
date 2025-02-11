import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Stack;

public class RepairShopTest {
    @Test
    public  void testRepairShopLoad() {
        RepairShop<Volvo240> shop = new RepairShop<>();
        Volvo240 car1 = new Volvo240();
        Stack<Car> testqueue = new Stack<>();
        shop.loadCar(car1);
        shop.getLoadedCars();
        testqueue.add(car1);

    assertEquals(testqueue, shop.getLoadedCars());
        
    }
    @Test
    public  void testRepairShopUnLoad() {
        RepairShop<Volvo240> shop = new RepairShop<>();
        Volvo240 car1 = new Volvo240();
        Stack<Car> testqueue = new Stack<>();
        shop.loadCar(car1);
        shop.unloadCar();
        shop.getLoadedCars();

    assertEquals(testqueue, shop.getLoadedCars());
        
    }


    @Test
    public  void testRepairShopType() {
        RepairShop<Volvo240> shop = new RepairShop<>();
        Saab95 car1 = new Saab95();
        Stack<Car> testqueue = new Stack<>();
        shop.loadCar(car1);
        shop.unloadCar();
        shop.getLoadedCars();

    assertEquals(testqueue, shop.getLoadedCars());
        
    }




    
}
