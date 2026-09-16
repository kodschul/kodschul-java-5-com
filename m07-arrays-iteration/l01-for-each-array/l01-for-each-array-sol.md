# Lab 7.1 – Lösung: for/for-each über ein Array

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class ArrayIteration {

    public static void main(String[] args) {
        int[] attemptHistory = {42, 17, 73, 50, 8};

        for (int i = 0; i < attemptHistory.length; i++) {
            System.out.println("Attempt " + (i + 1) + ": " + attemptHistory[i]);
        }

        for (int guess : attemptHistory) {
            System.out.println(guess);
        }

        int countAbove40 = 0;
        for (int guess : attemptHistory) {
            if (guess > 40) {
                countAbove40++;
            }
        }
        System.out.println("Values above 40: " + countAbove40);
    }
}
```

## Begründung

Die Zähl-Aufgabe braucht keinen Index, nur den Wert selbst - `for-each` ist
hier die einfachere Wahl gegenüber einer indexbasierten Schleife.

## Ausblick

Lab 7.2 baut auf demselben Array eine Suche (Minimum/Maximum) und eine
Summenberechnung auf.
