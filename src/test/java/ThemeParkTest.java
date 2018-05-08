import customer.Adult;
import org.junit.Before;
import org.junit.Test;
import rides.Dodgems;
import rides.GoKarts;
import rides.Ride;
import rides.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themepark;
    Rollercoaster ride1;
    Dodgems ride2;
    GoKarts ride3;
    Adult guest1;
    Adult guest2;

    @Before
    public void before() {
        ride1 = new Rollercoaster(5, 12, 5.5, "Shin Smasher");
        ride2 = new Dodgems(3, 10, 4.5, "Bumping Malkies");
        ride3 = new GoKarts(7, 18, 4.8, "Shin Smasher");
        guest1 = new Adult("Liam", 25, 5.7, 15);
        guest2 = new Adult("Jamie", 17, 4.5, 10);
        themepark = new ThemePark("M&D's");
        themepark.addRidesToPark(ride1);
        themepark.addRidesToPark(ride2);
        themepark.addRidesToPark(ride3);
        themepark.addGuestToPark(guest1);
        themepark.addGuestToPark(guest2);
    }

    @Test
    public void parkHasName() {
        assertEquals("M&D's", themepark.getName());
    }

    @Test
    public void guestCanRideRide() {
        assertEquals(true, themepark.guestCanRideRide(guest1, ride1));
    }

    @Test
    public void getNumberOfRides() {
        assertEquals(3, themepark.getRides().size());
    }

    @Test
    public void getNumberOfGuests() {
        assertEquals(2, themepark.getCustomers().size());
    }

    @Test
    public void customerPaysForRideAndAddsToTill() {
        themepark.moneyAddsToTillWhenGuestPays(guest1, ride1);
        assertEquals(5, themepark.getMoneyInTill());
    }
}
