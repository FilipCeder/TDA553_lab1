import java.awt.*;

public class CarTransport extends FlatBedCar{


    public CarTransport(){
        super(2,Color.green,100,"MercedesLPS338",1);
    }

    @Override
    public void raiseAngle(double var){
        setAngle(0);
    }

    @Override
    public void lowerAngle(double var){
        if (getCurrentSpeed() == 0){
            setAngle(1);
        }

    }
}