package DoWhile;

import java.util.Scanner;

public class DoWhileCube {
    public static void main(String[] args) {

        int num = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if(num == -1){
                break;
            }

            System.out.println("Cube is " + (num * num * num));

        }while(num > 0);

    }
}
