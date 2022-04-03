import java.util.Arrays;

public class InterestTable {

    private final double[][] table;

    public InterestTable(double[][] table) {

        this.table = table;
    }

    public int getPrincipalRange(double amount){

        if(amount < 100000){
            return 0;
        } else if ((amount >= 100000) && (amount < 200000)){
            return 1;
        }else if ((amount >= 200000) && (amount < 300000)){
            return 2;
        }else if ((amount >= 300000) && (amount < 500000)){
            return 3;
        }else if (amount >= 100000) {
            return 4;
        }

        return 0;
    }

    public int getDurationRange(int months){

        double years = months/12.0;

        if((years > 0) && (years < 0.5)){
            return 0;
        } else if((years >= 0.5) && (years < 1)){
            return 1;
        }else if((years >= 1) && (years < 2)) {
            return 2;
        } else if((years >= 2) && (years < 3)) {
            return 3;
        } else if((years >= 3) && (years < 5)) {
            return 4;
        } else if(years >= 5) {
            return 5;
        }

        return 0;

    }

    public double getInterestRate(int PrincipalRange, int DurationRange){
        return table[DurationRange][PrincipalRange];
    }

    public void printTable(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("                                    FIXED DEPOSIT INTEREST TABLE                                       ");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%8s %12s %15s %15s %15s %15s %15s", "Sr No. ", "  Tenure      ", "Below 1 Lakh", "1L - Below 2L", "2L - Below 3L", "3L - Below 5L", "Above 5L");
        System.out.println();
        System.out.format("%6s %16s %15f %15f %15f %15f %15f", "1  ", " 1M - Below 6M ", table[0][0], table[0][1], table[0][2], table[0][3], table[0][4]);
        System.out.println();
        System.out.format("%6s %16s %15f %15f %15f %15f %15f", "2  ", " 6M - Below 1Y ", table[1][0], table[1][1], table[1][2], table[1][3], table[1][4]);
        System.out.println();
        System.out.format("%6s %16s %15f %15f %15f %15f %15f", "3  ", " 1Y - Below 2Y ", table[2][0], table[2][1], table[2][2], table[2][3], table[2][4]);
        System.out.println();
        System.out.format("%6s %16s %15f %15f %15f %15f %15f", "4  ", " 2Y - Below 3Y ", table[3][0], table[3][1], table[3][2], table[4][3], table[4][4]);
        System.out.println();
        System.out.format("%6s %16s %15f %15f %15f %15f %15f", "5  ", " 3Y - Below 5Y ", table[4][0], table[4][1], table[4][2], table[4][3], table[4][4]);
        System.out.println();
        System.out.format("%6s %16s %15f %15f %15f %15f %15f", "6  ", "    Above 5Y   ", table[5][0], table[5][1], table[5][2], table[5][3], table[5][4]);
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

}
