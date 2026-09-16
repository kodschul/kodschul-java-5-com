# Lab 4.2 – Lösung: switch-case für Mehrfachauswahl

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Scanner;

public class DifficultySelector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose difficulty - 1 = easy, 2 = hard: ");
        String difficultyInput = scanner.nextLine();

        String difficultyLabel = switch (difficultyInput) {
            case "1" -> "easy";
            case "2" -> "hard";
            case "3" -> "expert";
            default -> "medium";
        };

        System.out.println("Difficulty: " + difficultyLabel);
        scanner.close();
    }
}
```

## Begründung

`default` steht bewusst am Ende und fängt jede nicht explizit genannte
Eingabe ab (auch leere Eingabe oder Tippfehler), statt das Programm ohne
Ergebnis durchlaufen zu lassen.

## Zusatz

Der Fall `"3"` -> `"expert"` zeigt, wie einfach ein `switch`-Ausdruck um
weitere feste Fälle erweitert werden kann, ohne bestehende Zweige
anzupassen.

## Ausblick

Modul 12 nutzt genau dieses Muster, um zwischen `EasyGuessingGame` und
`HardGuessingGame` zu wählen.
