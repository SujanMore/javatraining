package NumbersUsingWhile;

import java.util.Scanner;

public class NumbersUsingWhileRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        NumbersUsingWhile number = new NumbersUsingWhile(num);

        System.out.println("Squares: ");
        number.squareOfnumbers();

        System.out.println("Cubes: ");
        number.cubeOfnumbers();
    }
}
