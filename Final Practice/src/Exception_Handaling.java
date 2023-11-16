import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handaling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            try {
                System.out.print("Enter a positive integer: ");
                int num = scanner.nextInt();

                if (num <= 0) {
                    System.out.println("Input positive integer only");
                }
                

                sum += num;
                count++;
            } catch (InputMismatchException e) {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear the input buffer
            } catch (IllegalArgumentException e) {
                // Handle negative integer input
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Sum of the positive integers: " + sum);

        scanner.close();
    }
}

