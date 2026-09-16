import java.util.Scanner;

public class ConsoleOutput {

    public static void main(String[] args) {
        System.out.println("Simple line with println.");
        System.out.print("print without a new line, ");
        System.out.println("continued on the same line.");

        int attempts = 4;
        double average = 2.5;
        System.out.printf("Attempts: %d, average: %.2f%n", attempts, average);

        // Scanner import kept here so this file compiles the same way ScannerInput.java
        // does
        System.out.println("See ScannerInput.java for reading values with " + Scanner.class.getSimpleName() + ".");
    }
}
