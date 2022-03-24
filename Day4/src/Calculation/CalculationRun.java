package Calculation;

import java.util.Scanner;

public class CalculationRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();

        Calculation calculate = new Calculation(num1, num2);

        int exit = 0;
        calculate.menu();
        int menu = input.nextInt();
        while(exit == 0){

            switch (menu) {
                case 1 -> calculate.add();
                case 2 -> calculate.subtract();
                case 3 -> calculate.multiply();
                case 4 -> calculate.divide();
                case 5 -> exit = 1;
            }

            System.out.println("Press 1: Continue or 5: exit");
            menu = input.nextInt();

            if(menu == 5)
                break;
            else
            {
                calculate.menu();
                menu = input.nextInt();
            }

        }
    }
}
