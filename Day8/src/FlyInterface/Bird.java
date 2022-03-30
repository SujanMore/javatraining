package FlyInterface;

public class Bird implements FlyInterface{

    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings.");
        System.out.println(getName() + " is now flying");
    }

    @Override
    public void land() {
        System.out.println(getName() + " has landed on a branch");
    }
}
