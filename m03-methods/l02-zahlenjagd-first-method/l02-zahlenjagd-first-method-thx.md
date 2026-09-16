# Modul 3: Methoden (Funktionen)

## Lab 3.2 – ZahlenJagd als Methode

---

## Lab-Ziel

Nach diesem Lab existiert ZahlenJagd als eigene Methode: Sie erzeugt eine
Zufallszahl und prüft einen einzelnen Ratewert per `Scanner`.

**Leitfragen:**

<details>
<summary>Wie erzeugt man in Java eine Zufallszahl in einem Bereich?</summary>

`Math.random()` liefert einen `double` zwischen 0.0 (inklusive) und 1.0
(exklusive). Mit `(int) (Math.random() * 100) + 1` erhält man eine ganze
Zahl zwischen 1 und 100.

</details>

<details>
<summary>Warum wird der Ein-/Ausgabe-Code aus Modul 2 jetzt in eine Methode verschoben?</summary>

Damit `main` nur noch die Methode aufruft und die eigentliche Spiellogik
gekapselt, benennbar und später erweiterbar ist (Bedingungen, Schleifen).

</details>

---

## Von ConsoleInputOutput zu GuessingGame

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

- `age` wird zu `targetNumber` (Zufallszahl statt Eingabe).
- Der Kommentar aus Lab 2.3 wird zu `guess` (der Ratewert).
- Die Prüfung `guess == targetNumber` ist bereits eine Bedingung - die
  vollständige Auswertung (zu hoch/zu niedrig) folgt in Modul 4.

**Checkpoint:** Dein Programm erzeugt bei jedem Start eine neue Zufallszahl
und meldet, ob der eine Ratewert richtig war.

Weiter geht es mit Lab 3.3: statische Hilfsmethoden und defensive Programmierung.
