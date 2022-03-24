package CharCheck;

public class CharCheck {

    private final char character;

    public CharCheck(char ch) {
        this.character = ch;
    }


    public boolean numCheck() {
        return (this.character >= '1') && (this.character <= '9');
    }

    public boolean vowelCheck(){

        return switch (this.character) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> true;
            default -> false;
        };
    }

    public boolean alphabetCheck() {

        if((this.character >= 'a' && this.character <= 'z') ||
                (this.character >= 'A' && this.character <= 'Z'))
            return true;

        return false;
    }

    public void printLowerCase() {
        System.out.println("Lowercase Characters: ");
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println("");
    }

    public void printUpperCase() {
        System.out.println("Uppercase Characters: ");
        for(char i = 'A'; i <='Z'; i++){
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println("");
    }
}
