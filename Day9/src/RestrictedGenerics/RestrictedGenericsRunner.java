package RestrictedGenerics;

import java.util.ArrayList;
import java.util.List;

public class RestrictedGenericsRunner {

    //Generic Method
    static<S extends List> void dublicateList(S list){
        list.addAll(list);
    }

    /*
        WildCard in Methods. '?' is a wildcard.
        This method has a upperbound wildcard, due to extend.
     */
    static double sumofList(List<? extends Number> numbers){
        double sum = 0.0;

        for(Number number: numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    /*
    WildCard in Methods. '?' is a wildcard.
    This method has a lower-bound wildcard, due to super.
 */
    static void addValues(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(33L);
    }

    public static void main(String[] args) {

        RestrictedGenerics<Double> doubleList = new RestrictedGenerics<Double>();
        doubleList.addElement(234.54);
        doubleList.addElement(1.4);
        System.out.println(doubleList.getElement(1));
        System.out.println(doubleList);

        RestrictedGenerics<Long> longList = new RestrictedGenerics<Long>();
        longList.addElement(23L);
        longList.addElement(144L);
        System.out.println(longList.getElement(1));
        System.out.println(longList);


        ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3));
        dublicateList(num);
        System.out.println(num);

        System.out.println(" ");
        System.out.println(sumofList(List.of(1,2,3,4,5,6)));
        System.out.println(sumofList(List.of(1.4,4.67,23.6)));
        System.out.println(sumofList(List.of(3L, 55L)));

        List testList = new ArrayList<Number>();
        addValues(testList);
        System.out.println(testList);
    }
}
