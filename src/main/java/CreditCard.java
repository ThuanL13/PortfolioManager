import java.math.BigDecimal;

public class CreditCard implements Valuable {
    private int accountNumber;
    private String owner;
    private BigDecimal balance;

    // Constructor

    public CreditCard(int accountNumber, String owner, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    // Methods for credit card
    // Increases debt
    public void charge(BigDecimal amount) {
        balance = balance.add(amount);
    }
    // Pays debt
    public void pay(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
    // Debt reduces net worth
    @Override
    public BigDecimal getValue() {
        return balance.negate();
    }
}
