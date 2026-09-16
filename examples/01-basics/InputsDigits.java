import java.util.Scanner;

public class InputsDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num 1 and num2:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        scanner.close();

        String divisionOutput = String.format("%.2f", num1 / num2);

        System.out.println(divisionOutput);

        // // ---
        // System.out.printf("Multiplication: %.2f", num1 * num2);
        // System.out.printf("Division: %.2f", num1 / num2);
    }
}
