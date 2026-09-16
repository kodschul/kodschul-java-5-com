# Lab 12.1 – Lösung: Alle Bausteine zusammenführen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GuessingGame game = chooseDifficulty(scanner);
        int attempts = game.play(scanner);
        System.out.println("You needed " + attempts + " attempts.");

        scanner.close();
    }

    private static GuessingGame chooseDifficulty(Scanner scanner) {
        System.out.print("Choose difficulty - 1 = easy, 2 = hard: ");
        String input = scanner.nextLine().trim();

        return switch (input) {
            case "2" -> new HardGuessingGame();
            default -> new EasyGuessingGame();
        };
    }
}
```

## Begründung

Der Rückgabetyp von `chooseDifficulty` ist `GuessingGame` (die Basisklasse),
nicht `EasyGuessingGame`/`HardGuessingGame` - dank Polymorphie kann die
Methode wahlweise das eine oder das andere Objekt zurückgeben, und der
Aufrufer muss den konkreten Typ nicht kennen.

## Ausblick

Lab 12.2 sieht sich diesen Code kritisch an und verbessert ihn, bevor in
Lab 12.3 die Wiederholungsschleife und Highscore-Liste ergänzt werden.
