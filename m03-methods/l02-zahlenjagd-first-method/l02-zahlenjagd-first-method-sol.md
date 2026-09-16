# Lab 3.2 – Lösung: ZahlenJagd als Methode

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m03-methods/GuessingGame.java`:

```java
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        playRound();
    }

    static void playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        if (guess == targetNumber) {
            System.out.println("Correct! The number was " + targetNumber + ".");
        } else {
            System.out.println("Wrong. The number was " + targetNumber + ".");
        }

        scanner.close();
    }
}
```

## Begründung

`targetNumber` wird als lokale Variable innerhalb von `playRound()` erzeugt,
damit jeder Aufruf der Methode eine frische Zufallszahl bekommt.

## Ausblick

In Modul 4 wird die einfache `if/else`-Prüfung zu einer differenzierten
Auswertung (richtig/zu hoch/zu niedrig) erweitert.
