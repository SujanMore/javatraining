package StaticModifier;

class Player{
    private String name;
    private static int count = 0;       //Shared between its objects due to static

    public Player(String name){
        this.name = name;
        count++;
    }

    public int getCount() {
        return count;
    }
}
public class StaticModifierRunner {
    public static void main(String[] args) {

        Player player1 = new Player("Sachin");
        System.out.println(player1.getCount());

        Player player2 = new Player("Rahul");
        System.out.println(player2.getCount());
    }
}
