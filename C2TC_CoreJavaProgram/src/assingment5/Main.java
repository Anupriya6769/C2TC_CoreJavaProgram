package assingment5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] details = sc.nextLine().split(",");
        String stageEvent = details[0];
        String customer = details[1];
        int noOfSeats = Integer.parseInt(details[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                double cashAmount = Double.parseDouble(sc.nextLine());
                booking.makePayment(cashAmount);
                break;

            case 2:
                double walletAmount = Double.parseDouble(sc.nextLine());
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3:
                String holderName = sc.nextLine();
                double cardAmount = Double.parseDouble(sc.nextLine());
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
