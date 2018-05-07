package rides;

public class Dodgems extends Ride implements Rideable {

    String name;

    public Dodgems(int price, int minimumAge, double minimumHeight, String name) {
        super(price, minimumAge, minimumHeight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String ride(){
        return "I am bashing on the" + this.name;
    }

}
