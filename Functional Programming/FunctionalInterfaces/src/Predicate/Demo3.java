package Predicate;

//Joining Predicates - and, or, negate
//p1 -- checks number is even
//p2 -- checks greater than 50

import java.util.function.Predicate;

public class Demo3 {

    public static void main(String[] args) {

        int a[] = {5,15,20,25,30,35,40,45,50,55,60,65};

        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i > 50;

        System.out.println("Following are numbers Even and Greater than 50:");
        for(int num:a) {
            if(p1.test(num) && p2.test(num)) {
                System.out.println(num);
            }
        }
    }
}
