import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;

        while (true) {
            System.out.print("Enter hours parked (or -1 to quit): ");
            double hours = scanner.nextDouble();

            if (hours == -1) {
                break;
            }

            double charge = calculateCharges(hours);
            System.out.printf("Charge for this customer: $%.2f%n", charge);
            totalReceipts += charge;
        }

        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        
    }

    public static double calculateCharges(double hours) {
        if (hours <= 3) {
            return 2.00;
        } else {
            double additionalHours = Math.ceil(hours - 3);
            double charge = 2.00 + (additionalHours * 0.50);
            return Math.min(charge, 10.00); // Maximum charge is $10.00
        }
    }
}