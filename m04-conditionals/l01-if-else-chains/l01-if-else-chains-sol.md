# Lab 4.1 – Lösung: if/else-Ketten

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Scanner;

public class GuessEvaluation {

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
        } else if (guess < targetNumber) {
            System.out.println("Too low.");
        } else {
            System.out.println("Too high.");
        }

        scanner.close();
    }
}
```

## Begründung

Die Gleichheitsprüfung steht bewusst zuerst: Würde man zuerst
`guess < targetNumber` prüfen, wäre das Ergebnis unverändert, da ein
korrekter Wert diese Bedingung ohnehin nicht erfüllt. Die Reihenfolge ist
hier also keine Notwendigkeit, aber guter Stil (wichtigster/erwarteter Fall
zuerst).

## Ausblick

In Modul 5 wird diese Einzelprüfung in eine Schleife gesetzt, damit mehrere
Versuche möglich sind, bis richtig geraten oder die Versuche aufgebraucht
sind.
