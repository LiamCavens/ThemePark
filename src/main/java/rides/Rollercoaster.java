package rides;

public class Rollercoaster extends Ride {

    String name;

    public Rollercoaster(int price, int minimumAge, double minimumHeight, String name) {
        super(price, minimumAge, minimumHeight);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
