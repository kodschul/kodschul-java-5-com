# Modul 4: Bedingungen

## Lab 4.1 – if/else-Ketten

---

## Lab-Ziel

Nach diesem Lab wertest du einen Wert mit einer `if`/`else if`/`else`-Kette
in mehr als zwei Fällen aus.

**Leitfragen:**

<details>
<summary>Wie unterscheidet sich eine if/else-if-Kette von mehreren einzelnen if-Blöcken?</summary>

Bei `else if` wird nur die erste zutreffende Bedingung ausgeführt, danach
wird die Kette abgebrochen. Mehrere einzelne `if`-Blöcke werden dagegen
alle geprüft, auch wenn eine frühere Bedingung schon zutraf.

</details>

<details>
<summary>Wann braucht man einen abschließenden else-Zweig?</summary>

Immer dann, wenn ein Fall abgedeckt sein soll, der zu keiner der vorherigen
Bedingungen passt - sonst passiert im "Rest"-Fall einfach nichts.

</details>

---

## Von einer Bedingung zu drei Fällen

Lab 3.2 hat nur geprüft, ob ein Ratewert korrekt war:

```java
if (guess == targetNumber) {
    System.out.println("Correct! The number was " + targetNumber + ".");
} else {
    System.out.println("Wrong. The number was " + targetNumber + ".");
}
```

Jetzt soll das Ergebnis genauer sein: richtig, zu niedrig oder zu hoch.

```java
if (guess == targetNumber) {
    System.out.println("Correct! The number was " + targetNumber + ".");
} else if (guess < targetNumber) {
    System.out.println("Too low.");
} else {
    System.out.println("Too high.");
}
```

- Die dritte Bedingung (`guess > targetNumber`) muss nicht mehr explizit
  geschrieben werden - der `else`-Zweig deckt automatisch den letzten
  verbleibenden Fall ab.
- Die Reihenfolge der Bedingungen ist wichtig: `guess == targetNumber` muss
  zuerst geprüft werden, sonst würde sie nie erreicht.

**Checkpoint:** Für drei Testwerte (zu niedrig, genau richtig, zu hoch)
gibt dein Code jeweils die passende Meldung aus.

Weiter geht es mit Lab 4.2: `switch-case` für Mehrfachauswahl.
