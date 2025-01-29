import java.awt.*;


public class Car implements Movable{

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public double posX;
    public double posY;
    public int direction;
    
    public Car(int doors, Color carColor, int power, String model){
        nrDoors = doors;
        color = carColor;
        enginePower = power;
        modelName = model;
        posX = 0;
        posY = 0;
        direction = 0;
        stopEngine();
    }
    
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public int getDirection(){
        return direction;
    }

    public double getPosX(){
        return posX;
    }

    public double getPosY(){
        return posY;
    }

    private void setPos(double x, double y){
        posX = x;
        posY = y;
    }

    private void setDirection(int newDirection){
        direction = newDirection;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public double speedFactor() {
        return enginePower * 0.01; 
    }

    private void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    private void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    public void move(){
        direction = getDirection();
        posX = getPosX();
        posY = getPosY();
        currentSpeed = getCurrentSpeed();
        if (direction == 0) {
            setPos(posX, posY+currentSpeed);
        }
        else if (direction == 1) {
            setPos(posX+currentSpeed, posY);
        }
        else if (direction == 2) {
            setPos(posX, posY-currentSpeed);
        }
        else if (direction == 3) {
            setPos(posX-currentSpeed, posY);
        }
    }

    public void turnLeft(){
        int[] directions = {0,1,2,3};
        setDirection(directions[direction-1]);
    }
    
    public void turnRight(){
        int[] directions = {0,1,2,3};
        setDirection(directions[direction+1]);
    }
    
}
