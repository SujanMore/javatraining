package FlyInterface;

public class Plane implements FlyInterface{

    private final String name;

    public Plane(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is Flying");
    }

    @Override
    public void land() {
        System.out.println(getName() + " is Landing");
    }
}
