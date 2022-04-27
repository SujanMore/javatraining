package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListRunner01 {
    public static void main(String[] args) {

        List<Object> wordList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Words: (Enter -1 to Exit)");
        String str = " ";

//        while(!str.equals("-1")){
//            str = input.nextLine();
//
//            if(!str.equals("-1")){
//                wordList.add(str);
//            }
//        }
//        input.close();                  //To close the input steam

        while(true){
            str = input.nextLine();

            if(str.equals("-1")){
                break;
            }

            wordList.add(str);
            linkedList.add(str);
        }

        System.out.println("------ArrayList------");
        System.out.println(wordList);

        wordList.add("Test1");
        System.out.println(wordList);
        System.out.println(" ");

        wordList.remove(0);
        System.out.println(wordList);
        System.out.println(" ");

        if(wordList.contains("Sujan")){
            System.out.println("ArrayList contains the name \"Sujan\"");     // '\"' before and after hello to print it as "Hello"
        }
        System.out.println("---------------------");

        System.out.println("------LinkedList------");
        System.out.println(linkedList);

        wordList.add("Test2");
        System.out.println(linkedList);
        System.out.println(" ");

        wordList.remove(0);
        System.out.println(linkedList);
        System.out.println(" ");

        if(wordList.contains("Vinit")){
            System.out.println("LinkedList contains the name \"Vinit\"");     // '\"' before and after hello to print it as "Hello"
        }
        System.out.println("---------------------");
    }
}
