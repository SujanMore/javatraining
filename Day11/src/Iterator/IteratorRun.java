package Iterator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRun {
    public static void main(String[] args) {

        List<Integer> numberList = List.of(1,45,15,7,92,88);

        System.out.println("Basic For Loop: ");
        for(int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i));
        }
        System.out.println();

        System.out.println("Enhanced For Loop");
        for(Integer number: numberList){
            System.out.println(number);
        }
        System.out.println();

        System.out.println("Iterator Loop");
        Iterator<Integer> numberIterator = numberList.iterator();
        while(numberIterator.hasNext()){
            System.out.println(numberIterator.next());
        }

        System.out.println("---------------------------");
        List<String> words = List.of("Bat", "Ball", "Cat");
        List<String> wordsAL = new ArrayList<>(words);

        System.out.println("Words List: ");
        System.out.println(wordsAL);
        System.out.println();

        System.out.println("Words ending with \"at\" ");
        for(String word:wordsAL){
            if(word.endsWith("at")){
                System.out.println(word);
            }
        }
        System.out.println();

        /*

         */
        System.out.println("Removing Words ending with \"at\" ");
        Iterator<String> wordIterator = wordsAL.iterator();
        while(wordIterator.hasNext()){
            if(wordIterator.next().endsWith("at")){
                wordIterator.remove();
            }
        }
        System.out.println(wordsAL);
    }
}
