import java.util.Scanner;

// Starting point before Module 3: simple console input/output program from Module 2.
// The GuessingGame project doesn't exist yet - Module 3 builds the first
// GuessingGame method from exactly this structure (read with Scanner, check a
// value, print formatted output).
public class ConsoleInputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.printf("Hello %s, you are %d years old.%n", name, age);

        scanner.close();
    }
}
