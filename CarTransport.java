import java.awt.*;

public class CarTransport extends FlatBedCar{


    public CarTransport(){
        super(2,Color.green,100,"MercedesLPS338",1);
    }

    //angle 0 means the ramp is raised
    @Override
    public void raiseAngle(double var){
        setAngle(0);
    }

    //Angle 1 means ramp is lowered. cannot lower if moving
    @Override
    public void lowerAngle(double var){
        if (getCurrentSpeed() == 0){
            setAngle(1);
        }

    }
}