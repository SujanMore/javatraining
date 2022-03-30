package FunctionalOddEven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalRun {

    private static  void printAll(List<Integer> list){
        list.stream()
                .forEach(element -> System.out.print(element + " "));
        System.out.println("");
    }

     private static void printOdd(List<Integer> list){
        list.stream()
                .filter(n -> (n % 2) == 1)
                .forEach(element -> {
                    System.out.print(element + " ");
                });
        System.out.println("");
    }

    private static void printEven(List<Integer> list){
        list.stream()
                .filter(n -> (n % 2) == 0)
                .forEach(element -> {
                    System.out.print(element + " ");
                });
        System.out.println("");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter Numbers:  ");
        System.out.println("Press -1 to Exit");
        System.out.println("----------------");

        while(true){
            int num = input.nextInt();

            if(num == -1){
                break;
            }

            numbers.add(num);
        }

        System.out.print("Entered Numbers: ");
        printAll(numbers);

        System.out.print("Odd Numbers: ");
        printOdd(numbers);

        System.out.print("Even Numbers: ");
        printEven(numbers);
    }
}
