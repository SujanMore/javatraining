package ConcurrentAndAtomic;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {

        Map<Character, LongAdder> occurances = new Hashtable<>();
        String str = "SUJAN VINIT KAVITA SANDEEP";

        //Not thread Safe
        for(char character:str.toCharArray()){
            LongAdder longAdder = occurances.get(character);
            if(longAdder == null) {
                longAdder = new LongAdder();
            }
            longAdder.increment();
            occurances.put(character, longAdder);
        }
        System.out.println(occurances);

        //Thread Safe
        ConcurrentMap<Character, LongAdder> concurrentOccurances = new ConcurrentHashMap<>();
        for(char character:str.toCharArray()){
            concurrentOccurances.computeIfAbsent(character, ch -> new LongAdder()).increment();

        }
        System.out.println(concurrentOccurances);

    }
}
