# Lab 12.2 – Lösung: Code-Review und letzte Verbesserungen

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

        System.out.print("Play again? (yes/no): ");
        boolean playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
        System.out.println("Play again answer accepted: " + playAgain);

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

`.trim().equalsIgnoreCase("yes")` ist robuster als ein reiner
`.equals("yes")`-Vergleich, weil Nutzereingaben in der Praxis selten exakt
kleingeschrieben und ohne Leerzeichen erfolgen - dieselbe Robustheit wurde
bereits bei `chooseDifficulty` durch `.trim()` auf der Eingabe angewendet.

## Ausblick

Lab 12.3 nutzt genau dieses `playAgain`-Muster für eine echte
Wiederholungsschleife mit Highscore-Liste.
