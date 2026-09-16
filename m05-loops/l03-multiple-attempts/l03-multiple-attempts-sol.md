# Lab 5.3 – Lösung: ZahlenJagd erlaubt mehrere Versuche

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m05-loops/GuessingGame.java`:

```java
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        playRound();
    }

    static void playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Correct! The number was " + targetNumber + ".");
                scanner.close();
                return;
            } else if (guess < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        scanner.close();
    }
}
```

## Begründung

`scanner.close()` steht an zwei Stellen (nach dem Treffer und nach der
Schleife), weil beide Ausgänge der Methode den Scanner sauber schließen
sollen; alternativ könnte man ein `try`-with-resources verwenden, das folgt
aber erst mit Exceptions in Modul 9.

## Ausblick

Modul 6 speichert jeden Ratewert zusätzlich in einem Array, um später eine
Versuchshistorie auszugeben.
