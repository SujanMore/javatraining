import java.math.BigDecimal;

public class SavingAccount {

    private final String name;
    private final String mobile;
    private BigDecimal depositAmount;
    private BigDecimal withDrawAmount;
    private BigDecimal balance;


    public SavingAccount(String name, String mobile, BigDecimal Amount) {
        this.name = name;
        this.mobile = mobile;
        this.balance = Amount;
        this.depositAmount = BigDecimal.valueOf(0);
        this.withDrawAmount = BigDecimal.valueOf(0);
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public BigDecimal getWithDrawAmount() {
        return withDrawAmount;
    }

    public void AmountWithDraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            withDrawAmount = withDrawAmount.add(amount);
        } else{
            withDrawAmount = BigDecimal.valueOf(0);
        }
    }
    public void AmountDeposit(BigDecimal amount){

        balance = balance.add(amount);
        depositAmount = depositAmount.add(amount);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", depositAmount=" + depositAmount +
                ", withDrawAmount=" + withDrawAmount +
                ", balance=" + balance +
                '}';
    }
}

