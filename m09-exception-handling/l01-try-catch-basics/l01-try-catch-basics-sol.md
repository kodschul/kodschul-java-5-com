# Lab 9.1 – Lösung: try-catch-Grundlagen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Scanner;

public class TryCatchBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program continues.");
        scanner.close();
    }
}
```

## Begründung

Der `catch`-Block reagiert konkret auf den Fehlerfall (Meldung statt
Absturz), anstatt die Exception nur stillschweigend zu ignorieren - eine
leere `catch`-Klausel wäre irreführend, weil sie den Fehler verschweigt.

## Ausblick

Lab 9.2 behandelt eine andere, für ZahlenJagd relevante Fehlerart:
nicht-numerische Eingaben.
