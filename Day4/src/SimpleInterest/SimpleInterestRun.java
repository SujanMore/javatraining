/*
    Program to calculate the amount to be paid using the principal amount
    and interest rate.
 */

package SimpleInterest;

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleInterestRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        String principalAmount = input.nextLine();

        System.out.print("Enter Interest Rate (in %): ");
        String interestRate = input.nextLine();

        System.out.print("Enter No. of years: ");
        int years = input.nextInt();

        SimpleInterest calculateInterest = new SimpleInterest(principalAmount, interestRate);

        BigDecimal interestAmount = calculateInterest.calculateInterest(years);
        BigDecimal totalAmount = calculateInterest.calculateTotalAmount(years);

        System.out.println("Total Interest Amount is: Rs." + interestAmount);
        System.out.println("Total Amount to be paid is: Rs." + totalAmount);
    }
}
