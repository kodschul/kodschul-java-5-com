# Modul 9: Fehler abfangen

## Lab 9.3 – Nicht-Zahl-Eingaben bei ZahlenJagd abfangen

---

## Lab-Ziel

Nach diesem Lab stürzt ZahlenJagd bei einer nicht-numerischen Eingabe nicht
mehr ab, sondern meldet den Fehler und lässt den Versuch erneut zu.

**Leitfragen:**

<details>
<summary>Warum wird die for-Schleife aus Modul 6 zu einer while-Schleife?</summary>

Ein fehlgeschlagener Leseversuch (ungültige Eingabe) soll nicht als
regulärer Versuch zählen - mit `while` und einem manuellen Zähler lässt
sich das steuern, ohne den Zähler bei einem Fehler zu erhöhen.

</details>

<details>
<summary>Zählt ein abgefangener Fehler als verbrauchter Versuch?</summary>

Nein: Der `attempt`-Zähler wird nur im Erfolgsfall des Lesens erhöht -
eine ungültige Eingabe kostet den Spieler keinen Versuch.

</details>

---

## Die Rateschleife mit Fehlerbehandlung

```java
import java.util.InputMismatchException;
import java.util.Scanner;

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
        // dieser fehlgeschlagene Versuch zählt nicht
    }
}
```

**Checkpoint:** Eine nicht-numerische Eingabe wird abgefangen und meldet
sich, ohne einen Versuch zu verbrauchen; das Spiel läuft danach normal
weiter.

Weiter geht es mit Modul 10: Klassen, Objekte und Kapselung.
