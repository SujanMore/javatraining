import java.util.Scanner;

public class PrintNumbersMethod {

    static void printNumbersCount(int n){       //Print Numbers wtih count as parameter

        System.out.println("Print the numbers from 1 to " + n);
        for(int i = 1; i <= n; i++)
            System.out.println(i);
    }

    static void printSquares(int n){            //Print Square numbers with count as parameter
        System.out.println("Print the square of numbers of 1 to " + n);
        for(int i = 1; i <= n; i++)
            System.out.println(i + " * " + i +  " = " + i * i);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number for count: ");
        printNumbersCount(input.nextInt());                 //Get the count & print the numbers

        System.out.println("Enter Square of Numbers: ");
        printSquares(input.nextInt());                      //Get the count & print the Squares of numbers
    }
}