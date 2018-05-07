import customer.Adult;
import customer.Customer;
import rides.Ride;

import java.util.ArrayList;

public class ThemePark {

    String name;
    ArrayList<Ride> rides;
    ArrayList<Customer> customers;
    int till;

    public ThemePark(String name) {
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

    public int numberOfRides() {
        return this.rides.size();
    }

    public void addGuestToPark(Adult guest) {
        this.customers.add(guest);
    }

    public int numberOfCustomersInPark() {
        return this.customers.size();
    }

    public int getMoneyInTill() {
        return till;
    }

    public boolean guestCanRideRide(Adult customer, Ride ride) {
        if (customer.getAge() >= ride.getMinimumAge() && customer.getHeight() >= ride.getMinimumHeight()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canCustomerPayForRide(Adult customer, Ride ride) {
        if (guestCanRideRide(customer, ride) == true && customer.getWallet() >= ride.getPrice()) {
            return true;
        }
        return false;
    }

    public void moneyAddsToTillWhenGuestPays(Adult customer, Ride ride) {
        if (canCustomerPayForRide(customer, ride) == true) {
            till += ride.getPrice();

        }
    }
}