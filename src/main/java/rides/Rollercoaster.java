package rides;

public class Rollercoaster extends Ride implements Rideable{

    String name;

    public Rollercoaster(int price, int minimumAge, double minimumHeight, String name) {
        super(price, minimumAge, minimumHeight);
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String ride() {
        return "I am riding the " + this.name;
    }
}
