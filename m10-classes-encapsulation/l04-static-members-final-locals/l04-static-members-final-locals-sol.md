# Lab 10.4 – Lösung: Statische Felder/Methoden und lokale final-Variablen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class Player {

    private static int playerCount = 0;

    public static final int MAX_ATTEMPTS = 10;

    private final String name;
    private final int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
        playerCount++;
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

    public static void printSummary(Player player) {
        final int bonusPoints = 5;
        // bonusPoints = 10; // Compile-Fehler: final darf nur einmal zugewiesen werden

        int totalScore = player.getAttempts() + bonusPoints;
        System.out.println(player.getName() + ": " + totalScore + " points");
    }
}
```

```java
public class PlayerDemo {

    public static void main(String[] args) {
        Player player1 = new Player("Anna", 4);
        Player player2 = new Player("Ben", 7);
        Player player3 = new Player("Cem", 2);

        System.out.println("Total players: " + Player.getPlayerCount());
        System.out.println("Max attempts allowed: " + Player.MAX_ATTEMPTS);

        Player.printSummary(player1);
        Player.printSummary(player2);
        Player.printSummary(player3);
    }
}
```

## Begründung

`playerCount` ist `private static`, weil er zur Klasse gehört und nicht
von außen direkt verändert werden soll - nur `getPlayerCount()` gibt ihn
kontrolliert lesend heraus. `MAX_ATTEMPTS` ist `public static final`, weil
es eine für alle `Player`-Objekte gleiche, unveränderliche Konstante ist,
die auch ohne konkretes Objekt nützlich ist (`Player.MAX_ATTEMPTS`). Die
lokale `final int bonusPoints` in `printSummary()` verhindert, dass der
Wert versehentlich innerhalb der Methode überschrieben wird - ein
zweiter Zuweisungsversuch führt zu einem Compile-Fehler.

## Ausblick

Modul 11 baut `Player` zu einer Vererbungshierarchie
(`EasyGuessingGame`/`HardGuessingGame`) aus und führt das Interface
`Comparable` ein.
