package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {

    public static void main(String[] args) {

        /*
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(30);
        */

        List<Integer> numberList = Arrays.asList(10,15,20,25,30);

        List<Integer> evenNumberList = new ArrayList<>();

        // without using streams

        for(int n:numberList){

        }
    }
}
