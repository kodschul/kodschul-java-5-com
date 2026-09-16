# Modul 12: Projektabschluss

## Lab 12.3 – Die fertige ZahlenJagd-Anwendung

---

## Lab-Ziel

Nach diesem Lab ist ZahlenJagd fertig: Schwierigkeitsgrad wählen, beliebig
oft spielen, jede Runde in einer Highscore-Liste sammeln und sortiert
ausgeben - mit Fehlerbehandlung für ungültige Eingaben.

**Leitfragen:**

<details>
<summary>Warum wird der Name pro Spielrunde statt einmal am Programmstart erfragt?</summary>

Damit auch ein Namenswechsel zwischen zwei Runden möglich ist (z. B. wenn
mehrere Personen abwechselnd spielen) - jede Runde erzeugt einen eigenen
`Player`-Eintrag.

</details>

<details>
<summary>Wie hängen while (playAgain), chooseDifficulty und die Highscore-Liste zusammen?</summary>

Die `while`-Schleife wiederholt: Name abfragen → Schwierigkeit wählen →
Runde spielen → Ergebnis als `Player` in die `ArrayList<Player>`
aufnehmen. Nach der Schleife wird die gesamte Liste einmalig mit
`Collections.sort` sortiert ausgegeben.

</details>

---

## Die komplette Anwendung

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

- `Collections.sort(highscores)` funktioniert direkt, weil `Player`
  bereits `Comparable<Player>` implementiert (Modul 11).
- Fehlerhafte Eingaben während `game.play(scanner)` werden bereits in
  `GuessingGame` selbst behandelt (Modul 9) - hier ist nichts weiter nötig.

**Checkpoint:** Du kannst mehrere Runden mit unterschiedlichen Namen und
Schwierigkeitsgraden spielen; am Ende erscheint eine korrekt sortierte
Highscore-Liste.

Weiter geht es mit der Projektpräsentation und dem Kursrückblick (Tag 5,
Nachmittag).
