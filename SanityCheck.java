import org.junit.Test;
import static org.junit.Assert.*;
public class SanityCheck {
    @Test
    public void testCarGasAmount() {
        Saab95 Saab95 = new Saab95(); 
        double oldSpeed = Saab95.getCurrentSpeed();
        Saab95.gas(2);
        assertTrue(oldSpeed == Saab95.getCurrentSpeed());
    }

    @Test
    public void testCarBrakeAmount() {
        Saab95 Saab95 = new Saab95(); 
        double oldSpeed = Saab95.getCurrentSpeed();
        Saab95.brake(2);
        assertTrue(oldSpeed == Saab95.getCurrentSpeed());
    }

    @Test
    public void testCarSpeedLimit() {
        Saab95 Saab95 = new Saab95(); 
        Saab95.setSpeed(Saab95.getEnginePower());
        Saab95.gas(1);
        assertTrue(Saab95.getEnginePower() == Saab95.getCurrentSpeed());
    }

    @Test
    public void testCarGasPositive() {
        Saab95 Saab95 = new Saab95(); 
        Saab95.setSpeed(50);
        Saab95.gas(1);
        assertFalse(Saab95.getCurrentSpeed()<50);
    }

    @Test
    public void testCarBrakeNegative() {
        Saab95 Saab95 = new Saab95(); 
        Saab95.setSpeed(50);
        Saab95.brake(1);
        assertFalse(Saab95.getCurrentSpeed()>50);
    }
}
