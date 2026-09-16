# Lab 12.3 – Lösung: Die fertige ZahlenJagd-Anwendung

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m12-final/GuessingGameApp.java`
(sowie unverändert `GuessingGame.java`, `EasyGuessingGame.java`,
`HardGuessingGame.java`, `Player.java` aus Modul 11):

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> highscores = new ArrayList<>();

        boolean playAgain = true;
        while (playAgain) {
            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            GuessingGame game = chooseDifficulty(scanner);
            int attempts = game.play(scanner);
            highscores.add(new Player(name, attempts));

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
        }

        Collections.sort(highscores);
        System.out.println("\nHighscore list (best attempt count first):");
        for (Player player : highscores) {
            System.out.println(player);
        }

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

`highscores.add(new Player(name, attempts))` fügt nach jeder Runde genau
einen neuen, unveränderlichen `Player`-Eintrag hinzu - die gesamte
Sortierung erfolgt bewusst erst einmalig am Ende (`Collections.sort`),
nicht nach jeder einzelnen Runde, da sie ohnehin erst zum Schluss
ausgegeben wird.

## Ausblick

Damit ist ZahlenJagd fertig. Am Nachmittag von Tag 5 stellst du deine
Version vor und blickst mit der Gruppe auf den gesamten Kurs zurück.
