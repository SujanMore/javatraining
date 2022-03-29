package Rectangle;

import java.util.Scanner;

public class RectangleRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-----Rectangle-----");

        System.out.print("Enter Length: ");
        int length = input.nextInt();

        System.out.print("Enter Width: ");
        int width = input.nextInt();

        System.out.println("-------------------");

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println(rectangle);
    }
}
