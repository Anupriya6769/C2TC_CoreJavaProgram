package assignment6;
public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double initialBalance) throws InvalidAmountException {
        this.accountNumber = accountNumber;
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Successfully deposited: ₹" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: ₹" + amount);
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Current Balance: ₹" + balance);
    }
}