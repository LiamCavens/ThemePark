import org.junit.Before;
import org.junit.Test;
import rides.Dodgems;
import rides.GoKarts;
import rides.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class RideTest {

    Rollercoaster ride1;
    GoKarts ride2;
    Dodgems ride3;

    @Before
    public void before() {
        ride1 = new Rollercoaster(5, 14, 5.2, "Whistling Grandma");
        ride2 = new GoKarts(8, 18, 4.5, "Formula 4 Racing");
        ride3 = new Dodgems(3, 10, 4.5, "Bashing Dodgems");
    }

    @Test
    public void rideHasName() {
        assertEquals("Whistling Grandma", ride1.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(3, ride3.getPrice());
    }

    public void hasMinumumAge(){
        assertEquals(14, ride1.getMinimumAge());
    }

    @Test
    public void hasHeightRestriction() {
        assertEquals(4.5, ride2.getMinimumHeight(), 0.01);
    }
}
