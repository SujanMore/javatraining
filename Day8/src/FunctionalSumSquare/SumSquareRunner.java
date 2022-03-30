package FunctionalSumSquare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SumSquareRunner {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 4, 55, 67, 89, 5);

        int sum = numbers.stream()
                .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println("Sum: " + sum);

        System.out.print("Square of 1-10: ");
        IntStream.range(1, 11)
                .map(element -> element * element)
                .forEach(e -> System.out.print(e + " "));

    }
}
