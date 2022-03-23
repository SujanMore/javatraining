package MotorBike;

public class MotorBikeRun {
    public static void main(String[] args) {

        MotorBike suzuki = new MotorBike("Hayabusa", 40);

        System.out.println("Speed of " + suzuki.getBikeName() + " is " + suzuki.getSpeed());
    }
}
