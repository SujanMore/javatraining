package SimpleInterest;

import java.math.BigDecimal;

public class SimpleInterest {

    private final BigDecimal principalAmount;           //Intellij suggests to make these instance variable as final. Not sure why.
    private final BigDecimal interestAmount;

    //BigDecimal Used for accurate value as result.
    public SimpleInterest(String principalAmount, String interestAmount) {
        this.principalAmount = new BigDecimal(principalAmount);
        this.interestAmount = new BigDecimal(interestAmount).divide(new BigDecimal("100"));
    }

    public BigDecimal calculateInterest(int year){
        return principalAmount.
                multiply(interestAmount).
                multiply(new BigDecimal(year));
    }
    public BigDecimal calculateTotalAmount(int year) {
        return principalAmount.add(calculateInterest(year));
    }
}
