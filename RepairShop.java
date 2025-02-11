

import java.util.LinkedList;
import java.util.ArrayList;

public class RepairShop <T extends Car> implements CarCollection<T> {

    private ArrayList<T> parkedCars;

    public RepairShop() {
        parkedCars = new ArrayList<>(); 
    }

    @Override
    public ArrayList<T> getLoadedCars(){
        return parkedCars;
    }


    @Override
    public void loadCar(T car) {
        parkedCars.add(car);
    }

    public boolean unloadCar(T car) {
        return parkedCars.remove(car); 
    }
}

