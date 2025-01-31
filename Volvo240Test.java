
import org.junit.Test;
import static org.junit.Assert.*;

public class Volvo240Test {


    @Test
    public void testVolvo240SpeedFactor(){
        Volvo240 Volvo240 = new Volvo240();
        Volvo240.speedFactor();
        assertEquals(100*0.01*1.25, Volvo240.speedFactor(), 0.01);
        
    }
    
    @Test
    public void testVolvo240TurnLeft() {
        Volvo240 volvo240 = new Volvo240();

        int[] expectedDirections = {3, 2, 1, 0};
        
        for (int expectedDirection : expectedDirections) {
            volvo240.turnLeft();
            assertEquals(expectedDirection, volvo240.getDirection());
        }
    }


    @Test
    public void testVolvo240TurnRight() {
        Volvo240 volvo240 = new Volvo240();

        int[] expectedDirections = {1, 2, 3, 0}; 
        
        for (int expectedDirection : expectedDirections) {
            volvo240.turnRight();
            assertEquals(expectedDirection, volvo240.getDirection());
        }
    }

    @Test
    public void testVolvo240Move() {
        Volvo240 volvo240 = new Volvo240();
        volvo240.startEngine();

        int[] directions = {0, 1, 2, 3};
        double[][] expectedPositions = {
            {0, 0.1}, 
            {0.1, 0.1}, 
            {0.1, 0}, 
            {0, 0} 
        };

        for (int i = 0; i < directions.length; i++) {
            volvo240.move(); 
            volvo240.turnRight();

            assertEquals(expectedPositions[i][0], volvo240.getPosX(), 0.01); 
            assertEquals(expectedPositions[i][1], volvo240.getPosY(), 0.01); 
        }
    }
    

}
