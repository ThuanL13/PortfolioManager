import java.math.BigDecimal;

public class FinancialAppliction {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));

        account1.deposit(new BigDecimal("100"));

    }
}
