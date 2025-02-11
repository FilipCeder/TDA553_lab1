import java.util.List;

public interface CarCollection<T extends Car> {
    void loadCar(T car);
    T unloadCar();
}