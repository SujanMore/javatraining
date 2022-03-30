package MapCount;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sentence: ");
        String line = input.nextLine();

        Map<Character, Integer> count = new HashMap<>();

        char[] characters = line.toCharArray();

        for(char character: characters){
            Integer num = count.get(character);

            if((character>= 'A' && character <='Z') || (character >='a' && character <='z')){
                if(num == null){
                    count.put(character, 1);
                } else{
                    count.put(character, num = num + 1);
                }
            }
        }

        System.out.println("");
        System.out.println("Character count: " + count);
    }
}

