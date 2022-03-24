/*
next() function returns the next token/word in the input as a
string and charAt(0) function returns the first character in that string.
 */

package CharCheck;
import java.util.Scanner;

public class CharCheckRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = input.next().charAt(0);           //Scanner doesn't have a method to get char as input

        CharCheck character = new CharCheck(ch);

        if(character.numCheck())
            System.out.println(ch + " is a decimal number.");
        else
            System.out.println(ch + " is not a decimal number");


        if(character.vowelCheck())
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is not a vowel");

        if(character.alphabetCheck())
            System.out.println(ch + " is an alphabet");
        else
            System.out.println(ch + " is not an alphabet");

        System.out.println(" ");
        character.printLowerCase();
        System.out.println(" ");
        character.printUpperCase();
    }
}
