# Lab 4.3 – Lösung: ZahlenJagd-Auswertung und Schwierigkeitsgrad

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Scanner;

public class GuessEvaluation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose difficulty - 1 = easy, 2 = hard: ");
        String difficultyInput = scanner.nextLine();
        String difficultyLabel = switch (difficultyInput) {
            case "1" -> "easy";
            case "2" -> "hard";
            default -> "medium";
        };
        System.out.println("Difficulty: " + difficultyLabel);

        int targetNumber = (int) (Math.random() * 100) + 1;
        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        if (guess == targetNumber) {
            System.out.println("Correct! The number was " + targetNumber + ".");
        } else if (guess < targetNumber) {
            System.out.println("Too low.");
        } else {
            System.out.println("Too high.");
        }

        scanner.close();
    }
}
```

## Begründung

`scanner.nextLine()` wird für die Schwierigkeitsgrad-Eingabe verwendet
(Text), `scanner.nextInt()` für den Ratewert (Zahl) - beide Lesearten
werden hier bewusst nacheinander, nicht gemischt in derselben Zeile
verwendet, um das Scanner-Puffer-Problem aus Modul 12 zu vermeiden.

## Ausblick

Modul 5 ersetzt den einzelnen Ratewert-Versuch durch eine Schleife mit
mehreren Versuchen.
