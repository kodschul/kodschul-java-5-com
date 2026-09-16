# Lab 10.3 – Lösung: ZahlenJagd-Logik in eine Klasse umbauen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m10-classes/GuessingGame.java`:

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {

    private final int targetNumber;
    private final int maxAttempts;
    private int attemptsNeeded;

    public GuessingGame(int maxAttempts) {
        this.targetNumber = (int) (Math.random() * 100) + 1;
        this.maxAttempts = maxAttempts;
        this.attemptsNeeded = 0;
    }

    public int play(Scanner scanner) {
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");

            try {
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Correct! The number was " + targetNumber + ".");
                    attemptsNeeded = attempt;
                    return attemptsNeeded;
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
        attemptsNeeded = maxAttempts + 1;
        return attemptsNeeded;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getAttemptsNeeded() {
        return attemptsNeeded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame game = new GuessingGame(10);
        game.play(scanner);
        scanner.close();
    }
}
```

## Begründung

`attemptsNeeded` wird als Attribut statt als lokale Variable geführt, damit
`getAttemptsNeeded()` das Ergebnis auch nach Aufruf von `play(...)`
weiterhin abrufbar macht - z. B. für eine spätere Highscore-Liste.

## Ausblick

Modul 11 leitet aus `GuessingGame` Unterklassen für Schwierigkeitsgrade ab
und führt `Comparable` für eine saubere Highscore-Sortierung ein.
