# Lab 8.3 – Lösung: Highscore-Liste (Array, dann ArrayList)

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m08-arraylist/GuessingGame.java`
und
`output/project/checkpoints/checkpoint-m08-arraylist/HighscoreList.java`:

```java
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int attemptsNeeded = playRound();
        System.out.println("Attempts needed: " + attemptsNeeded);
    }

    static int playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Correct! The number was " + targetNumber + ".");
                return attempt;
            } else if (guess < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        return maxAttempts + 1;
    }
}
```

```java
import java.util.ArrayList;
import java.util.Arrays;

public class HighscoreList {

    public static void main(String[] args) {
        String[] highscoreArray = {"Anna:4", "Ben:7", "Cem:2", "Dana:9"};
        Arrays.sort(highscoreArray, (a, b) -> attempts(a) - attempts(b));
        System.out.println("Highscore list (array, fixed size): " + Arrays.toString(highscoreArray));

        ArrayList<String> highscoreList = new ArrayList<>();
        highscoreList.add("Anna:4");
        highscoreList.add("Ben:7");
        highscoreList.add("Cem:2");
        highscoreList.add("Dana:9");
        highscoreList.add("Elif:3");

        highscoreList.sort((a, b) -> attempts(a) - attempts(b));
        System.out.println("Highscore list (ArrayList, dynamic): " + highscoreList);
    }

    static int attempts(String entry) {
        String[] parts = entry.split(":");
        return Integer.parseInt(parts[1]);
    }
}
```

## Begründung

`maxAttempts + 1` als Rückgabewert für "nicht geschafft" ist ein bewusster
Sonderwert außerhalb des gültigen Bereichs (1 bis `maxAttempts`) - so lässt
sich später leicht unterscheiden, ob jemand tatsächlich getroffen hat.

## Ausblick

Modul 11 ersetzt das Textformat `"Name:Versuche"` durch eine eigene Klasse
`Player`, die über `Comparable` sauber sortierbar ist.
