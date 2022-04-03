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
        this.duration = duration;
        this.interestRate = rate;
//        this.interestAmount = new BigDecimal(rate).divide(new BigDecimal("100"))
//                .multiply(new BigDecimal(principalAmount).multiply(new BigDecimal(duration/12.0)));

        this.interestAmount = new BigDecimal(principalAmount).multiply(new BigDecimal(rate))
                .multiply(new BigDecimal(duration/12.0)).divide(new BigDecimal("100"), 2, RoundingMode.UP);

        this.totalAmount = this.interestAmount.add(new BigDecimal(principalAmount));
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
