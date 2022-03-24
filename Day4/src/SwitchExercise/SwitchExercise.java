/*
Basic Exercise to practice Switch case. Three methods created
using switch to print day, month and week
 */

package SwitchExercise;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to find the day: ");
        int day = input.nextInt();
        System.out.println("Day is " + findDay(day));

        //Practising the concept of Ternary Operator
        System.out.println(findDay(day) + " is " + (checkWeekDay(day) ? "a weekday." : "weekend."));

        System.out.println(" ");

        System.out.println("Enter number to find the month: ");
        int month = input.nextInt();
        System.out.println("Month is " + findMonth(month));
    }

    private static String findDay(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

    }

    private static boolean checkWeekDay(int day) {

        return switch (day) {
            case 1, 2, 3, 4, 5 -> true;
            default -> false;
        };
    }

    private static String findMonth(int month){

        return switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
    }
}
