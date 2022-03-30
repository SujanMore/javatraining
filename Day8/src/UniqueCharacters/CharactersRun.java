package UniqueCharacters;

import javax.xml.stream.events.Characters;
import java.util.*;

public class CharactersRun {
    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>();

        System.out.println("----Enter Characters----");
        System.out.println("  (Press '1' to exit.)  ");
        System.out.println("------------------------");

        Scanner input = new Scanner(System.in);

        while(true){
            char character = input.next().charAt(0);

            if(character == '1'){
                break;
            }

            characters.add(character);
        }
        System.out.println("Entered Characters: " + characters);

        Set<Character> treeSet = new TreeSet<>(characters);

        System.out.println("------------------------");
        System.out.println("Unique Characters: " + treeSet);


    }
}
