import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        System.out.println("Hello " + name + ", you guessed " + guess + ".");

        scanner.close();
    }
}
