package rides;

public class Dodgems extends Ride {

    String name;

    public Dodgems(int price, int minimumAge, double minimumHeight, String name) {
        super(price, minimumAge, minimumHeight);
        this.name = name;
    }
}
