package rides;

public class GoKarts extends Ride implements Rideable {

    String name;

    public GoKarts(int price, int minimumAge, double minimumHeight, String name) {
        super(price, minimumAge, minimumHeight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String ride(){
        return "I am go-karting in the " + this.name;
    }


}
