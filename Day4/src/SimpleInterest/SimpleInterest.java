package SimpleInterest;

import java.math.BigDecimal;

public class SimpleInterest {

    BigDecimal principalAmount;
    BigDecimal interestAmount;

    //BigDecimal Used for accurate value as result.
    public SimpleInterest(String principalAmount, String interestAmount) {
        this.principalAmount = new BigDecimal(principalAmount);
        this.interestAmount = new BigDecimal(interestAmount).divide(new BigDecimal("100"));
    }


    public BigDecimal calculateValue(int year) {
        return principalAmount.add(principalAmount.
                multiply(interestAmount).
                multiply(new BigDecimal(year)));
    }
}
