# Lab 11.1 – Lösung: Basisklasse und abgeleitete Klassen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m11-inheritance/GuessingGame.java`,
`EasyGuessingGame.java` und `HardGuessingGame.java`:

```java
import java.util.InputMismatchException;
import java.util.Scanner;

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

    public int play(Scanner scanner) {
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and " + upperBound + ": ");

            try {
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Correct! The number was " + targetNumber + ".");
                    attemptsNeeded = attempt;
                    return attemptsNeeded;
                } else if (guess < targetNumber) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }

                attempt++;
            } catch (InputMismatchException e) {
                System.out.println("That wasn't a number. Please enter a whole number.");
                scanner.next();
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        attemptsNeeded = maxAttempts + 1;
        return attemptsNeeded;
    }

    public int getAttemptsNeeded() {
        return attemptsNeeded;
    }
}
```

```java
public class EasyGuessingGame extends GuessingGame {
    public EasyGuessingGame() {
        super(50, 12);
    }
}
```

```java
public class HardGuessingGame extends GuessingGame {
    public HardGuessingGame() {
        super(200, 6);
    }
}
```

## Begründung

`protected` statt `private` bei `upperBound`/`maxAttempts` ist nötig, weil
Modul 11.2 diese Felder in `toString()`-Overrides der Unterklassen
verwenden wird - `private` würde den Zugriff aus der Unterklasse heraus
verhindern.

## Ausblick

Lab 11.2 überschreibt `toString()` in den Unterklassen, um sie
unterscheidbar auszugeben.
