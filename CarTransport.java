import java.awt.*;
import java.util.*;
public class CarTransport<T extends Car> extends FlatBedCar implements CarCollection<T> {
    Stack<T> carTransportBed = new Stack<>();

    public CarTransport(){
        super(2,Color.green,100,"MercedesLPS338",1);
        setHeavyVehicle();
    }

    //angle 0 means the ramp is raised
    
    public void raiseAngle(){
        setAngle(0);
    }

    //Angle 1 means ramp is lowered. cannot lower if moving
    public void lowerAngle(){
        if (getCurrentSpeed() == 0){
            setAngle(1);
        }

    }

    //Car transport capacity is 4 cars. If car is within +- meter of transport loading is permitted.
    @Override
    public void loadCar(T car){
        if (carTransportBed.size() <= 4 && getAngle() == 1 && car.getPosX() > getPosX() - 1 && car.getPosX() < getPosX() + 1 && car.getPosY() > getPosY() - 1 && car.getPosY() < getPosY() + 1 && car.getHeavyVehicle() == false){ 
            carTransportBed.push(car);
        }
    }

    public Stack<T> getLoadedCars(){
        return carTransportBed;
    }

    @Override
    public T unloadCar(){
        if (!carTransportBed.isEmpty() && getAngle() == 1 ){
            return carTransportBed.pop();
        }
        return null;
    }

    public void move() {
        super.move();
        double transportX = getPosX();
        double transportY = getPosY();

        for (int i = 0; i < carTransportBed.size();i++){
            carTransportBed.get(i).setPos(transportX,transportY);
        }
    }
}