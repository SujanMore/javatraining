package MotorBike;

public class MotorBikeRun {
    public static void main(String[] args) {

        MotorBike suzuki = new MotorBike("Hayabusa", 40);
        MotorBike bajaj = new MotorBike("Pulsar", 30);

        System.out.println("Speed of " + suzuki.getBikeName() + " is " + suzuki.getSpeed());

        suzuki.setSpeed(100);
        bajaj.increaseSpeed(50);

        System.out.println(suzuki);

        System.out.println(bajaj);
    }
}
