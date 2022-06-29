package Functions;

import java.util.function.Function;

public class Demo1 {

    public static void main(String[] args) {

        //Ex1
        Function<Integer, Integer> square = i -> i*i;
        System.out.println(square.apply(5));
        System.out.println(square.apply(10));

        //Ex2
        Function<String, Integer> strLength = i -> i.length();
        System.out.println("Sujan: " + strLength.apply("Sujan"));
        System.out.println("Narendra: " + strLength.apply("Narendra"));
    }
}
