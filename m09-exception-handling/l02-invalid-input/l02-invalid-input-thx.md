# Modul 9: Fehler abfangen

## Lab 9.2 – Ungültige Eingaben behandeln

---

## Lab-Ziel

Nach diesem Lab fängst du eine `InputMismatchException` ab, wenn eine
Eingabe keine gültige Zahl ist.

**Leitfragen:**

<details>
<summary>Wann wirft Scanner.nextInt() eine InputMismatchException?</summary>

Wenn die nächste Eingabe keine gültige Ganzzahl ist (z. B. Text wie
"abc") - der Scanner kann sie nicht in einen `int` umwandeln.

</details>

<details>
<summary>Warum muss scanner.next() im catch-Block aufgerufen werden?</summary>

Weil `nextInt()` bei einem Fehler die ungültige Eingabe im Puffer stehen
lässt - `scanner.next()` konsumiert sie, damit der nächste Leseversuch
nicht sofort wieder auf denselben ungültigen Wert trifft.

</details>

---

## InputMismatchException abfangen

```java
import java.util.InputMismatchException;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Guess a number between 1 and 100: ");

try {
    int guess = scanner.nextInt();
    System.out.println("You entered: " + guess);
} catch (InputMismatchException e) {
    System.out.println("That wasn't a number. Please enter a whole number.");
    scanner.next();
}
```

- Ohne `scanner.next()` im `catch`-Block würde die ungültige Eingabe bei
  einem erneuten `nextInt()`-Aufruf sofort wieder denselben Fehler
  auslösen (Endlosschleife aus Fehlermeldungen).

**Checkpoint:** Bei einer nicht-numerischen Eingabe erscheint deine
Fehlermeldung, und ein nachfolgender gültiger Wert wird korrekt gelesen.

Weiter geht es mit Lab 9.3: nicht-numerische ZahlenJagd-Eingaben abfangen.
