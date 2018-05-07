package rides;

public abstract class Ride {

    int price;
    int minimumAge;
    double minimumHeight;

    public Ride(int price, int minimumAge, double minimumHeight) {
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
