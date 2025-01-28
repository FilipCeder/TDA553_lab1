import java.awt.*;

public class Volvo240new extends Car{

    public double trimFactor;

    public Volvo240new(){
        super(4,Color.black,100,"Volvo240");
        trimFactor = 1.25;
    }

    @Override
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

}
