package ImplementationMethod;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class evenCheck implements Predicate<Integer> {

    @Override
    public boolean test(Integer num) {
        return num % 2 == 0;
    }
}

class printInteger implements Consumer<Integer>{

    @Override
    public void accept(Integer num) {
        System.out.print(num + " ");
    }
}
public class ImplementationRunner {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 51, 5, 3, 55, 65, 8, 2, 65, 7, 22);

        System.out.print("Even Numbers: ");
        list.stream()
                .filter(num -> (num % 2 == 0))
                .forEach(p -> System.out.print(p + " "));

        System.out.println(" ");
        list.stream()
                .filter(new evenCheck())
                .forEach(new printInteger());


    }
}
