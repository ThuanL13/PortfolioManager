public class CreditCard implements Valuable {
    private int accountNumber;
    private String owner;
    private double balance;

    // Constructor

    public CreditCard(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    // Methods for credit card
    // Increases debt
    public void charge(double amount) {
        balance += amount;
    }
    // Pays debt
    public void pay(double amount) {
        balance -= amount;
    }
    // Debt reduces net worth
    @Override
    public double getValue() {
        return -balance;
    }
}
