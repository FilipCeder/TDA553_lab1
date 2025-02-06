import java.awt.*;
import java.util.*;
public class CarTransport extends FlatBedCar{
    Stack<Car> carTransportBed = new Stack<>();

    public CarTransport(){
        super(2,Color.green,100,"MercedesLPS338",1);
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
    public void loadCar(Car car){
        if (carTransportBed.size() <= 4 && getAngle() == 1 && car.getPosX() > getPosX() - 1 && car.getPosX() < getPosX() + 1 && car.getPosY() > getPosY() - 1 && car.getPosY() < getPosY() + 1){ 
            carTransportBed.push(car);
        }
    }

    public Stack<Car> getLoadedCars(){
        return carTransportBed;
    }

    public void unloadCar(){
        if (carTransportBed.size() > 0 && getAngle() == 1 ){
            carTransportBed.pop();
        }
    }

    public void move() {
        super.move();
        move();
        double transportX = getPosX();
        double transportY = getPosY();

        for (int i = 0; i < carTransportBed.size();i++){
            carTransportBed.get(i).setPos(transportX,transportY);
        }
    }
}