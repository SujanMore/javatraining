import java.text.DecimalFormat;
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
        }else if (amount >= 500000) {
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
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat serialDf = new DecimalFormat(("#"));

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("                                    FIXED DEPOSIT INTEREST TABLE                                       ");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%8s %12s %15s %15s %15s %15s %15s", "Sr No. ", "  Tenure      ", "Below 1 Lakh", "1L - Below 2L",
                "2L - Below 3L", "3L - Below 5L", "Above 5L");
        System.out.println();

        String[] duration = {" 1M - Below 6M ", " 6M - Below 1Y ", " 1Y - Below 2Y ", " 2Y - Below 3Y ", " 3Y - Below 5Y ", "    Above 5Y   "};

        for(int i = 0; i < 6; i++){
            System.out.format("%6s %16s %15s %15s %15s %15s %15s", serialDf.format(i + 1), duration[i], df.format(table[i][0]), df.format(table[i][1])
                    , df.format(table[i][2]), df.format(table[i][3]), df.format(table[i][4]));
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

}
