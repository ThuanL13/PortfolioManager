import java.math.BigDecimal;

public class FinancialAppliction {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));

        account1.deposit(new BigDecimal("100"));


        System.out.println("Account 1 value $" + account1.getValue());
        System.out.println("Account 2 value $" + account2.getValue());

    }
}
