# Lab 6.3 – Lösung: Jeden Rateversuch in ein Array schreiben

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m06-arrays/GuessingGame.java`:

```java
import java.util.Scanner;

public class GuessingGame {

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

        scanner.close();
    }
}
```

## Begründung

`break` ersetzt das frühere `return`, weil die Methode nach der Schleife
noch die Versuchshistorie ausgeben muss - ein `return` würde die Methode
sofort verlassen, bevor diese Ausgabe erreicht wird.

## Ausblick

Modul 7 iteriert über genau dieses Array, um z. B. den kleinsten/größten
Versuch oder den Durchschnitt zu berechnen.
