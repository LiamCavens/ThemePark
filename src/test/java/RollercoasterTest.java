import org.junit.Before;
import org.junit.Test;
import rides.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    
    private Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster(5, 12, 4.5, "Shin Smasher");
    }

    @Test
    public void canRide() {
        assertEquals("I am riding the Shin Smasher", rollercoaster.ride());
    }
}
