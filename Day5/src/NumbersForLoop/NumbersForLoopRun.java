package NumbersForLoop;

import java.util.Scanner;

public class NumbersForLoopRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        NumbersForLoop num = new NumbersForLoop(number);

        //To check is number is prime
        System.out.println(number + " is " + (num.checkPrime() ? " a prime number" : " not a prime number"));

        //Print the sum upto number
        System.out.println("The sum upto " + number + " is: " + num.sumToNum());

        //Print the sum of divisors of number
        System.out.println("The sum of the divisors of " + number + " is " + num.sumOfDivisors());

        //Print a Triangle of number
        num.printTriangleOfNum();
    }
}
