import java.util.Scanner;

public class FindAngle {

    static int findThirdAngle(int angle1, int angle2){
        return (180 - (angle1 + angle2));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Angle: ");
        int angle1 = input.nextInt();

        System.out.println("Enter 2nd Angle: ");
        int angle2 = input.nextInt();

        if(angle1 + angle2 < 180){                  //Check if the angles are less than 180 degrees
            System.out.println("Third angle is: " + findThirdAngle(angle1, angle2));
        } else {
            System.out.println("Invalid Values of the angles");
        }
    }
}