# Lab 2.2 – Lösung: Einlesen mit Scanner

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Aufgaben 1-4

```java
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        scanner.nextLine(); // clears the leftover line break from nextInt()

        System.out.print("Comment: ");
        String comment = scanner.nextLine();
        System.out.println("You said: " + comment);

        scanner.close();
    }
}
```

## Ohne Puffer-Fix (Aufgabe 3, zum Vergleich)

Ohne die Zeile `scanner.nextLine();` nach `age` würde die anschließende
`nextLine()`-Zeile sofort einen leeren String liefern, statt auf die
Kommentar-Eingabe zu warten - der Prompt "Comment: " würde übersprungen
wirken.

## Alternative

Statt `nextLine()` zum Leeren zu nutzen, kann man auch konsequent überall
`nextLine()` einlesen und Zahlen selbst mit `Integer.parseInt(...)`
umwandeln - das vermeidet die Falle komplett, wird aber erst in Modul 9
(Exceptions bei ungültigen Eingaben) sauber abgesichert.
