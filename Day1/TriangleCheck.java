public class TriangleCheck {
    public static void main(String[] args) {
        int angle1 = 50, angle2 = 80, angle3 = 50;

        if((angle1 + angle2 + angle3) == 180){          //Find if sum of the angles are 180 or not
            System.out.println("It's a Triangle!");
        } else{
            System.out.println("Sorry, It's not a Triangle");
        }
    }
}