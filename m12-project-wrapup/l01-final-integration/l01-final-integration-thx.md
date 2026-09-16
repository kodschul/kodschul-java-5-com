# Modul 12: Projektabschluss

## Lab 12.1 – Alle Bausteine zusammenführen

---

## Lab-Ziel

Nach diesem Lab wählt dein Programm zu Beginn eine Schwierigkeitsstufe aus
und startet damit eine Instanz von `GuessingGame`.

**Leitfragen:**

<details>
<summary>Warum eine eigene Methode chooseDifficulty(scanner) statt Code direkt in main?</summary>

Damit `main` übersichtlich bleibt und die Auswahl-Logik unabhängig testbar
und wiederverwendbar ist - ein typisches Zeichen für sauber strukturierten
Code am Ende eines Projekts.

</details>

<details>
<summary>Warum liefert chooseDifficulty ein GuessingGame und keine Zeichenkette?</summary>

Weil der Aufrufer direkt ein spielbereites Objekt braucht (`.play(scanner)`),
nicht erst noch selbst entscheiden muss, welche Unterklasse zu welcher
Eingabe gehört - die Entscheidung ist an einer Stelle gebündelt.

</details>

---

## Schwierigkeit auswählen und Runde starten

```java
private static GuessingGame chooseDifficulty(Scanner scanner) {
    System.out.print("Choose difficulty - 1 = easy, 2 = hard: ");
    String input = scanner.nextLine().trim();

    return switch (input) {
        case "2" -> new HardGuessingGame();
        default -> new EasyGuessingGame();
    };
}
```

```java
Scanner scanner = new Scanner(System.in);
GuessingGame game = chooseDifficulty(scanner);
int attempts = game.play(scanner);
System.out.println("You needed " + attempts + " attempts.");
```

- `default -> new EasyGuessingGame()` sorgt dafür, dass jede nicht "2"
  lautende Eingabe (auch eine leere) zu "easy" führt, statt das Programm
  mit einer unbehandelten Eingabe abstürzen zu lassen.
- `scanner.nextLine()` statt `nextInt()`, weil hier eine einzelne Zeile
  (Text) statt einer Ganzzahl erwartet wird.

**Checkpoint:** Eingabe "2" startet ein `HardGuessingGame`, jede andere
Eingabe ein `EasyGuessingGame`.

Weiter geht es mit Lab 12.2: Code-Review und letzte Verbesserungen.
