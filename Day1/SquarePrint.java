
public class SquarePrint {
    public static void main(String[] args) {

        System.out.println("Square of 10 numbers: ");
        for(int i = 1; i <= 10; i++) {                            //Print Square of 10 Numbers
            System.out.println(i + " * " + i + " = " + i * i);
        }

        System.out.println("Square of even numbers: ");
        for(int i = 1; i <= 10; i++) {                            //Print Square of 10 Even Numbers
            if(i % 2 == 0)
                System.out.println(i + " * " + i + " = " + i * i);
        }

        System.out.println("Square of odd numbers: ");
        for(int i = 1; i <= 10; i++) {                            //Print Square of 10 Odd Numbers
            if(i % 2 != 0)
                System.out.println(i + " * " + i + " = " + i * i);
        }
    }
}