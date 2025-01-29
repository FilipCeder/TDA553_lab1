
import org.junit.Test;
import static org.junit.Assert.*;

public class Saab95Test {
    @Test
    public void TestSaab95TurboOn() {
        Saab95 saab95 = new Saab95();
        saab95.setTurboOn();
        assertTrue(saab95.turboOn);
}   
    @Test
    public void TestSaab95TurboOff(){
        Saab95 saab95 = new Saab95();
        saab95.setTurboOff();
        assertFalse(saab95.turboOn);

    }
    @Test
    public void TestSaab95SpeedFactor(){
        Saab95 saab95 = new Saab95();
        saab95.setTurboOn();
        saab95.speedFactor();
        assertEquals(125*0.01*1.3, saab95.speedFactor(), 0.01);

        saab95.setTurboOff();
        saab95.speedFactor();
        assertEquals(125*0.01*1.0, saab95.speedFactor(),0.01);
        
    }
  
    @Test
    public void testsaab95TurnLeft() {
        Saab95 saab95 = new Saab95();
        saab95.setDirection(0);

        int[] expectedDirections = {3, 2, 1, 0};
        
        for (int expectedDirection : expectedDirections) {
            saab95.turnLeft();
            assertEquals(expectedDirection, saab95.getDirection());
        }
    }


    @Test
    public void testsaab95TurnRight() {
        Saab95 saab95 = new Saab95();
        saab95.setDirection(0);

        int[] expectedDirections = {3, 2, 1, 0}; 
        
        for (int expectedDirection : expectedDirections) {
            saab95.turnLeft();
            assertEquals(expectedDirection, saab95.getDirection());
        }
    }

    @Test
    public void testsaab95Move() {
        Saab95 saab95 = new Saab95();
        saab95.startEngine();

        int[] directions = {0, 1, 2, 3};
        double[][] expectedPositions = {
            {0, 0.1}, 
            {0.1, 0.1}, 
            {0.1, 0}, 
            {0, 0} 
        };

        for (int i = 0; i < directions.length; i++) {
            saab95.setDirection(directions[i]);
            saab95.move(); 

            assertEquals(expectedPositions[i][0], saab95.getPosX(), 0.01); 
            assertEquals(expectedPositions[i][1], saab95.getPosY(), 0.01); 
        }
    }
}