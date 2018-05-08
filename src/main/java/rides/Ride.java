package rides;

public abstract class Ride {

    private int price;
    private int minimumAge;
    private double minimumHeight;

    Ride(int price, int minimumAge, double minimumHeight) {
        this.price = price;
        this.minimumAge = minimumAge;
        this.minimumHeight = minimumHeight;
    }

    public int getPrice() {
        return price;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public double getMinimumHeight() {
        return minimumHeight;
    }
}
