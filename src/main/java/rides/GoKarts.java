package rides;

public class GoKarts extends Ride {

    String name;

    public GoKarts(int price, int minimumAge, double minimumHeight, String name) {
        super(price, minimumAge, minimumHeight);
        this.name = name;
    }
}
