# Lab 10.2 – Lösung: Kapselung: private Felder, Getter/Setter

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class Player {

    private final String name;
    private final int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }
}
```

```java
public class PlayerDemo {

    public static void main(String[] args) {
        Player player1 = new Player("Anna", 4);
        Player player2 = new Player("Ben", 7);

        System.out.println(player1.getName() + ": " + player1.getAttempts());
        System.out.println(player2.getName() + ": " + player2.getAttempts());
    }
}
```

## Zusatz

```java
public class MutableCounter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}
```

## Begründung

`MutableCounter` bietet bewusst keinen `setCount(int value)` an: der
Zählerstand darf nur um kontrollierte Schritte (`increment()`) verändert
werden, nicht auf einen beliebigen Wert von außen gesetzt werden.

## Ausblick

Lab 10.3 wendet dieses Kapselungsmuster auf die komplette ZahlenJagd-Logik
an.
