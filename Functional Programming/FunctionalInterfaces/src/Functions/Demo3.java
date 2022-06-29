package Functions;

import java.util.function.Function;

public class Demo3 {

    public static void main(String[] args) {

        /*
            Function Chaining

            andThen()
            compose()
         */

        Function<Integer,Integer> f1 = f -> f * 2;
        Function<Integer,Integer> f2 = f -> f * f * f;

        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));
    }
}
