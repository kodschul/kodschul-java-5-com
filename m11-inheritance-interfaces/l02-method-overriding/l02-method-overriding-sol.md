# Lab 11.2 – Lösung: Methoden mit @Override anpassen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m11-inheritance/GuessingGame.java`,
`EasyGuessingGame.java` und `HardGuessingGame.java`:

```java
public class GuessingGame {
    // Attribute und Konstruktor wie in Lab 11.1

    @Override
    public String toString() {
        return "GuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
```

```java
public class EasyGuessingGame extends GuessingGame {

    public EasyGuessingGame() {
        super(50, 12);
    }

    @Override
    public String toString() {
        return "EasyGuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
```

```java
public class HardGuessingGame extends GuessingGame {

    public HardGuessingGame() {
        super(200, 6);
    }

    @Override
    public String toString() {
        return "HardGuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
```

## Begründung

Jede `toString()`-Methode greift auf die `protected`-Felder `upperBound`
und `maxAttempts` der Basisklasse zu - der Zugriff funktioniert, weil die
Unterklassen von `GuessingGame` erben.

## Ausblick

Lab 11.3 führt `Comparable<Player>` ein, damit eine Liste von Spielern
direkt sortiert werden kann.
