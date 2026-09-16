# Lab 9.3 – Lösung: Nicht-Zahl-Eingaben bei ZahlenJagd abfangen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m09-exceptions/GuessingGame.java`:

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int attemptsNeeded = playRound();
        System.out.println("Attempts needed: " + attemptsNeeded);
    }

    static int playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");

            try {
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Correct! The number was " + targetNumber + ".");
                    return attempt;
                } else if (guess < targetNumber) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }

                attempt++;
            } catch (InputMismatchException e) {
                System.out.println("That wasn't a number. Please enter a whole number.");
                scanner.next();
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        return maxAttempts + 1;
    }
}
```

## Begründung

`attempt++` steht nur im `try`-Block, nach der erfolgreichen Auswertung -
so kostet eine ungültige Eingabe (die in den `catch`-Block springt) keinen
Versuch.

## Ausblick

Modul 10 verpackt diese gesamte Logik in eine Klasse mit Konstruktor und
gekapselten Attributen.
