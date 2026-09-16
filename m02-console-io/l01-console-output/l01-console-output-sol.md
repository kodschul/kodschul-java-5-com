# Lab 2.1 – Lösung: Ausgeben mit System.out

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Aufgabe 1+2

```java
public class ConsoleOutputPractice {
    public static void main(String[] args) {
        System.out.println("Anna");
        System.out.println("ZahlenJagd");

        System.out.print("Anna");
        System.out.print(" likes ZahlenJagd\n");

        // Aufgabe 3
        int score = 87;
        double average = 3.5;
        System.out.printf("Score: %d, Average: %.2f%n", score, average);

        // Aufgabe 4: %d erwartet eine ganze Zahl. Mit einem double-Wert wirft
        // printf eine IllegalFormatConversionException zur Laufzeit.
    }
}
```

## Checkpoint-Ergebnis

```
Anna
ZahlenJagd
Anna likes ZahlenJagd
Score: 87, Average: 3.50
```

## Erweiterung

```java
System.out.printf("%s scored %d with an average of %.2f%n", "Anna", score, average);
```

## Alternative

Statt `printf` kann Aufgabe 3 auch mit String-Verkettung gelöst werden
(`"Score: " + score + ", Average: " + average`), ist aber weniger präzise
bei der Nachkommastellen-Formatierung.
