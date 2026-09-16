# Lab 3.3 – Lösung: Statische Hilfsmethoden und defensive Programmierung

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Scanner;

public class RangeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        if (isInRange(guess, 1, 100)) {
            System.out.println("Accepted: " + guess);
        } else {
            System.out.println("Out of range: " + guess + " (allowed: 1-100)");
        }

        scanner.close();
    }

    // Reports whether value lies within [min, max]; does not correct or clamp it.
    static boolean isInRange(int value, int min, int max) {
        return value >= min && value <= max;
    }
}
```

## Begründung

`isInRange` nimmt keine Annahme über die Aufrufreihenfolge von `min`/`max`
vor - werden sie vertauscht (z. B. `isInRange(5, 100, 1)`), liefert die
Methode immer `false`, weil kein Wert gleichzeitig `>= 100` und `<= 1` sein
kann. Das ist kein Bug der Methode, sondern ein Hinweis, dass der Aufrufer
für sinnvolle Grenzen sorgen muss.

## Zusatz

Negative Werte werden korrekt als außerhalb erkannt, solange `min`/`max`
selbst sinnvoll gesetzt sind (hier `1`/`100`); `isInRange` prüft nur den
Bereich, nicht das Vorzeichen speziell.

## Ausblick

In Modul 9 wird zusätzlich abgefangen, wenn die Eingabe gar keine Zahl ist
(z. B. Buchstaben) - das ist eine andere Fehlerart als "Zahl aber außerhalb
des Bereichs".
