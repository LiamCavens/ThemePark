import customer.Adult;
import org.junit.Before;
import org.junit.Test;
import rides.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Adult adult;
    private Rollercoaster rollercoaster;

    @Before
    public void before() {
        adult = new Adult("Liam", 25, 5.7, 20);
        rollercoaster = new Rollercoaster(5, 12, 4.3, "Brain Clot");
    }

    @Test
    public void hasNameAgeHeightAndWallet() {
        assertEquals("Liam", adult.getName());
        assertEquals(25, adult.getAge());
        assertEquals(5.7, adult.getHeight(), 0.01);
        assertEquals(20, adult.getWallet());
    }

    @Test
    public void customerPayForRide() {
        adult.customerPaysForRide(rollercoaster);
        assertEquals(15, adult.getWallet());
    }
}
