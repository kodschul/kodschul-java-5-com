# Lab 9.2 – Lösung: Ungültige Eingaben behandeln

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidInputHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a number: ");
            try {
                int guess = scanner.nextInt();
                System.out.println("You entered: " + guess);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("That wasn't a number. Please enter a whole number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
```

## Begründung

`validInput` steuert die Schleife: sie wird erst auf `true` gesetzt, wenn
tatsächlich eine gültige Zahl gelesen wurde - der `catch`-Block lässt sie
absichtlich `false`, damit die Schleife erneut versucht.

## Ausblick

Lab 9.3 baut genau diese Absicherung in die ZahlenJagd-Rateschleife aus
Modul 6 ein.
