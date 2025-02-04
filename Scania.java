import java.awt.*;

public class Scania extends Car{

    private double angle;

    public Scania(){
        super(2,Color.blue,100,"Scania");
        angle = 0;
    }

    public double getAngle(){
        return angle;
    }

    public void setAngle(int newAngle){
        if (getCurrentSpeed() == 0){
            if(newAngle > 70) {
                angle = 70;
            }
            else if(newAngle < 0) {
                angle = 0;
            }
            else{
                angle = newAngle;
            }
        }
  
    }


    @Override
    public void startEngine(){
        if (getAngle() == 0){
            currentSpeed = 0.1;
        }
	        
    }
    

}
