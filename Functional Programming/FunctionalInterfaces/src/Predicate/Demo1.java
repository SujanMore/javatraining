package Predicate;


import java.util.function.Predicate;

public class Demo1 {

    public static void main(String[] args) {

        //Ex1
        Predicate<Integer> p = i -> (i > 10);

        System.out.println(p.test(20));
        System.out.println(p.test(9));

        //Ex2: Check the length of string is greater than 3 or not
        Predicate<String> pr = s -> (s.length() > 3);
        System.out.println(pr.test("Sujan"));

        //Ex3: Print array elements whose size is > 3 from array
        String names[] = {"Max", "Sujan", "Hrishikesh", "Narendra", "Sid"};

        for(String name:names) {
            if(pr.test(name)){
                System.out.println(name);
            }
        }

    }
}
