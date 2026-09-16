# Lab 10.1 – Lösung: Klassen, Attribute, Konstruktoren

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class Player {

    String name;
    int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }

    boolean hasMoreAttemptsThan(Player other) {
        return this.attempts > other.attempts;
    }
}
```

```java
public class PlayerDemo {

    public static void main(String[] args) {
        Player player1 = new Player("Anna", 4);
        Player player2 = new Player("Ben", 7);
        Player player3 = new Player("Cem", 2);

        System.out.println(player1.name + ": " + player1.attempts);
        System.out.println(player2.name + ": " + player2.attempts);
        System.out.println(player3.name + ": " + player3.attempts);

        System.out.println(player2.hasMoreAttemptsThan(player1));
    }
}
```

## Begründung

`hasMoreAttemptsThan` vergleicht `this.attempts` (das aufrufende Objekt)
mit `other.attempts` (das übergebene Objekt) - der Name macht deutlich, in
welche Richtung der Vergleich zeigt.

## Ausblick

Lab 10.2 macht `name` und `attempts` privat und ergänzt Getter, damit sie
nicht direkt von außen verändert werden können.
