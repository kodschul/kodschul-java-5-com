# Modul 10: Klassen, Objekte und Kapselung

## Lab 10.4 – Statische Felder/Methoden und lokale final-Variablen

---

## Lab-Ziel

Nach diesem Lab weißt du, wann ein Feld oder eine Methode `static` sein
sollte (gehört zur Klasse, nicht zu einem einzelnen Objekt) und wie
`final` auf einer lokalen Variablen innerhalb einer Methode wirkt.

**Leitfragen:**

<details>
<summary>Was ist der Unterschied zwischen einem Instanzfeld und einem static-Feld?</summary>

Ein Instanzfeld (z. B. `name`) existiert pro Objekt einzeln - jedes
`Player`-Objekt hat seinen eigenen Namen. Ein `static`-Feld existiert genau
einmal pro Klasse und wird von allen Objekten geteilt, z. B. ein Zähler,
wie viele Objekte insgesamt schon erzeugt wurden.

</details>

<details>
<summary>Warum public static final für Konstanten, aber private static für internen Zustand?</summary>

`public static final` macht einen unveränderlichen Wert von außen
lesbar nutzbar (z. B. `Player.MAX_ATTEMPTS`), ohne dass man dafür ein
Objekt braucht. `private static` hält geteilten, aber veränderlichen
Zustand (z. B. einen Zähler) innerhalb der Klasse verborgen - von außen
nur über eine `public static`-Methode wie `getPlayerCount()` lesbar.

</details>

---

## Ein static-Feld als geteilter Zähler

```java
public class Player {

    private static int playerCount = 0; // gehört der Klasse, nicht einem einzelnen Player

    public static final int MAX_ATTEMPTS = 10; // Konstante, für alle Player gleich

    private final String name;
    private final int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
        playerCount++; // jedes neue Objekt erhöht den geteilten Zähler
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public static int getPlayerCount() {
        return playerCount;
    }
}
```

```java
Player player1 = new Player("Anna", 4);
Player player2 = new Player("Ben", 7);

System.out.println("Erzeugte Player: " + Player.getPlayerCount()); // 2
System.out.println("Max. Versuche: " + Player.MAX_ATTEMPTS);
```

- `playerCount` und `MAX_ATTEMPTS` werden über den Klassennamen
  (`Player.getPlayerCount()`, `Player.MAX_ATTEMPTS`) angesprochen, nicht
  über ein einzelnes Objekt - `player1.getPlayerCount()` würde zwar auch
  funktionieren, ist aber irreführend, da der Wert nicht zu `player1`
  allein gehört.
- `public static void main(...)` ist selbst so ein Beispiel: eine
  static-Methode, die ohne Objekt aufrufbar sein muss, damit die JVM das
  Programm überhaupt starten kann.

## Eine lokale final-Variable

```java
public static void printSummary(Player player) {
    final int bonusPoints = 5; // wird einmal berechnet, danach nie wieder verändert

    int totalScore = player.getAttempts() + bonusPoints;
    System.out.println(player.getName() + ": " + totalScore + " Punkte");

    // bonusPoints = 10; // Compile-Fehler: final darf nur einmal zugewiesen werden
}
```

- `final` auf einer lokalen Variablen bedeutet: nach der ersten Zuweisung
  darf ihr Wert nicht mehr geändert werden - der Compiler verhindert ein
  versehentliches Überschreiben.
- Das ist dasselbe Prinzip wie bei `private final` auf einem Feld
  (Lab 10.2), nur auf eine einzelne Methode statt auf ein ganzes Objekt
  begrenzt.

**Checkpoint:** `Player.getPlayerCount()` liefert nach der Erzeugung von
zwei `Player`-Objekten den Wert `2`, ohne dass dafür ein `Player`-Objekt
existieren muss.

Weiter geht es mit Modul 11: Vererbung und Interfaces.
