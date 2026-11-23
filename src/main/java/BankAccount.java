import java.math.BigDecimal;

public class BankAccount implements Valuable {
    private int accountNumber;
    private String owner;
    private BigDecimal balance;
    // Constructor
    public BankAccount(int accountNumber, String owner, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    // Methods for bank account
    // Adds money to account
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
    // Removes money from account
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public BigDecimal getValue() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
