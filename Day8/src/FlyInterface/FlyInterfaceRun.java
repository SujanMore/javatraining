package FlyInterface;

import java.util.Scanner;

public class FlyInterfaceRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----Enter Type-----");
        System.out.println("1. Plane");
        System.out.println("2. Bird");
        System.out.println("Press:1/2    Exit:-1");

        int type = Integer.parseInt(input.nextLine());

        if(type != -1){
            if(type == 1){
                System.out.print("Enter name of plane: ");
            } else {
                System.out.print("Enter name of bird: ");
            }
            String name = input.nextLine();

            System.out.println("");
            System.out.println("--------------------");

            if(type == 1){
                Plane plane = new Plane(name);
                plane.fly();
                plane.land();
            } else {
                Bird bird = new Bird(name);
                bird.fly();
                bird.land();
            }
            System.out.println("--------------------");
        }
    }
}
