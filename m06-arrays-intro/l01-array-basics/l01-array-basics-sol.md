# Lab 6.1 – Lösung: Warum ein Array? Deklaration und Zugriff

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class ArrayBasics {

    public static void main(String[] args) {
        int[] scores = new int[5];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;

        System.out.println(scores[2]);
        System.out.println(scores.length);
    }
}
```

## Begründung

`scores.length` liefert die feste Größe des Arrays (5), unabhängig davon,
wie viele Elemente tatsächlich "sinnvoll" befüllt wurden - Java unterscheidet
nicht zwischen "leer" und "mit 0 befüllt" bei `int[]`.

## Zusatz

`scores[5]` wirft eine `ArrayIndexOutOfBoundsException`, da gültige Indizes
nur 0 bis 4 sind (Größe 5). Ohne Abfangen (Modul 9) beendet das das
Programm.

## Ausblick

Lab 6.2 zeigt, wie ein Array typischerweise in einer Schleife statt mit
einzelnen Zuweisungen befüllt wird.
