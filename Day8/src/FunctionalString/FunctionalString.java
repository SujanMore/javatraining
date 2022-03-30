package FunctionalString;

import java.util.List;

public class FunctionalString {
    public static void main(String[] args) {

        List<String> list = List.of("BAT", "BALL", "TEST");

        System.out.println("List in LowerCase: ");
        list.stream()
                .map(str -> str.toLowerCase())
                .forEach(e -> System.out.print(e + " "));

        System.out.println("Length of each element: ");
        list.stream()
                .map(str -> str.length())
                .forEach(e -> System.out.print(e + " "));
    }
}