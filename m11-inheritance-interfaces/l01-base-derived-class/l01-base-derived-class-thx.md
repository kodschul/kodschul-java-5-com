# Modul 11: Vererbung und Interfaces

## Lab 11.1 – Basisklasse und abgeleitete Klassen

---

## Lab-Ziel

Nach diesem Lab leitest du von einer Basisklasse zwei Unterklassen ab, die
unterschiedliche Konstruktor-Parameter an die Basisklasse weiterreichen.

**Leitfragen:**

<details>
<summary>Was bedeutet extends GuessingGame?</summary>

Die Unterklasse übernimmt alle Attribute und Methoden der Basisklasse
(`GuessingGame`) und kann sie erweitern oder überschreiben, statt alles neu
zu schreiben.

</details>

<details>
<summary>Wozu dient der super(...)-Aufruf im Konstruktor der Unterklasse?</summary>

Er ruft den Konstruktor der Basisklasse auf und übergibt die konkreten
Werte für diese Unterklasse (z. B. Zahlenbereich und Versuchsanzahl), ohne
den Basisklassen-Code zu duplizieren.

</details>

---

## Basisklasse mit protected Attributen

```java
public class GuessingGame {

    protected final int upperBound;
    protected final int maxAttempts;
    private final int targetNumber;
    private int attemptsNeeded;

    public GuessingGame(int upperBound, int maxAttempts) {
        this.upperBound = upperBound;
        this.maxAttempts = maxAttempts;
        this.targetNumber = (int) (Math.random() * upperBound) + 1;
        this.attemptsNeeded = 0;
    }

    // play(scanner) wie in Modul 10, jetzt mit upperBound statt fest 100
}
```

## Zwei Unterklassen für Schwierigkeitsgrade

```java
public class EasyGuessingGame extends GuessingGame {
    public EasyGuessingGame() {
        super(50, 12); // kleinerer Zahlenbereich, mehr Versuche
    }
}

public class HardGuessingGame extends GuessingGame {
    public HardGuessingGame() {
        super(200, 6); // größerer Zahlenbereich, weniger Versuche
    }
}
```

- `protected` erlaubt Unterklassen den Zugriff auf `upperBound`/`maxAttempts`,
  ohne sie öffentlich (`public`) für alle zu machen.
- Beide Unterklassen rufen denselben Basiskonstruktor mit unterschiedlichen
  Werten auf - die eigentliche Spiellogik bleibt in `GuessingGame`.

**Checkpoint:** `new EasyGuessingGame()` und `new HardGuessingGame()`
erzeugen jeweils funktionierende Spiele mit unterschiedlichem
Zahlenbereich und Versuchsanzahl.

Weiter geht es mit Lab 11.2: Methoden mit `@Override` anpassen.
