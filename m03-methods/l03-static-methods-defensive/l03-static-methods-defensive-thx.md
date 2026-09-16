# Modul 3: Methoden (Funktionen)

## Lab 3.3 – Statische Hilfsmethoden und defensive Programmierung

---

## Lab-Ziel

Nach diesem Lab schreibst du eigene statische Hilfsmethoden mit Rückgabewert
und prüfst Parameter defensiv, bevor du ihnen vertraust.

**Leitfragen:**

<details>
<summary>Was bedeutet "defensive Programmierung"?</summary>

Eingaben/Parameter werden geprüft, bevor sie verwendet werden, statt
anzunehmen, dass sie immer gültig sind - so vermeidet man Abstürze oder
falsche Ergebnisse durch unerwartete Werte.

</details>

<details>
<summary>Warum eine eigene statische Methode statt Code-Duplizierung?</summary>

Eine Prüfung wie "liegt der Wert im erlaubten Bereich?" wird an mehreren
Stellen gebraucht (z. B. jeder ZahlenJagd-Ratewert). Eine Methode bündelt die
Logik an einem Ort.

</details>

---

## Statische Methode mit Rückgabewert

```java
static boolean isInRange(int value, int min, int max) {
    return value >= min && value <= max;
}
```

- `static`, weil keine Objektinstanz nötig ist (reine Berechnung).
- Rückgabewert `boolean` statt `void`: die Methode meldet ein Ergebnis
  zurück, statt selbst etwas auszugeben.

## Defensiv prüfen, bevor man einer Eingabe vertraut

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Guess a number between 1 and 100: ");
int guess = scanner.nextInt();

if (isInRange(guess, 1, 100)) {
    System.out.println("Accepted: " + guess);
} else {
    System.out.println("Out of range: " + guess + " (allowed: 1-100)");
}
```

- `isInRange` entscheidet nur, `main`/die aufrufende Methode reagiert auf
  das Ergebnis - Prüfung und Reaktion sind getrennt.
- Diese Prüfung ist noch keine vollständige Fehlerbehandlung (siehe
  Modul 9); sie schließt nur den erlaubten Zahlenbereich aus.

**Checkpoint:** Du hast eine wiederverwendbare, parameterlose-sichere
Hilfsmethode geschrieben, die einen Wertebereich prüft, statt anzunehmen,
dass ein Ratewert immer gültig ist.

Weiter geht es mit Modul 4: Bedingungen (`if`/`else`, `switch`).
