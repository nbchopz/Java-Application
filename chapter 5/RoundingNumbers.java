import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value (or -1 to quit): ");
        double number;

        while ((number = scanner.nextDouble()) != -1) {
            int rounded = (int) Math.floor(number + 0.5);
            System.out.printf("Original: %.2f, Rounded: %d%n", number, rounded);
            System.out.print("Enter another double value (or -1 to quit): ");
        }

        
    }
}