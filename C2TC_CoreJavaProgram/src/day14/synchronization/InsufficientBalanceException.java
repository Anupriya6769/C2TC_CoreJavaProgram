package day14.synchronization;
//Program to demonstrate User Defined Exception class
public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("Insufficient balance in your account");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}