package assignment6;
public class BankSystemDemo {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(1001, 5000);

            // Attempt deposit
            try {
                account.deposit(2000);
            } catch (InvalidAmountException e) {
                System.out.println("Deposit Error: " + e.getMessage());
            }

            // Attempt withdrawal
            try {
                account.withdraw(7000);
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println("Withdrawal Error: " + e.getMessage());
            }

            // Display final balance
            account.displayBalance();

        } catch (InvalidAmountException e) {
            System.out.println("Account Creation Error: " + e.getMessage());
        } finally {
            System.out.println("Banking operations completed.");
        }
    }
}

