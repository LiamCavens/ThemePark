import customer.Adult;
import customer.Customer;
import rides.Ride;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Ride> rides;
    private ArrayList<Customer> customers;
    private int till;

    ThemePark(String name) {
        this.name = name;
        rides = new ArrayList<>();
        customers = new ArrayList<>();
        till = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addRidesToPark(Ride ride) {
        this.rides.add(ride);
    }

    public void addGuestToPark(Adult guest) {
        this.customers.add(guest);
    }

    public int getMoneyInTill() {
        return till;
    }

    public boolean guestCanRideRide(Adult customer, Ride ride) {
        return customer.getAge() >= ride.getMinimumAge() && customer.getHeight() >= ride.getMinimumHeight();
    }

    private boolean canCustomerPayForRide(Adult customer, Ride ride) {
        return guestCanRideRide(customer, ride) && customer.getWallet() >= ride.getPrice();
    }

    public void moneyAddsToTillWhenGuestPays(Adult customer, Ride ride) {
        if (canCustomerPayForRide(customer, ride)) till += ride.getPrice();
    }
}