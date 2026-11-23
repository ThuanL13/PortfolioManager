public class BankAccount implements Valuable {
    private int accountNumber;
    private String owner;
    private double balance;
    // Constructor
    public BankAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    // Methods for bank account
    // Adds money to account
    public void deposit(double amount) {
        balance += amount;
    }
    // Removes money from account
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
