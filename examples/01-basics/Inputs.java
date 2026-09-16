import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a num:");
        int userNum = scanner.nextInt();

        boolean isCorrect1 = userNum == 3 || userNum > 5;

        boolean isCorrect2 = userNum == 3 ^ userNum > 5;

        boolean isCorrect3 = userNum != 3 || userNum <= 5;

        System.out.printf("Hast du gewonnen? %b", isCorrect1);

        System.exit(0);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        double age = scanner.nextDouble();

        scanner.close();

        System.out.printf("Your name is: %s, you're %d y/o", name, age);

        // ---
        // System.out.printf("Multiplication: %d", num1 * num2);
        System.out.println("Addition: ");
        System.out.println("Subtraction: ");
        System.out.println("Division: ");
    }
}
