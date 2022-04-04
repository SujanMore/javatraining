import java.math.BigDecimal;
import java.math.RoundingMode;

public class FDAccount {

    private final String name;
    private final double principalAmount;
    private final int duration;
    private final double interestRate;
    private final BigDecimal interestAmount;
    private final BigDecimal totalAmount;

    public FDAccount(String name, double principalAmount, int duration, double rate) {
        this.name = name;
        this.principalAmount = principalAmount;
        this.duration = duration;               //In Months
        this.interestRate = rate;               //Taken from the interest table.

//      this.interestAmount = new BigDecimal(principalAmount).multiply(new BigDecimal(rate))
//               .multiply(new BigDecimal(duration/12.0)).divide(new BigDecimal("100"), 2, RoundingMode.UP);
//      this.totalAmount = this.interestAmount.add(new BigDecimal(principalAmount));

        int n = 4;          //Number of times to be compounded.
        double totAmount = Math.ceil(principalAmount * Math.pow(1 + ((rate/100) / n),n * (duration/12.0)));
        double interestAmt = totAmount - principalAmount;

        this.interestAmount = BigDecimal.valueOf(interestAmt);
        this.totalAmount = BigDecimal.valueOf(totAmount);
    }

    public String getName() {

        return name;
    }

    public int getDuration() {
        return duration;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getPrincipalAmount() {

        return principalAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "FDAccount{" +
                "name='" + name + '\'' +
                ", principalAmount=" + principalAmount +
                ", duration=" + duration +
                ", interestRate=" + interestRate +
                ", interestAmount=" + interestAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
