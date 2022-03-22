import java.util.Scanner;

public class SumOfThreeMethods {

    static int sum(int a, int b, int c){
        return (a + b + c);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = input.nextInt();

        System.out.println("Enter 3rd Number: ");
        int num3 = input.nextInt();

        System.out.println("Sum of the three numbers is: " + sum(num1, num2, num3));

    }
}