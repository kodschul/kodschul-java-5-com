# Lab 7.3 – Lösung: ZahlenJagd-Versuchshistorie auswerten

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Scanner;

public class GuessingGameStats {

    public static void main(String[] args) {
        playRound();
    }

    static void playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        int[] attemptHistory = new int[maxAttempts];
        int attemptCount = 0;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            attemptHistory[attemptCount] = guess;
            attemptCount++;

            if (guess == targetNumber) {
                System.out.println("Correct! The number was " + targetNumber + ".");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.print("Your guesses: ");
        for (int i = 0; i < attemptCount; i++) {
            System.out.print(attemptHistory[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int min = attemptHistory[0];
        int max = attemptHistory[0];
        for (int i = 0; i < attemptCount; i++) {
            int guess = attemptHistory[i];
            sum += guess;
            if (guess < min) {
                min = guess;
            }
            if (guess > max) {
                max = guess;
            }
        }
        double average = (double) sum / attemptCount;
        System.out.println("Average guess: " + average);
        System.out.println("Lowest guess: " + min + ", highest guess: " + max);

        scanner.close();
    }
}
```

## Begründung

`min`/`max` starten bei `attemptHistory[0]`, das bei mindestens einem
gemachten Versuch immer gültig befüllt ist - so entsteht kein Sonderfall
für "noch kein Vergleichswert vorhanden".

## Ausblick

Modul 8 sortiert eine ganze Liste von Spielergebnissen (Highscore-Liste),
statt nur eine einzelne Runde auszuwerten.
