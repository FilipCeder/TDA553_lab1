import java.util.Collection;

public interface CarCollection<T extends Car> {
    void loadCar(T car);
    T unloadCar();
    Collection<T> getLoadedCars();
}