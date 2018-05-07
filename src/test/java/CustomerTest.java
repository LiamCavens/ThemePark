import customer.Adult;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Adult adult;

    @Before
    public void before() {
        adult = new Adult("Liam", 25, 5.7, 20);
    }

    @Test
    public void hasNameAgeHeightAndWallet() {
        assertEquals("Liam", adult.getName());
        assertEquals(25, adult.getAge());
        assertEquals(5.7, adult.getHeight(), 0.01);
        assertEquals(20, adult.getWallet());
    }
}
