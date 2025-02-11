

import java.util.LinkedList;
import java.util.Queue;

public class RepairShop <T extends Car> implements CarCollection<T> {

    private Queue<T> parkedCars;

    public RepairShop() {
        parkedCars = new LinkedList<>(); 
    }

    @Override
    public void loadCar(T car) {
        parkedCars.add(car);
    }

    @Override
    public T unloadCar() {
        if (!parkedCars.isEmpty()) {
            return parkedCars.remove(); // FIFO removal
        }
        System.out.println("Garage is empty!");
        return null;
    }
}

