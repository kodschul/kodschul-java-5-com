import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a whole number: ");
            try {
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("That wasn't a number. Try again.");
                scanner.next(); // discard the invalid token, otherwise the next read fails too
            }
        }

        scanner.close();
    }
}
