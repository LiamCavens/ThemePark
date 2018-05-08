package customer;

import rides.Ride;

public class Adult extends Customer {

    private int wallet;


    public Adult(String name, int age, double height, int wallet) {
        super(name, age, height);
        this.wallet = wallet;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void customerPaysForRide(Ride ride){
        this.wallet -= ride.getPrice();

    }
}
