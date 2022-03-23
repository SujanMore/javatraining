package MotorBike;

public class MotorBike {

    private String bikeName;                        //Instance Variables of the Class Motor Bike
    private int speed;

    MotorBike(){                                    //Contructor with no argument
        this("Dummy", 10);
    }

    MotorBike(String bikeName, int speed) {
        this.bikeName = bikeName;
        this.speed = speed;
    }

    public String getBikeName(){
        return this.bikeName;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
