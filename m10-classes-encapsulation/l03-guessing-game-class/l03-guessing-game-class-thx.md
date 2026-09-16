# Modul 10: Klassen, Objekte und Kapselung

## Lab 10.3 – ZahlenJagd-Logik in eine Klasse umbauen

---

## Lab-Ziel

Nach diesem Lab steckt die komplette ZahlenJagd-Logik aus Modul 3-9 in
einer Klasse `GuessingGame` mit Konstruktor und gekapselten Attributen.

**Leitfragen:**

<details>
<summary>Was wird aus der bisherigen statischen Methode playRound()?</summary>

Sie wird zu einer nicht-statischen Methode `play(Scanner scanner)` einer
Instanz - Zufallszahl und Zustand (`targetNumber`, `attemptsNeeded`) gehören
jetzt zum Objekt statt zu lokalen Variablen einer statischen Methode.

</details>

<details>
<summary>Warum bekommt GuessingGame einen Konstruktor mit maxAttempts als Parameter?</summary>

Damit unterschiedliche Instanzen mit unterschiedlichen Versuchsobergrenzen
erzeugt werden können - eine Vorbereitung auf die Schwierigkeitsgrade in
Modul 11.

</details>

---

## Von statischen Methoden zur Klasse

```java
public class GuessingGame {

    private final int targetNumber;
    private final int maxAttempts;
    private int attemptsNeeded;

    public GuessingGame(int maxAttempts) {
        this.targetNumber = (int) (Math.random() * 100) + 1;
        this.maxAttempts = maxAttempts;
        this.attemptsNeeded = 0;
    }

    public int play(Scanner scanner) {
        // Rate-Logik aus Modul 9, jetzt mit targetNumber/maxAttempts als Attribute
        // ...
        return attemptsNeeded;
    }

    public int getAttemptsNeeded() {
        return attemptsNeeded;
    }
}
```

```java
GuessingGame game = new GuessingGame(10);
Scanner scanner = new Scanner(System.in);
game.play(scanner);
```

- `targetNumber` und `maxAttempts` sind `private final`: pro Objekt einmal
  gesetzt, danach unveränderlich.
- `main` erzeugt jetzt ein Objekt (`new GuessingGame(10)`) statt eine
  statische Methode direkt aufzurufen.

**Checkpoint:** Dein Spiel funktioniert unverändert (richtig/zu hoch/zu
niedrig, Fehlerbehandlung), jetzt aber als Objekt mit Konstruktor.

Weiter geht es mit Modul 11: Vererbung und Interfaces.
