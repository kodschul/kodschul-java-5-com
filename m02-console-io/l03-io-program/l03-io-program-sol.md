# Lab 2.3 – Lösung: Das erste Ein-/Ausgabe-Programm

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit `output/project/starter/ConsoleInputOutput.java`:

```java
import java.util.Scanner;

public class ConsoleInputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.printf("Hello %s, you are %d years old.%n", name, age);

        scanner.close();
    }
}
```

## Begründung zur Reihenfolge

`nextLine()` wird hier zuerst aufgerufen, bevor `nextInt()` überhaupt
Zeilenumbrüche im Puffer hinterlassen kann - deshalb ist an dieser Stelle
kein zusätzlicher Puffer-Fix nötig. Sobald nach `nextInt()` noch eine
`nextLine()` folgen würde (siehe Lab 2.2), wäre der Fix wieder erforderlich.

## Ausblick

Dieser Code ist der `starter/`-Zustand für Modul 3: Dort wird `age` durch
eine Zufallszahl (`targetNumber`) und der Kommentar durch einen Ratewert
(`guess`) ersetzt, verpackt in eine eigene Methode.
