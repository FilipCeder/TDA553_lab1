
import org.junit.Test;
import static org.junit.Assert.*;

public class Saab95Test {
    @Test
    public void TestSaab95TurboOn() {
        Saab95 Saab95 = new Saab95();
        Saab95.setTurboOn();
        assertTrue(Saab95.turboOn);
}   
    @Test
    public void TestSaab95TurboOff(){
        Saab95 Saab95 = new Saab95();
        Saab95.setTurboOff();
        assertFalse(Saab95.turboOn);

    }
    @Test
    public void TestSaab95SpeedFactor(){
        Saab95 Saab95 = new Saab95();
        Saab95.setTurboOn();
        assertEquals(   );
    }
    

}
